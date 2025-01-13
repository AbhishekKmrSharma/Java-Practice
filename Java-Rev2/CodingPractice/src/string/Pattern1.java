package string;

public class Pattern1 
{
	public static void main(String[] args)
	{
		String s1 = "My Name is Abhishek"; 
		
		String s2[] = s1.split(" ");
		//System.out.println(s2[3]);
		int left = 0, right = s2.length - 1;
		
		while(left < right)
		{
			String temp = "";
			temp = s2[left];
			s2[left] = s2[right];
			s2[right] = temp;
			left++;
			right--;
			//System.out.println("1"+left+right);
		}
		//System.out.println("----="+s2[0]+s2[3]);
		String originalString = String.join(" ", s2);
		System.out.println(originalString);
		
	}
}
