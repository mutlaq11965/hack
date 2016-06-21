int i;
void setup() { 
 // noStroke();
size(500, 500, P3D);
}

void draw()
{
  background(50);
 i++;
translate(200,200, 50*sin(i*2*PI/180.0)); 
rotateY (i*PI/180.0);
//noFill();
lights();
//box(40);
sphere(100);

translate(200,200, 50*sin(i*2*PI/180.0)); 
sphere(100);

}