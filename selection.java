package sortingalgorithms;
public class selection {
    public static int[] selectionsort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            int index = i;
            for(int j = i + 1; j<arr.length; j++){
                if(arr[j] < arr[index]){
                    index = j;
                }
            }
            //swap
            int small = arr[index];
            arr[index] = arr[i];
            arr[i] = small;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] myArray = {10,1,20,2,50,6,4};
    }
}
