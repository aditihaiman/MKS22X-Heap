public class MyHeap {

  public static void pushDown(int[]data,int size,int index){
    int idx = index * 2 + 1;
    int idx2 = index;
    while(idx < size){
      if(idx+1 < size && data[idx+1] > data[idx]) idx++;
      if(data[idx2] < data[idx]) swap(data, idx2, idx);
      idx2 = idx;
      idx = idx * 2 + 1;
    }
  }

  private static void pushUp(int[]data,int index) {


  }

  public static void heapify(int[] data){
    for(int x = data.length/2; x >= 0; x--){
      pushDown(data, data.length, x);
    }

  }

  public static void heapsort(int[] data) {

  }

  public static void swap(int[] data, int index, int idx){
    int temp = data[idx];
    data[idx] = data[index];
    data[index] = temp;
  }





}
