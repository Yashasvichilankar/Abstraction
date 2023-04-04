abstract class Animals
{
	abstract void cats();
	abstract void dogs();
}
class Cats extends Animals
{
	@Override
	void cats() {
		// TODO Auto-generated method stub
		System.out.println("Cats meow meow");}
	@Override
	void dogs() {
		// TODO Auto-generated method stub	
	}
}
class Dogs extends Animals
{
	@Override
	void cats() {
		// TODO Auto-generated method stub	
	}
	@Override
	void dogs() {
		System.out.println("Dogs bhaoo bhaoooo");
	}
}
public class Animal {
	public static void main(String[] args) {
		Cats c=new Cats();
		c.cats();
		Dogs d=new Dogs();
		d.dogs();
	}
}
