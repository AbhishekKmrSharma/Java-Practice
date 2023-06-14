
public class InstanceInitializerBlock {
	int i;
	void m1()
	{
		System.out.println(i);
	}
	{
		i=30;
	}

}
class checki
{
	public static void main(String[] args) {
		InstanceInitializerBlock i=new InstanceInitializerBlock();
		i.m1();
	}
}
