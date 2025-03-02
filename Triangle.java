class Shape 
{
	public void color()
	{
		System.out.println("Diffrent shapes has diffrent color");
	}
	public void numSides()
	{
		System.out.println("Diffrent shpaes has diffrent number of sides");
	}
}
class Circle extends Shape
{
	public void radius()
	{
		System.out.println("The radius of circle is 7cm");
	}
}
class Rect extends Shape
{
	public int leng( int l)
	{
		
	System.out.println("length is 10");
	return l;
	}
	
}
class Triangle extends Shape
{
	public int side(int s)
	{
		System.out.println("Side is 20");
		return s;
	}
	public static void main(String []args)
	{
		Circle c=new Circle();
		c.radius();
		c.color();
		c.numSides();
		Rect r=new Rect();
		r.leng(10);
		Triangle t=new Triangle();
		t.side(20);
	}
}