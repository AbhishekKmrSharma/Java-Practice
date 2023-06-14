
public class Animal 
{
	void eat()
	{
		System.out.println("Eating");
	}
}
class Lion extends Animal
{
	void eat()
	{
		System.out.println("Meat eater");
	}
}
class Cow extends Lion
{
	void eat()
	{
		System.out.println("Grass eater");
	}
}
class Behave
{
	public static void main(String[] args) 
	{
		Animal a1,a2,a3;
		a1=new Animal();
		a2=new Lion();
		a3=new Cow();
		a1.eat();
		a2.eat();
		a3.eat();
	}
}