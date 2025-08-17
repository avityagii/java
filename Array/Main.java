public class Main {
  public static void main(String[] args) {
    int[][] arr = {
        { 2, 3, 4 },
        { 1, 7, 9 }
    };

    int[][] arr2 = new int[2][3];

    arr2[0][0] = 2;
    arr2[0][1] = 3;
    arr2[0][2] = 4;
    arr2[1][0] = 7;
    arr2[1][1] = 1;
    arr2[1][2] = 9;

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();

    }

    for (int i = 0; i < arr2.length; i++) {
      for (int j = 0; j < arr2[i].length; j++) {
        System.out.print(arr2[i][j] + " ");
      }
      System.out.println();
    }
  }
}