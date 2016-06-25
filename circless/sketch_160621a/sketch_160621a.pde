void setup(){
  size(300, 300);
}

void draw() {
   face(mouseX, mouseY);
}

void face(int x, int y)
{
  ellipse(x, y, mouseX/2, mouseY);
  
}