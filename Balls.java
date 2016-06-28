package Shapes;



import java.awt.Color;
import processing.core.PApplet;



public class Balls {
	PApplet p;
	float x;
	float y;
	float vX;
	float vY;
	float size;
	Color color;
	
	public Balls(PApplet np,float nx,float ny, float nsize,Color c){
		x = nx;
		y = ny;
		size = nsize;
		color = c;
		p = np;
		vX = p.random(-3,3);
		vY = p.random(-3,3);
	   }
	public void update(){
		x = x + vX;
		y = y + vY;
		
		if(x > p.width ||x<0){
			vX = -vX;
		}
		
		if(y > p.height || y<0){
			vY = -vY;
		}
	}
public void paint(){
	p.noStroke();
	p.fill(color.getRed(),color.getGreen(),color.getBlue());
    p.ellipse(x, y, size, size);
    }

}