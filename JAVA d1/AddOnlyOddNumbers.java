import java.util.Scanner;

public class AddOnlyOddNumbers {

  public static void addonlyoddnumbers() {
    Scanner sc = new Scanner(System.in);
    int b[] = new int[10];
    int result = 0;
    for (int i = 0; i < 10; i++) {

      b[i] = sc.nextInt();
    }
    sc.close();

    System.out.println(b);

    for (int i = 0; i < b.length; i++) {
      if (b[i] % 2 == 1) {
        result += b[i];
      }
    }
    System.out.println(result);

  }

  public static void main(String[] args) {
    addonlyoddnumbers();
  }
}
