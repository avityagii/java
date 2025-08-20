package String;

public class SearchingStringMethods {
  public static void main(String[] args) {
    String str1 = "Programming";
    // contain(charSequence s) - true/false
    System.out.println(str1.contains("gram"));
    // startWith(String prefix) - true/false
    System.out.println(str1.startsWith("Pro"));
    // endsWith(String suffix) - true/false
    System.out.println(str1.endsWith("ing"));
    // indexOf(String str)
    System.out.println(str1.indexOf("m"));
    // lastIndexOf(String str)
    System.out.println(str1.lastIndexOf("m"));
  }
}
