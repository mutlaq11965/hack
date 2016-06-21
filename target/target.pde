
void setup(){
  size(300, 300);
  face(200,200);
}

void draw() {
  ellipse(mouseX, mouseY, 10, 10);
   //face(mouseX, mouseY);
}
void face(int x, int y)
{
  for(int i=10; i>0; i--)
  {
    ellipse(x, y, i*20, i*20);
    if (i%2 == 0){
      fill(255, 0, 0);
  }
  else
  {
    fill(255);
  }
  }
}

  