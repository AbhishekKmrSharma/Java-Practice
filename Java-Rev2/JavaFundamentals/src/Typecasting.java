
public class Typecasting {
	public static void main(String[] args) {
		int nums[] = {52,-7,-10,60,41,-6,10,1,60,30,3,54,37,50,-7,18,61,20,4,17,43,30,35,-6,2,1,49,31,3,2,52,4,4,1,-7,42,15,47,5,32,5,33,-10,4,47,51,45,2,35,59,19,38,20,60,28,55,44,57,54,2,1,-8};
		int flag = 0;
		int temp1 = 0;
		int val = 0;
		for (int i = 0; i < nums.length; i++) 
		{
			for (int j = i + 1; j < nums.length; j++) 
			{
				if (nums[i] > nums[j] && nums[j] > 0) 
				{
					int temp = nums[j];
					nums[j] = nums[i];
					nums[i] = temp;
				}
			}
		}
		for(Integer a: nums)
		{
			System.out.print(a+" ");
		}
		System.out.println();
		for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] <= 0)
            {
            	int temp2 = val;
                flag++;
                if(i != 0 && temp2 != i -1)
                {
                	temp1 = nums[i-1];
                }
                val = i;
            }
            else if(nums[i] != i + 1 - flag)
            {
            	if(i == 0)
            	{
            		System.out.println("1");
            	}
            	else if(nums[i] != nums[i-1] && nums[i] != temp1)
            		{
            			System.out.println(i+1-flag);
            			break;
            		}
            	else
            		{
            			flag ++;
            		}
            }
        }
        System.out.println(nums.length + 1 -flag);
	}
}
