import java.util.Arrays;

public class ArraysAndArrayLists {
  public static void main(String[] args) {
    int[] randomArray = getRandomIntArray(20);
    // char[] randomArray = getRandomCharArray(10);
    System.out.println(Arrays.toString(randomArray));
  }

  public static int[] getRandomIntArray(int length) {
    int[] ans = new int[length];
    for(int i = 0; i < length; i++) {
      ans[i] = (int) Math.floor(Math.random() * 10.0);
    }
    return ans;
  }

  public static char[] getRandomCharArray(int length) {
    char[] ans = new char[length];
    for(int i = 0; i < length; i++) {
      ans[i] = (char) Math.floor(97 + Math.random() * 26.0);
    }
    return ans;
  }
}
