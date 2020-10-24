
public class Program_Demo {
	int a ; //Declaration of variable
	int b=20; //Initialization of variable
	//operation
	void m1()
	{
	a=10; //assingnment of variable global variable
	int c=30; //locale variable
	System.out.println(a);
	System.out.println(c);
	}
	public static void main(String[] args) {
		Program_Demo cs=new Program_Demo();
		cs.m1();
		System.out.println(cs.b);
	}
}
