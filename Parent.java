abstract class Class 
{
 public abstract void message(); 
} 
class subclass1 extends Class
{
	public void message()
	{
		System.out.println("This is first subclass. ");
	}
}
class subclass2 extends Class
{
 public void message()
 {
	 System.out.println("This is Second subclass. ");
 }	
}
public class Parent 
{
    public static void main(String[] args) {

        subclass1 s1 = new subclass1();
        s1.message();

        subclass2 s2 = new subclass2();
        s2.message();
    }
}