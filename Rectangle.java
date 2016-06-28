package Shapes;
import java.awt.Color;
import processing.core.PApplet;

public class Rectangle  {
	PApplet p;
	private float x;
	private float y;
	private float width;
	private float hight;
	private Color innerColor;
	
	public Rectangle(PApplet tempP,float tempX,float tempY, float tempW,float tempH){
		p = tempP;
	    x = tempX;
	    y = tempY;
	    width = tempW;
	    hight = tempH;
	    innerColor = new Color(255,255,255);
	}
	public void paint(){
		p.noStroke();
		p.fill(innerColor.getRed(),innerColor.getGreen(),innerColor.getBlue());
		p.rect(x, y, width,hight);
	}
	
	public void display(){
		p.fill(255);
		p.rect(x,y,width,hight);
	}
	
	public void setX(float newX){
		x = newX;
	}
	public void setY(float newY){
		y = newY;
	}
	public void setWidth(float  newW){
		width = newW;
	}
	public void setHight(float  newH){
		hight = newH;
	}
	public float getX(){
		return x;
	}
	public float getY(){
		return x;
	}
	
		
}