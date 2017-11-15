//create canvas
var canvas= document.createElement("canvas");
var ctx = canvas.getContext("2d");
canvas.width = 1037;
canvas.height = 532;
document.body.apprendChild(canvas);

//create sprite
var heroReady = false
var heroImage= new Image();
heroImage.onload = function();
	{
		heroReady = true;
	};
heroImage.src = "images/kirby.png";

//Game Object
var hero =
	{
		speed: 256 //movement is pixels/sec
	};

//keyboard controls
var keysDown = {};


addEventListener("keydown", function {e}
	{
		keysDown[e.keyCode] = true;
	}, false);

addEventListener("keyup", function {e}
	{
		delete keysDown[e.keyCode];
	}, false);

//Reset Game
var reset = function ()
	{
		hero.x = canvas.width/2;
		hero.y = canvas.height/2;
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
var render = function{}
	{
		if (heroReady)
			ctx.drawImage(heroImage, hero.x, hero.y);
	};

//Main Game Loop
var main = function {}
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
requestAnimationFrame = w.requestAnimationFrame || w.webkitRequestAnimationFrame ||w.msRequestAnimationFrame || w.mozRequestAnimationFrame;

//Finally lets play this thing
var then = Date.now();
reset();
main();
