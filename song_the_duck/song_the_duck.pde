import processing.sound.*;
SoundFile file;

void setup() {
  size(640,360);
  background(255);
  
  //load a sound file from the /data folder of the scetch and play it back
  file = new SoundFile(this, "The Duck Song.mp3");
  file.play();
}


void draw()  {
  print("drawing");
}