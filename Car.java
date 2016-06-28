import processing.core.PApplet;

public class Car {

	// Class variables (data)
			float x;
			float y;
			int c;
			float speed;
			PApplet processingContext;
			
			// Class Constructor
			public Car( PApplet newProcessingContext, float nx, float ny, float nspeed){
				processingContext = newProcessingContext;
				x = nx;
				y = ny;
				speed = nspeed;
				c = (int)processingContext.random(256);
			}
			
			// Display the car (functionality)
			public void display(){
				processingContext.fill(c);
				processingContext.rect(x,y,30,10);
			}
			
			// Move the car (functionality)
			public void move(){
				if(x > processingContext.width){
					x = -30;
				}
				x=x+speed;
			}

}