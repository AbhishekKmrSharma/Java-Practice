import java.util.Scanner;

public class Sum
{
public static void main(String[] args)
{
Scanner A=new Scanner(System.in);
int a[]=new int[5];
int sum=0;

for(int i=0;i<5;i++)
{
a[i]=A.nextInt();
sum+=a[i];
}
System.out.print(sum+"\n"+(sum/5));
}
}
