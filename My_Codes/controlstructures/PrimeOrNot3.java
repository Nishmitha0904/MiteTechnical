public class PrimeOrNot3 {
	public static void main(String[] args) {
		int n = new java.util.Scanner(System.in).nextInt();
		if (n > 0) 
    {
			if (n == 1)
				System.out.println("Neither prime nor composite");
			else if (n > 3 && (n % 2 == 0 || n % 3==0 ))
				System.out.println("Not Prime");
			else 
      {
				for (int i = 5; i*i<=n; i+=6)
					if (n % i== 0 || n % (i+2)==0) 
          {
						System.out.println("Not Prime");
						return;
					}
				System.out.println("Prime");
			}
		}
	}
}