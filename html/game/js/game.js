/**
Kim Luong
Computer Science Pre-AP
Period 3

Assignment: MidTerm Exam (Game)
   Create a collectible game. The game must have a hero, a monster, and a collectible object. 
   There also must be a win and lose screen and sound effects.
	My game has a panda as a hero. You have to collect at least 10 bamboo sprites in order to have enough energy to defeat the monster. 
	If the monster, the dragon, catches you 3 times before you get enough energies, you lose. 
	If not and you were able to collect 10 bamboo sprites, you must catch the monster 5 times to win.
*/

//create canvas
var canvas= document.createElement("canvas");
var ctx = canvas.getContext("2d");

canvas.width = 512;
canvas.height = 480;
document.body.appendChild(canvas);

//boolean
var stageOne = false;
var stageTwo = false;
var onePlay = false;
var win = false;
var lose = false;

//Create Sprite
var heroReady = false;
var heroImage= new Image();
heroImage.onload = function()
	{
		heroReady = true;
	};
heroImage.src = "images/pandaPiskel.png";

//create Monster
var monsterReady = false;
var monsterImage = new Image();
monsterImage.onload = function()
	{
		monsterReady = true;
	};
monsterImage.src = "images/dragonPiskel.png";

//create Collect
var objectReady = false;
var objectImage = new Image();
objectImage.onload = function()
	{
		objectReady = true;
	};
objectImage.src = "images/BambooPiskel.png";

//Background Image
var bgReady = false;
var bgImage = new Image();
bgImage.onload = function()
	{
		bgReady = true;
	};
bgImage.src = "images/bgPiskels.png";

//Win screen
var winReady = false;
var winImage = new Image();
winImage.onload = function()
	{
		winReady = true;
	};
winImage.src = "images/winScreen.png";

//Lose screen
var loseReady = false;
var loseImage = new Image();
loseImage.onload = function()
	{
		loseReady = true;
	};
loseImage.src = "images/loseScreen.png";

//sound
var mySound= new Audio("sounds/bite.mp3"); //eat sound
var myMusic = new Audio("sounds/bgmusic.mp3"); //bg sound
var mySounds = new Audio("sounds/roar.mp3"); //attack monster sound
var myAudio = new Audio("sounds/victory.mp3"); //winning sound on win screen
var myAudios = new Audio("sounds/lose.mp3"); //lossing sound on lose screen

//Game Object
var hero =
	{
		speed: 256 //movement is pixels/sec
	};

//object
var object = {};
var objectCaught = 0;

//monster
var monster = {};
var monsterCaught = 0;

//keyboard controls
var keysDown = {};


addEventListener("keydown", function (e)
	{
		keysDown[e.keyCode] = true;
	}, false);

addEventListener("keyup", function (e)
	{
		delete keysDown[e.keyCode];
	}, false);

//Reset Game
var reset = function ()
	{
		hero.x = canvas.width/2;
		hero.y = canvas.height/2;
 
//Put object randomly on canvas		
if (objectCaught < 10)
{
	object.x = 125 + (Math.random() * (canvas.width-350));
	object.y = 125 + (Math.random() * (canvas.height-350));
}
else 
{
	//renderFight();
	object.x = canvas.width + 200;
	object.y = canvas.height + 200;
	stageOne = true;
}	

//put monster randomly on canvas within stage1
if (monsterCaught < 3 && stageOne == false)
{
	monster.x = 150 + (Math.random() * (canvas.width-300));
	monster.y = 150 + (Math.random() * (canvas.height-300));
}
else if(monsterCaught >= 3 && stageOne == false)
{
	//renderLose();
	monster.x = canvas.width + 200;
	monster.y = canvas.height + 200;

	object.x = canvas.width + 200;
	object.y = canvas.width + 200;
}
	};

var checkFight = function() 
{
	if(objectCaught>=10) {
		ctx.fillStyle = "rgb(10,10,10)";
		ctx.font = "24px Helvetica";
		ctx.textAlign = "center";
		ctx.textBaseline = "top";
		ctx.strokeText("Let's Go!", canvas.width/2, canvas.height/2);
		ctx.fillText("Let's Go!", canvas.width/2, canvas.height/2);
		stageOne = true;//finished stage one
}
};

var checkLose = function()
{
	if(monsterCaught>=3 && stageOne == false) {
		monster.x = canvas.width + 200;
		monster.y = canvas.height + 200;
		object.x = canvas.width + 200;
		object.y = canvas.width + 200;
		myMusic.volume = 0;  //stops music when lost
		if(onePlay == false) {
			myAudios.play();  //sad trombone sound
		}
		ctx.fillStyle = "rgb(139,0,0)";
		ctx.font = "24px Helvetica";
		ctx.textAlign = "center";
		ctx.textBaseline = "top";
		ctx.strokeText("You Lose!", canvas.width/2, canvas.height/2);
		ctx.fillText("You Lose!", canvas.width/2, canvas.height/2);
		onePlay = true;
		lose = true;
} 
};

var stageTworeset = function()
{
	hero.x = canvas.width/2;
	hero.y = canvas.height/2;

//Put monster randomly on canvas stage1		
if (monsterCaught < 5)
{
	monster.x = 150 + (Math.random() * (canvas.width-200));
	monster.y = 150 + (Math.random() * (canvas.height-200));
}
else 
{
	//renderWin();
	monster.x = canvas.width + 200;
	monster.y = canvas.height + 200;
	stageTwo = true;
}
};

var checkWin = function()
{
	if(monsterCaught>=5) {
		ctx.clearRect(0,0, canvas.width, canvas.height);
		myMusic.volume = 0;
		render();
		if(onePlay == false) {
			myAudio.play();  //start victory music
		}
		ctx.fillStyle = "rgb(0,255,0)";
		ctx.font = "24px Helvetica";
		ctx.textAlign = "center";
		ctx.textBaseline = "top";
		ctx.strokeText("You Win!", canvas.width/2, canvas.height/2);
		ctx.fillText("You Win!", canvas.width/2, canvas.height/2);
		onePlay = true;
		win = true;
} 
};

//Update game objects
var update = function(modifier)
	{
		if (38 in keysDown) //holding up
		{
			hero.y -= hero.speed * modifier;
		}
		if (40 in keysDown) //holding down
		{
			hero.y += hero.speed * modifier;
		}
		if (37 in keysDown) //holding left
		{
			hero.x -= hero.speed * modifier;
		}
		if (39 in keysDown) //holding right
		{
			hero.x += hero.speed * modifier;
		}
	//Are they touching?
		//object & hero
		if (
			hero.x <= (object.x + 22)
			&& object.x <= (hero.x + 22)
			&& hero.y <= (object.y + 22)
			&& object.y <= (hero.y + 22)
		)
		{
			mySound.play();   //sound when object is collected
			++objectCaught;
			reset ();
		}
		//monster & hero win
		if (
			hero.x <= (monster.x + 22)
			&& monster.x <= (hero.x + 22)
			&& hero.y <= (monster.y + 22)
			&& monster.y <= (hero.y + 22)
			&& stageTwo == false
		)
		{
			mySounds.play(); 
			++monsterCaught;
			//reset();
			stageTworeset();
		} 
		//monster & hero lose
		 if (hero.x <= (monster.x + 32)
			&& monster.x <= (hero.x + 32)
			&& hero.y <= (monster.y + 32)
			&& monster.y <= (hero.y + 32)
			&& stageOne == false
		)
		{
			mySounds.play();   //sound when monster caught
			++monsterCaught;
			reset ();
			
		}
	};

//Draw everything
var render = function ()
	{
		if (bgReady)
		{
			if (win == false && lose == false) {
				ctx.drawImage(bgImage,0,0);
			} else if(win == true && lose == false) {
				ctx.drawImage(winImage,0,0);
			} else if(win == false && lose == true) {
				ctx.drawImage(loseImage,0,0)
			}
		}
		if (heroReady)
		{
			ctx.drawImage(heroImage, hero.x, hero.y);
		}
		if (objectReady)
		{
			ctx.drawImage(objectImage, object.x, object.y);
		}
		if(monsterReady)
		{
			ctx.drawImage(monsterImage, monster.x, monster.y);
		}
		//Score
		ctx.fillStyle = "rgb(250,250,250)";
		ctx.font = "24px Helvetica";
		ctx.textAlign = "left";
		ctx.textBaseline= "top";
		ctx.strokeText("Object Caught: " + objectCaught,32,5);
		ctx.fillText("Object Caught: " + objectCaught,32,5);

		ctx.fillStyle = "rgb(250,250,250)";
		ctx.font = "24px Helvetica";
		ctx.textAlign = "left";
		ctx.textBaseline= "top";
		ctx.strokeText("Monsters Caught: " + monsterCaught,250,5);
		ctx.fillText("Monsters Caught: " + monsterCaught,250,5);
	};

//Main Game Loop
var main = function ()
	{
		var now = Date.now();
		var delta = now - then;

		update(delta/1000);
		render();
		checkFight();
		checkLose();
		checkWin();
	
		then = now;

		requestAnimationFrame(main);
	};

//Cross-browser support for requestAnimationFrame
var w = window;
requestAnimationFrame = w.requestAnimationFrame||
			w.webkitRequestAnimationFrame||
			w.msRequestAnimationFrame ||
			w.mozRequestAnimationFrame; 
//Finally lets play this thing
var then = Date.now();
myMusic.play(); //bg music
reset();
stageTworeset();
main();

