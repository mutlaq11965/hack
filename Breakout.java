package BreakOut;
import java.awt.Color;
import java.util.ArrayList;

import processing.core.PApplet;

public class Breakout extends PApplet {
	Rectangle paddle;
	Ball ball;
	public ArrayList<Rectangle> bricks = new ArrayList<Rectangle>();

	public static void main(String[] args) {
		PApplet.main("BreakOut.Breakout");

	}
	public void settings()
	{
		size(400,600);
	}
	public void setup()
	{
		paddle = new Rectangle(this,200,550,60,20);
		background(0);
		ball = new Ball(this,width/2,height/2,20,Color.RED);
		addBricks();
	}
	
	private void Updatepaddle(){
		paddle.setX(mouseX -30);
		paddle.paint();

		}
	private void addBricks(){
		for (int i=0;i<10;i++){
			for(int j =0;j<10;j++){
				bricks.add(new Rectangle(this,40*i,100+15*j,35,10));
			}
		}	
	}
	private void drawBricks(){
		for(int i = 0; i <bricks.size(); i++){
			bricks.get(i).paint();
		}
	}
	
	
	public void draw() {
	 fill(0,0,0,15);
	 rect(0,0,width,height);
		ball.update();
		ball.paint();
		paddle.paint();
		Updatepaddle();
		drawBricks();
	}
}