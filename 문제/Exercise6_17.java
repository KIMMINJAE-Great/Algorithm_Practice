package exercises;

import java.util.Arrays;

public class Exercise6_17 {

  public static void main(String[] args) {

    int[] original = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    System.out.println(Arrays.toString(original));

    int[] result = shuffle(original);
    System.out.println(Arrays.toString(result));
  }

  public static int[] shuffle(int[] arr) {
    for (int i = 0; i < arr.length; i++) {

      int rand = (int) (Math.random() * 10);
      int tmp = arr[i];
      if (rand != arr.length) {
        arr[i] = arr[rand];
        arr[rand] = tmp;
      }

    }

    return arr;
  }

}
