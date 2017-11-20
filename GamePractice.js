//create canvas
var canvas= document.createElement("canvas");
var ctx = canvas.getContext("2d");
var ctz = canvas.getContext("2d");
canvas.width = 1037;
canvas.height = 532;
document.body.appendChild(canvas);

//Create Sprite
var heroReady = false;
var heroImage = new Image();
heroImage.onload = function()
	{
		heroReady = true;
	};
heroImage.src = "Images/kirby.png";

//Create Monster
var monsterReady = false;
var monsterImage = new Image();
monsterImage.onload = function()
	{
		monsterReady = true;
	};
monsterImage.src = "Images/monster.png";

//Background Image
var bgReady = false;
var bgImage = new Image();
bgImage.onload = function()
	{
		bgReady = true;
	};
bgImage.src = "Images/GameBackground.png";

//Game Object
var hero =
	{
		speed: 256 //movement is pixels/sec
	};
var monster = 
	{
		speed: 256
	};

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

		monster.x = (Math.random() * (canvas.width-74));
		monster.y = (Math.random() * (canvas.height-74));
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
		}if (37 in keysDown) //holding left
		{
			hero.x -= hero.speed * modifier;
		}if (39 in keysDown) //holding right
		{
			hero.x += hero.speed * modifier;
		}
	};

//Draw everything
var render = function ()
	{
		
		if (bgReady)
		{
			ctx.drawImage(bgImage,0,0);
		}
		if (heroReady)
		{
			ctx.drawImage(heroImage, hero.x, hero.y);
		}
		if (monsterReady)
		{
			ctx.drawImage(monsterImage, monster.x, monster.y);
		}
	};

//Main Game Loop
var main = function ()
	{
		var now = Date.now();
		var delta = now - then;

		update(delta/1000);
		render();
	
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
reset();
main();
