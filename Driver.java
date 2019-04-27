import java.util.*;
import java.io.*;

public class Driver {
  public static void main(String[] args) {
    int[] arr = {2, 6, 9, 3, 4, 5, 7};
    System.out.println(Arrays.toString(arr));
    MyHeap.pushDown(arr, arr.length, 0);
    System.out.println(Arrays.toString(arr));
  }
}
