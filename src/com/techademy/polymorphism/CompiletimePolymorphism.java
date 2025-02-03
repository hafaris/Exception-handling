package com.techademy.polymorphism;

class Shapes{
double a;
void Area(double r)
{
a = 3.4 * r * r;
System.out.println("Aria of circle :"+a);
}
void Area(double b, double h)
{
a = 0.5 * b * h;
System.out.println("Aria of Triangle :"+a);
}
void Area(double b1, double b2, double h)
{
a = h * (b1 + b2) / 2;
System.out.println("Aria of Trapezoidal :"+a);
}
}

public class CompiletimePolymorphism {
	public static void main(String args[])
	{
	Shapes s=new Shapes( );
	s.Area(3);	
	}

}
