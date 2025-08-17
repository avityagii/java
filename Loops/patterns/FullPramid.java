package patterns;

public class FullPramid {
  public static void main(String[] args) {
    int n = 5;
    int i, j, k, l;
    for (i = 1; i <= n; i++) {
      for (j = 1; j <= (n - i); j++) {
        System.out.print(" ");
      }
      for (k = 1; k <= i; k++) {
        System.out.print(k);
      }
      for (l = 1; l <= (i - 1); l--) {
        System.out.print(l);
      }
      System.out.println(" ");
    }
  }
}
