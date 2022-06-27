import java.util.Scanner;

public class GetAvg {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[10];
    int count = sc.nextInt();
    int sum = 0;
    int avg = 0;
    for (int k = 1; k < count+1; k++) {

      for (int i = 0; i < 10; i++) {
        int a = sc.nextInt();
        if (a >= 0 && a <= 1000) {
          arr[i] = a;
          // System.out.println(i+1+"번째");
        }
      }
      for (int j = 0; j < arr.length; j++) {
        sum += arr[j];
        avg = Math.round(sum/arr.length);
      }
      System.out.print("#"+k + " ");
      System.out.println(avg);
      sum = 0;
    }
    // System.out.println("횟수:"+count);
    sc.close();
  }
}