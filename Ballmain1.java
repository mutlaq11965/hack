package Shapes;

import java.awt.Color;
import processing.core.PApplet;
import Shapes.Ballmain1;


public class Ballmain1 extends PApplet {
	public static void main(String[] args) {
		PApplet.main("Shapes.Ballmain1");
	}
	
Balls[]ball = new Balls[4000];
Balls ball1;
Balls ball2;

public void settings()
{
	size(500,500);
}

public void setup()
{
	for(int i =0; i< ball.length; i++){
		ball[i] = new Balls(this, 200,200,10, Color.RED);
	}
	ball1 = new Balls(this, 10, 10, 60 , Color.BLUE);
	//ball2 = new Ball(this, 90, 90, 5 , color.Green );

}
public void draw() {
	background(255);
	//line(0,0,100,300);
	for(int i =0; i< ball.length; i++){
	ball[i].paint();
	ball[i].update();
	}
	//myCAR2.paint();
	//myCAR2.update();

	

	}
}