
public class Methods {
  public static void main(String[] args) {
    // Type - directly use the methods
    // greetUser();
    // greetUser();

    // Preferred Type
    Methods mainObj = new Methods();

    String name = "Avi Tyagi";

    mainObj.greetUser(name);
    System.out.println(mainObj.findPercentage(51, 200));
  }

  // static void greetUser() {
  // System.out.println("Hello Students");
  // }
  void greetUser(String name) {
    System.out.println("Hello Students " + name + ", how are you");
  }

  float findPercentage(int totalMarks, int maximumMarks) {
    return ((float) totalMarks / (float) maximumMarks * 100);
  }
}
