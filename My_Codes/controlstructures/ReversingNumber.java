public class ReversingNumber {
	public static void main(String[] args) {
		long n = new java.util.Scanner(System.in).nextLong();
		long reverse = 0;
		int cnt = 0;
		while (n != 0) 
    {
			reverse = reverse * 10 + n % 10;
			n = n / 10;
			cnt++;
		}
		System.out.printf("%0"+cnt+"d\n", reverse);
	}
}