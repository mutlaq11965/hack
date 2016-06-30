package BreakOut;



import java.awt.Color;
import processing.core.PApplet;



public class Ball {
	PApplet p;
	float x;
	float y;
	float vX;
	float vY;
	float size;
	Color color;
	
	public Ball(PApplet np,float nx,float ny, float nsize,Color c){
		x = nx;
		y = ny;
		size = nsize;
		color = c;
		p = np;
		vX = 3;
		vY = 3;
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
public float getX(){
	return x;
}
public float getY(){
	return y;
}
public void setX(float tempx){
	x = tempx;
}
public void setY(float tempy){
	y = tempy;
}
public float getSize(){
	return size;
}
public float getvX(){
	return vX;
}
public float getvY(){
	return vY;
}
public void setVelocity(float tempvX, float tempvY){
	vX = tempvX;
	vY = tempvY	;	
}


}