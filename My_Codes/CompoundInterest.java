import java.text.DecimalFormat;
import java.util.Scanner;
public class CompoundInterest {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int principle;
    float time, rateOfInterest, compoundInterest;
    principle = in.nextInt();
    rateOfInterest = in.nextFloat();
    time = in.nextFloat();
    compoundInterest = principle*(float)Math.pow(1+rateOfInterest/100, time);
    System.out.println("Compound Interest : " + (new DecimalFormat("#.00").format(compoundInterest)));

  }
}