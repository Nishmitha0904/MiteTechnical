import java.util.Scanner;
public class SimpleInterest {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int principle;
    float time, rateOfInterest, simpleInterest;
    principle = in.nextInt();
    rateOfInterest = in.nextFloat();
    time = in.nextFloat();
    simpleInterest = (principle*time*rateOfInterest)/100;
    System.out.println("Simple Interest: "+simpleInterest);

  }
}