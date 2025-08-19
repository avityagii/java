public class MatrixMultiplication {
  public static void main(String[] args) {
    int[][] A = {
        { 1, 2 },
        { 3, 4 }
    };
    int[][] B = {
        { 1, 2, 3 },
        { 4, 5, 6 }
    };
    int[][] C = new int[2][3];

    for (int i = 0; i < A.length; i++) {
      for (int j = 0; j < B[0].length; j++) {
        for (int k = 0; k < B.length; k++) {
          C[i][j] += A[i][k] * B[k][j];
        }
        System.out.print(C[i][j] + " ");
      }
      System.out.println();
    }
  }
}
