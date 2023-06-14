class A
{
	int a=20;
    A(int a)
    {    
    	super();
    	this.a=a;
        System.out.println(1);
        System.out.println(2);
    }
}
class MainClass
{
    public static void main(String[] args)
    {
        A a = new A(20);
 
        System.out.println(1);
    }
}