// setup() is called once when the program starts execution
void setup () {
  // Open a window. First 400 is the width in pixels, second 400 the height
  size(400, 400);
}

// draw() is called once every frame update (default 30 per second)
void draw () {
  // Set the fill color to a random color
  fill(random(0, 255), random(0, 255), random(0, 255));

  // Draw an ellipse at position X=mouseX, Y=mouseY. The mouseX/Y are built in
  // variables that are updated with the mouse pointer
  // First 20 is the width and second 20 is the height, in pixels
  ellipse(mouseX, mouseY, 20, 20);
}