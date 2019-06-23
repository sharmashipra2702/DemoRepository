package uiFramework;

// It is not necessary to have at least one abstract method for an abstract class
//Abstract methods can be overridden
//
class Base
{
	Base(){
		System.out.println("In Base constructor");
	}
}

class child extends Base{
	
}

abstract class Derived1 extends Base
{
  public Derived1() {
	// TODO Auto-generated constructor stub
	  System.out.println("In abstract class constructor");
}
  public abstract void show();
}

public class Example1 extends Derived1{
	public void show(){
		System.out.println("overridden");
	}
	public Example1() {
		// TODO Auto-generated constructor stub
	System.out.println("In derived2 constructor");
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Example1 ex = new Example1();
		ex.show();
	}

}
