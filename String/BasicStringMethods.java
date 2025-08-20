package String;

public class BasicStringMethods {
  public static void main(String[] args) {

    String str1 = "Ducat";
    // Length
    System.out.println(str1.length());
    // charAt(int index)
    System.out.println(str1.charAt(2));
    // substring(int start , int end)
    System.out.println(str1.substring(1, 4));
    // equals(Object obj) - true/false
    System.out.println(str1.equals("Ducat"));
    // isEmpty() - true/false
    System.out.println(str1.isEmpty());
    // toLowerCase()
    System.out.println(str1.toLowerCase());
    // toUpperCase()
    System.out.println(str1.toUpperCase());
    // trim()
    System.out.println(str1.trim());
  }
}
