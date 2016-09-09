package org.vipul.playground.designpattern.structural.facade;

import org.vipul.playground.designpattern.creational.Shape;
import org.vipul.playground.designpattern.creational.factory.ShapeFactory;

public class ShapeMaker {
	private Shape rectangle;
	private Shape circle;
	
	public ShapeMaker(){
		ShapeFactory shapeFactory = new ShapeFactory();
		rectangle=shapeFactory.getShape("RECTANGLE");
		circle = shapeFactory.getShape("CIRCLE");
	}
	
	public void drawRectangle(){
		rectangle.draw();
	}
	
	public void drawCircle(){
		circle.draw();
	}
}
