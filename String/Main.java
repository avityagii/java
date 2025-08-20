package String;

public class Main {
  public static void main(String[] args) {
    // Method 1
    String str1 = "Noida";
    System.out.println(str1);
    // Method 2
    String str2 = new String("Ducat");
    System.out.println(str2);

    String S1 = "RKGIT";
    String S2 = "RKGIT";
    String S3 = new String("RKGIT");
    String S4 = new String("RKGIT");

    System.out.println(S1 == S2);
    System.out.println(S3 == S4);
    System.out.println(S1 == S3);
    System.out.println(S1 == S4);

  }
}