import java.util.Scanner;
class RotateLeft {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n,d;
    n = sc.nextInt();
    d = sc.nextInt();
    int a[] = new int[n];
    for(int i=0;i<n;i++)
      a[i] = sc.nextInt();
    int temp[] = new int[n];
    int j=0;
    for(int i=d;i<n;i++) 
    {
      temp[j] = a[i];
      j++;
    }
    for(int i=0;i<d;i++) 
    {
      temp[j] = a[i];
      j++;
    }
    for(int i=0;i<n;i++)
      a[i] = temp[i];
    for(int i=0;i<n;i++)
      System.out.print(a[i]+" ");
  }
}