package com.acadgild.java.session5;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		double length,width,radius,a,b,c;
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length of rectangle");
		length = sc.nextDouble();
		
		System.out.println("Enter the width of rectangle");
		 width = sc.nextDouble();
		 
		 Rectangle r = new Rectangle(length, width);
			System.out.println("The area of Rectangle is :"+r.findArea()) ;
			System.out.println("The Perimeter of Rectangle is :"+r.findPerimeter());
			System.out.println("--------------------------------------------------");
			
		 System.out.println("Enter the radius of circle");
		 radius = sc.nextDouble();
		 
		 Circle circle = new Circle(radius);
			System.out.println("The area of Circle is :"+circle.findArea());
			System.out.println("The Perimeter of Circle is :"+circle.findPerimeter());
			System.out.println("--------------------------------------------------");
		
		 System.out.println("Enter the first side for Triangle");
			a = sc.nextDouble();
			
		System.out.println("Enter the second side for Triangle ");
		b = sc.nextDouble();
			
		System.out.println("Enter the third side for Triangle");
		c = sc.nextDouble();
			
		Triangle tr = new Triangle(a,b,c);
		System.out.println("The area of Triangle is :"+tr.findArea());
		System.out.println("The Perimeter of triangle is :"+tr.findPerimeter());

	}

	

}
