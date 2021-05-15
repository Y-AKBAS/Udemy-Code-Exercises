package ObjectOriented;

abstract class Shape{
	
	abstract public float perimeter();
	abstract public float area();
}

class Circle extends Shape{
	
	private float radius;
	
	public void setRadius(float r)
	{
		radius=r;
	}
	
	public float getRadius()
	{
		return radius;
	}
	
	public float perimeter()
	{
	  return 2*(float)Math.PI*radius;
	}
	
	public float area()
	{
		return (float)Math.PI*radius*radius;
	}
}

class Rectangle2 extends Shape{
	
	private float x;
	private float y;
	
	public void setX(float x)
	{
		this.x=x;
	}
	
	public void setY(float y)
	{
		this.y=y;
	}
	
	public float getX()
	{
		return x;
	}
	
	public float getY()
	{
		return y;
	}
	
	public float perimeter()
	{
		return 2*(x+y);
	}
	
	public float area()
	{
		return x*y;
	}
}

public class AbsClaChallenge {
	
	public static void main(String [] args)
	{
		Circle c=new Circle();
		c.setRadius(3.0f);
		System.out.println(c.area());
		System.out.println(c.perimeter());
		
		System.out.println("");
		
		Rectangle2 r=new Rectangle2();
		r.setX(3.0f);
		r.setY(4.0f);
		System.out.println(r.area());
		System.out.println(r.perimeter());
		
		
	}

}
