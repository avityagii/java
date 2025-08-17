public class ArrayRepresentation {
  public static void main(String[] args) {
    // Type 1
    int[] arr = new int[5];
    arr[0] = 1;
    arr[1] = 2;
    arr[2] = 3;
    arr[3] = 4;
    arr[4] = 5;

    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();

    System.out.println("=========================================");

    // Type 2

    int[] arr2 = { 6, 7, 8, 9, 10 };

    for (int i = 0; i < arr2.length; i++) {
      System.out.print(arr2[i] + " ");
    }
    System.out.println();

  }
}
