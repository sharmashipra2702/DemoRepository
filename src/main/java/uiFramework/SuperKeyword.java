package uiFramework;

public class SuperKeyword extends ParentClass{

	public void m(){
	super.m();
	System.out.println("child class");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperKeyword s= new SuperKeyword();
		ParentClass p= new SuperKeyword();

		p.m();
		s.m();
	}

}
