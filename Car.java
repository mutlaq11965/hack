package Cars;
import processing.core.PApplet;
 

public class Car {
	PApplet p;
	public Car(PApplet np) 
	{
		p = np;
	}
	public int do_somthing(){
		p.line(100,100,50,50);
		return 3;
	}
}
