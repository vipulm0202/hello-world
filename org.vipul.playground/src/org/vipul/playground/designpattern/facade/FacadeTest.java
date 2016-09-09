package org.vipul.playground.designpattern.facade;

public class FacadeTest {

	public static void main(String[] args) {
		ShapeMaker shapemaker=new ShapeMaker();
		
		shapemaker.drawRectangle();
		shapemaker.drawCircle();

	}

}
