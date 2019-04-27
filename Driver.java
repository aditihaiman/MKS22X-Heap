import java.util.*;
import java.io.*;

public class Driver {
  public static void main(String[] args) {
    int[] arr = {9, 5, 8, 2, 4, 6, 0};
    System.out.println(Arrays.toString(arr));
    //MyHeap.pushDown(arr, arr.length-2, 0);
    //MyHeap.heapify(arr);
    //MyHeap.pushUp(arr, 3);
    MyHeap.heapsort(arr);
    System.out.println(Arrays.toString(arr));
  }
}
