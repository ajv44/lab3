import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  static void reverseInPlace(int[] arr) {
    int[] newArray = new int[arr.length];
    for(int i = 0; i < arr.length/2; i += 1) {
      int temp = arr[i];
      arr[i] = arr[arr.length - i - 1] = temp;
    }
  }

  @Test
  static int[] reversed(int[] arr) {
    int[] newArray = new int[arr.length];
    for(int i = 0; i < arr.length; i += 1) {
      newArray[i] = arr[arr.length - i - 1];
    }
    return newArray; 
  }

  @Test
  static double averageWithoutLowest(double[] arr) {
    if(arr.length < 2) { 
      return 0.0;
    }
    double lowest = arr[0];
    double sum = arr[0];
    for(int i = 1; i < arr.length; i++) {
      sum += arr[i];
      if (arr[i] < lowest) {
        lowest = arr[i];
      }
    }
    return (sum - lowest) / (arr.length - 1);
  }
}