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
	public void testReverseInPlaceOdd() {
    int[] input1 = { 3 , 4, 5 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 5,4,3 }, input1);
	}
  @Test 
	public void testReverseInPlaceEven() {
    int[] input1 = { 3, 4 , 5, 6 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 6,5,4,3 }, input1);
	}
  @Test 
	public void testReverseInPlaceEmpty() {
    int[] input1 = { };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }
  @Test
  public void testReversedOdd() {
    int[] input1 = {5,6,7 };
    assertArrayEquals(new int[]{7,6,5 }, ArrayExamples.reversed(input1));
  }
  @Test
  public void testReversedEven() {
    int[] input1 = {5,6,7,8 };
    assertArrayEquals(new int[]{ 8,7,6,5}, ArrayExamples.reversed(input1));
  }
  @Test
  public void testReversedSingle() {
    int[] input1 = {8 };
    assertArrayEquals(new int[]{8 }, ArrayExamples.reversed(input1));
  }
  @Test
  public void testAverageWithoutLowest(){
    double[] input1 = {50,50,100};
    assertEquals(75.0,ArrayExamples.averageWithoutLowest(input1),0.1);
  }
}

