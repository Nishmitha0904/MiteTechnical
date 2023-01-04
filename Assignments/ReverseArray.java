import java.util.Scanner;
class ReverseArray {
  public static void reverseArray(int a[], int n)
  {
    for(int i=n-1;i>=0;i--)
    {
      System.out.print(a[i]+" ");
    }
  }
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n;
    n = sc.nextInt();
    int a[] = new int[n+1];
    for(int i=0;i<n;i++)
      a[i] = sc.nextInt();
    reverseArray(a,n);
  }
}