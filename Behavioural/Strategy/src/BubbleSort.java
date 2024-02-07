import java.util.Arrays;

public class BubbleSort implements Sorting{
    @Override
    public void sort(int[] arr) {
        System.out.println("Bubble sort");
        for (int i = arr.length-1; i>=0;i--){
            for(int j = 0; j < i; j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Rezultat: " + Arrays.toString(arr));
    }
}
