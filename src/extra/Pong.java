int ballx = 1;
int bally = 200;
int ballXsp = 5;
int ballYsp = 5;
int paddlex = mouseX;


import ddf.minim.*;
  Minim minim;
  AudioSample sound;

void setup(){
  size(500, 500);
  background(0, 0, 0);
  minim = new Minim (this);
  //sound = minim.loadSample("pong.wav", 128);
}

void draw(){
  fill(0,0,0);
  rect(-1,-1,510,510);
  fill(255, 255, 255);
  stroke(255, 255, 255);
  ellipse(ballx, bally, 5, 5);
  rect(mouseX, 490, 80, 20);
  ballx += ballXsp;
  bally += ballYsp;
  if (ballx <= 1){
   ballXsp = -ballXsp; 
  }
  if (ballx >= 500){
   ballXsp = -ballXsp; 
  }
  if (bally <= 1){
   ballYsp = -ballYsp; 
  }
  if (intersects(ballx, bally, paddlex, 490, 80)){
   ballYsp = -ballYsp; 
   //sound.trigger();
  }
  
  }
   
  boolean intersects(int ballX, int ballY, int paddleX, int paddleY, int paddleLength) {
     if (ballY > paddleY && ballX > paddleX && ballX < paddleX + paddleLength)
          return true;
     else
          return false;
        
    
}