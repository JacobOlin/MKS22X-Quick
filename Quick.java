import java.util.Random;

public class Quick {

  public static int quickselect(int[]data,int k) {
    return 0;
  }

  public static int partition(int[] data,int start, int end) {
    if (start == end) {
      return end;
    }
    Random r  = new Random();
    int index = start + Math.abs(r.nextInt()%(end - start + 1));
    int pivot = data[index];
    data[index] = data[start];
    data[start] = pivot;
    /*System.out.print("ORIG: ");
    for (int i = 0;i < data.length;i += 1) {
      System.out.print(data[i] + " ");
    }
    System.out.println("Pivot "+ pivot);*/
    return recursive(data,start+1,end,start);
  }

  public static int recursive(int[] data,int start,int end,int pivotInd) {
    if (start == end) {
      if (data[pivotInd] < data[start]) {
        int pivot = data[pivotInd];
        data[pivotInd] = data[start - 1];
        data[start - 1] = pivot;
        return start - 1;
      }
      int pivot = data[pivotInd];
      data[pivotInd] = data[start];
      data[start] = pivot;
      return start;
    }
    if (data[start] >= data[pivotInd]) {
      int change = data[start];
      data[start] = data[end];
      data[end] = change;
      return recursive(data,start,end - 1,pivotInd);
    }
    return recursive(data,start+1,end,pivotInd);
  }

}
