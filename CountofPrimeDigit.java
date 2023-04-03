import java.util.Scanner;
class CountofPrimeDigit 
{
	public static boolean checkPrimedigit(int num) 
	{
		if(num == 1)
		{
			return false;
		}
		else
		{
			for(int i=2; i<num; i++)
			{
				if(num % i == 0)
				{
					return false;
				}
			}
			return true;
		}
	}

	public static int countPrimeDigit(int num)
	{
		int count = 0;
		
		while(num > 0)
		{
			int rem = num % 10;

			boolean ans = checkPrimedigit(rem);

			if(ans)
			{
				count ++;
			}
			num = num / 10;			
		}

		return count;
	}


	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int ip = sc.nextInt();

		System.out.println(countPrimeDigit(ip));
	}
}
