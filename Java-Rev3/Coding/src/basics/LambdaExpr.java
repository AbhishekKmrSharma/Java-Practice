package basics;

public class LambdaExpr 
{
	public static void main(String[] args) 
	{
		A a = (i,j) -> i+j;
		Integer result = a.add(1, 2);
		System.out.println(result);
	}
}

@FunctionalInterface
interface A
{
	int add(int a, int b);
}
