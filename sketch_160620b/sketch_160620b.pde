  
import processing.video.*;

Capture cam;

void setup() {
  size(640, 480);

  String[] cameras = Capture.list();
  
  if (cameras.length == 0) {
    println("There are no cameras available for capture.");
    exit();
  } else {
    println("Available cameras:");
    for (int i = 0; i < cameras.length; i++) {
      println(cameras[i]);
    }
    
    // The camera can be initialized directly using an 
    // element from the array returned by list():
    cam = new Capture(this, cameras[0]);
    cam.start();     
  }      
}

void draw() {
  if (cam.available() == true) {
    cam.read();
  }
  image(cam, 10, 0);
 

  
ellipse(mouseX+50,mouseY+50,90,90);
ellipse(mouseX+30,mouseY+30,20,20);
ellipse(mouseX+70,mouseY+30,20,20);
ellipse(mouseX+50,mouseY+75,40,40);
  
  if(mousePressed == true)
  {
    line(pmouseX, pmouseY, mouseX, mouseY);
    strokeWeight(10);
    stroke(255,20,200);
   
  }
    
  // The following does the same, and is faster when just drawing the image
  // without any additional resizing, transformations, or tint.
  //set(0, 0, cam);
}