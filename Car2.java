package Cars;
import processing.core.PApplet;

public class Car2 extends PApplet {
	Car myCAR;
	
	public void settings()
	{
		size(500,500);
	}
	
	public void setup()
	{
		myCAR = new Car(this);
	}
	
	public void draw() {
		//line(0,0,100,300);
		myCAR.do_somthing();
	}
	
	public static void main(String _args[]){
		PApplet.main(new String[] { Cars.Car2.class.getName() });
	}
}