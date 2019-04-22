void setup(){
  size(500, 500);
  background(50,23,100);
};

void draw(){
  rainCreate();
  fill(0, 85, 255);
stroke(0, 0, 0);
ellipse(xValue, 0, 20, 35);

};

void rainCreate(){
   int xValue = (int)random(20,230);
};


void rainFall(){
  
};