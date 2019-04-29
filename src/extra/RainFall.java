void setup(){
  size(500, 500);
  background(50,23,100);
};
int xValue = (int)random(20,230);

void draw(){
  rainCreate();
  fill(50,23,100);
  rect(0,0,500,500);
  int xxValue = (int)random(20,480);
  fill(0, 85, 255);
  stroke(0, 0, 0);
  rainFall(xxValue);
};

void rainCreate(){
   
};


void rainFall(){
  fill(50,23,100);
  rect(0,0,500,500);
  fill(0, 85, 255);
  ellipse(xValue, 0, 20, 35);
};
