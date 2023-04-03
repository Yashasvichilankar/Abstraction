abstract class Bank 
{
	abstract void getBalance();
}
class BankA extends Bank
{
	void getBalance()
	{
		System.out.println("Deposited amount in BankA:$100");
	}
}
class BankB extends Bank
{
	void getBalance()
	{
		System.out.println("Deposited amount in BankB:$150 ");
	}
}
class BankC extends Bank
{
	void getBalance()
	{
		System.out.println("Deposited amount in BankC:$200");
	}
}
public class CheckBank {
public static void main(String[] args) {
	BankA b1=new BankA();
	b1.getBalance();
	BankB b2=new BankB();
	b2.getBalance();
	BankC b3=new BankC();
	b3.getBalance();
}
}
