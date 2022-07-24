import java.util.Arrays;

public class MainProgram {

  public static void main(String[] args) {
    // write your test code here
    int[] array = {8, 3, 7, 9, 1, 2, 4};
    sort(array);
  }

  public static int smallest(int[] array) {
    int min = array[0];
    for (int i = 1; i < array.length; i++) {
      if (array[i] < min) {
        min = array[i];
      }
    }
    return min;
  }

  public static int indexOfSmallest(int[] array) {
    int min = array[0];
    int indMin = 0;
    for (int i = 1; i < array.length; i++) {
      if (array[i] < min) {
        min = array[i];
        indMin = i;
      }
    }
    return indMin;
  }

  public static int indexOfSmallestFrom(int[] table, int startIndex) {
    int min = table[startIndex];
    int indMin = startIndex;
    for (int i = startIndex; i < table.length; i++) {
      if (table[i] < min) {
        min = table[i];
        indMin = i;
      }
    }
    return indMin;
  }

  public static void swap(int[] array, int index1, int index2) {
    int aux = array[index1];
    array[index1] = array[index2];
    array[index2] = aux;
  }

  public static void sort(int[] array) {
//   // move the smallest to index 0
    for(int i = 0; i < array.length; i++) {
      System.out.println(Arrays.toString(array));
      swap(array, i, indexOfSmallestFrom(array, i));
    }
  }
}
