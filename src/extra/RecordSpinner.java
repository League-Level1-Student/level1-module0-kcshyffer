PImage pictureOfRecord;     //as member variable

int angle = 0;

void setup(){
 
size(1920,1080);     //in setup method  
pictureOfRecord = loadImage("vinyl-record.png");     //in setup method  

pictureOfRecord.resize(600, 600);     //in setup method

song = loadSound  
}
  
void draw(){
  if(mousePressed){
  rotateImage(pictureOfRecord, angle);
  image(pictureOfRecord, 0, 0);
  angle += 2;}
  song.play();
  song.pause();
  }
    
void rotateImage(PImage image, int amountToRotate) {
     translate(width/2, height/2);
     rotate(amountToRotate*TWO_PI/360);
     translate(-image.width/2, -image.height/2);
}