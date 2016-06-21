void setup () {
  background(255, 0, 0);
  size (700, 500);
  
  strokeWeight(3);
 stroke(0,0,255);
}


void draw() {
if(mousePressed == true){
  ellipse(mouseX, mouseY, 1, 1);
  line(pmouseX, pmouseY, mouseX, mouseY);
  println("inside of if statement");
  }
  //stroke(mouseX/255);
}