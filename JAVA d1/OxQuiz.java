import java.util.Scanner;

public class OxQuiz {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int increase = 1;
    int sum = 0;
    int testCase = sc.nextInt();
    System.out.println(testCase + "만큼 실행합니다");

    for (int i = 0; i < 3; i++) {
      
      String ox = sc.nextLine();
      for (int j = 0; j < ox.length(); j++) {
        char check = ox.charAt(j);

        if (check == 'O') {
          sum += increase++;
        } else {
          increase = 1;
        }

      }
      System.out.println(sum);
      sum = 0;
      increase =1;
      // 만약 i가i+1 같다면 sum += i+1 i와 i+1이 같지 않다면 sum = sum 그리고 sum을 출력
    }
    sc.close();
  }
}