public class VowelOrNot {
  public static void main(String[] args) throws java.io.IOException {
		char ch = (char)System.in.read();
    System.out.println("aeiouAEIOU".contains(""+ch)?"Vowel":"Not Vowel");
		
	}

}

