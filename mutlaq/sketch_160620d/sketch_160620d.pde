import gab.opencv.*;
import processing.video.*;
import java.awt.*;

Capture video;
OpenCV opencv;


void setup() {
  size(640, 480);
  video = new Capture(this, 640/2, 480/2);
  opencv = new OpenCV(this, 640/2, 480/2);
  opencv.loadCascade(OpenCV.CASCADE_FRONTALFACE);  
  video.start();
}

void draw() {
  scale(2);
  opencv.loadImage(video);
  //fill(255,0,200);
  image(video, 0, 0 );
  stroke(50, 0, 200);
  strokeWeight(1);
  Rectangle[] faces = opencv.detect();
  println(faces.length);

  for (int i = 0; i < faces.length; i++) {
    println(faces[i].x + "," + faces[i].y);
    ellipse(faces[i].x, faces[i].y + 70,   faces[i].width/2 -20, faces[i].height/2 -10);
    ellipse(faces[i].x + 120, faces[i].y + 70,   faces[i].width/2 -20, faces[i].height/2 -10);
    ellipse(faces[i].x + 60, faces[i].y + 80,   faces[i].width -10, faces[i].height/4 -10);

  }
}

void captureEvent(Capture c) {
  c.read();
}

  