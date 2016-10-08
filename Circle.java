package com.acadgild.java.session5;

public class Circle extends Shape {
	double radius;
	final double pi=3.14;
	
	
	public Circle(double radius){
		
		this.radius = radius;
		
	}
	
	 double findArea(){
		return pi*radius*radius;
	}
	 double findPerimeter(){
		return 2*pi*radius;
	}

}
