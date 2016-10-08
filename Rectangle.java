package com.acadgild.java.session5;

public class Rectangle extends Shape{

		 double length,width;
		 public Rectangle(double length, double width){
				
				this.length = length;
				this.width = width;
		 }
	 
		 double findArea(){
			
					return length*width;
		
		}
		double findPerimeter(){
			
			return 2*((length)+(width));
			
		}
}
