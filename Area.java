abstract class Shape
{
	abstract void RectangleArea(float l,float b);
	abstract void SquareArea(float r);
	abstract void CircleArea(float s);
}

class Area1 extends Shape
{
    double a=0;
	@Override
	void RectangleArea(float l, float b)
	{
		a=l*b;
		System.out.println("Area of rectangle is: "+a);
	}
	@Override
	void SquareArea(float s) {
		a=s*s;
		System.out.println("Area of Square is: "+a);
	}
	@Override
	void CircleArea(float r) {
		a=(r*r)*3.14;
		System.out.println("Area of Circle is: "+a);
	}
}
public class Area
{
	public static void main(String[] args) {
		Area1 a=new Area1();
		a.RectangleArea(3.5f,2f);
		a.SquareArea(4);
		a.CircleArea(5);
	}
}
