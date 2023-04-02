abstract class AbstractClassConstructor 
{
	//as the object of the subclass is created constructor of abstract class is created
	AbstractClassConstructor ()
	{
		System.out.println("This is the constructor of abstract class.");
	}
	abstract void a_method();
	void non_abstract()
	{
		System.out.println("This is a concrete method of abstract class");
	}
	public static void main(String[] args)
	{
	SubClass s=new SubClass();
	s.a_method();
	s.non_abstract();
	}
}
class SubClass extends AbstractClassConstructor 
{
	@Override
	void a_method() 
	{
	System.out.println("This is abstract method");	
	}
}
	