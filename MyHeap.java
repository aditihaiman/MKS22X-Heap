public class MyHeap {

  private static void pushDown(int[]data,int size,int index){
    int idx = index * 2 + 2;
    while(idx > size){
      if(data[idx-1] > data[idx]) idx--;
      if(data[index] < data[idx]) swap(data, index, idx);
      index = idx;
      idx = idx * 2 + 2;
    }
  }

  private static void pushUp(int[]data,int index) {


  }

  public static void heapify(int[] data){
    for(int x = 0; x < data.length; x++){

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
