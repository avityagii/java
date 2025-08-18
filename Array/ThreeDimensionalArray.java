public class ThreeDimensionalArray {
  public static void main(String[] args) {

    int[][][] array = {
        { { 2, 3, 4 }, { 5, 6, 7 } },
        { { 1, 3, 5 }, { 2, 4, 6 } }
    };

    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        for (int k = 0; k < array[i][j].length; k++) {
          System.out.print(array[i][j][k] + " ");
        }
        System.out.println();
      }
      System.out.println();
    }
  }

}
