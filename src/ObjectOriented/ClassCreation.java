package ObjectOriented;

class Rectangle{
	
	public double breadth;
	public double length;
	
	public double area()
	{
		return breadth*length;
	}
	
	public double perimeter()
	{
		return 2*(length+breadth);
	}
	
}

class Cylinder{
	
	public double radius;
	public double height;

	public double lidArea()
	{
		return Math.PI*radius*radius;
	}
	
	public double circumference()
	{
		return 2*Math.PI*radius;
	}
	
	public double totalSurfaceArea()
	{
		return 2*lidArea()+circumference()*height;
	}
	
	public double volume()
	{
		return Math.PI*radius*radius*height;
	}
	
	public String toString()
	{
		return "If you write toString() method and try to output the object itself.You get this method"; 
	}
	
}


class Cylinder2{
	
	private double radius;
	private double height;
	
	public Cylinder2()
	{
		setRadius(1);
		setHeight(1);
	}
	
	public Cylinder2(double s)
	{
		setRadius(s);
		setHeight(s);
	}
	
	public Cylinder2(double r,double h)
	{
		setRadius(r);
		setHeight(h);
	}
	
	
	public void setRadius(double r)
	{
		if(r>0)
			radius=r;
		else
			radius=0.0;
	}
	
	public void setHeight(double h)
	{
		if(h>0)
			height=h;
		else
			height=0.0;
	}
	
	public double getRadius()
	{
		return radius;
	}
	
	public double getHeight()
	{
		return height;
	}
	
	public double lidArea()
	{
		return 2*Math.PI*radius*radius;
	}
	
	public double circumference()
	{
		return 2*Math.PI*radius;
	}
	
	public double totalSurfaceArea()
	{
		return 2*lidArea()*circumference()*height;
	}
	
	public double volume()
	{
		return Math.PI*radius*radius*height;
	}
	
	public String toString()
	{
		return "Cylinder class with private variables,constructors,getters and setters.";
	}
}



public class ClassCreation {
	
	public static void main(String [] args)
	{
		Rectangle r=new Rectangle();
		r.breadth=3.0;
		r.length=4.0;
		
		System.out.println("*Rectangle*");
		System.out.println("Area: "+r.area());
		System.out.println("Perimeter: "+r.perimeter());
		
		System.out.println("*Cylinder*");
		Cylinder c=new Cylinder();
		c.height=5.0;
		c.radius=2.0;
		
		System.out.println("Lid area: "+c.lidArea());
		System.out.println("Total surface area: "+c.totalSurfaceArea());
		System.out.println("Volume: "+c.volume());
		
		//Important! We don't have to write c.toString(). It calls this method automatically.
		System.out.println("Important:"+c);
		
		Cylinder2 c2=new Cylinder2();
		System.out.println("Cylinder2: "+c2);
		
		
	}
		
}
	

