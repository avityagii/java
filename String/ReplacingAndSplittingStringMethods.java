package String;

public class ReplacingAndSplittingStringMethods {
  public static void main(String[] args) {
    String str1 = "Languages";
    // replace(char old , char new)
    System.out.println(str1.replace("es", "ed"));
    // replaceAll(String regex , String replacement)
    System.out.println(str1.replaceAll("uages", "_"));
    // split(String regex)
    String str2 = "a,b,c";
    System.out.println(str2.split(","));
  }
}
