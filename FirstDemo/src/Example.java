class Example
{
	public static void main(String[] args)
	{
		Animal a=new Animal();
		a.eat();
		a=new Feline();
		a.eat();
		a=new Animal();
		a.sleep();
		a=new Feline();
		a.sleep();
	}
}