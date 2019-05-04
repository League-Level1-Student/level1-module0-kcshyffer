int score=0;
void checkCatch(int x){
     if (x > mouseX && x < mouseX+100)
          score++;
     else if (score > 0) 
          score--;
     println("Your score is now: " + score); }

void setup(){
  size(500, 500);
  background(50,23,100);
};
int xValue = (int)random(20,230);
  int xxValue = (int)random(500);

int y = 0;
int x = 0;

void draw(){
  rainCreate();
  fill(50,23,100);
  rect(0,0,500,500);
  fill(0, 0, 0);
  textSize(16);
  text("Score: " + score, 20, 20);
  fill(128,128,128);
  rect(mouseX, 450, 50, 70);
  fill(0, 85, 255);
  stroke(0, 0, 0);
  //rainFall(xxValue);
  fill(0, 85, 255);
  ellipse(xxValue, y, 20, 35);
  
  y+=5;
  if (y > 480){
    checkCatch(xxValue);
    y = 0;
    xxValue = (int)random(500);
  }
};

void rainCreate(){
   
};


/**void rainFall(int xValue){
  fill(50,23,100);
  rect(0,0,500,500);
  for(int i=0; i<250; i+=10){
    fill(50,23,100);
    rect(0,0,500,500);
    fill(0, 85, 255);
    ellipse(250, i, 20, 35);
   }*/
    

