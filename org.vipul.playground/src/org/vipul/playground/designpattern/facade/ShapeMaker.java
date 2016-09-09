package org.vipul.playground.designpattern.facade;

public class ShapeMaker {
	private Shape rectangle;
	private Shape circle;
	
	public ShapeMaker(){
		rectangle=new Rectangle();
		circle = new Circle();
	}
	
	public void drawRectangle(){
		rectangle.draw();
	}
	
	public void drawCircle(){
		circle.draw();
	}
}
