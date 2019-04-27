import java.util.*;
import java.io.*;

public class Driver {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    System.out.println(Arrays.toString(arr));
    //MyHeap.pushDown(arr, arr.length, 2);
    MyHeap.heapify(arr);
    //MyHeap.pushUp(arr, 3);
    System.out.println(Arrays.toString(arr));
  }
}
