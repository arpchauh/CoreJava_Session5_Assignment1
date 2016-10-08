package com.acadgild.java.session5;

public class Triangle extends Shape {
	double a,b,c;
	
	public Triangle(double a, double b, double c){
		
		this.a = a;
		this.b = b;
		this.c = c;
	}
	

	double findArea(){
		
		double s = (a+b+c)/2;
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}
	
	double findPerimeter(){
		
		return a+b+c;
	}
}
