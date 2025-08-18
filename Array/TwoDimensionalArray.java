public class TwoDimensionalArray {
  public static void main(String[] args) {
    // Type 1
    int[][] array = {
        { 2, 4, 6 },
        { 3, 5, 7 }
    };

    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        System.out.print(array[i][j] + " ");
      }
      System.out.println();
    }

    System.out.println("================================");

    // Type 2
    int[][] arr = new int[2][3];
    arr[0][0] = 2;
    arr[0][1] = 3;
    arr[0][2] = 4;
    arr[1][0] = 5;
    arr[1][1] = 6;
    arr[1][2] = 7;

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }
}
