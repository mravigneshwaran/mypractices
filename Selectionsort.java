package sortingalgorithms;
public class Selectionsort {
    public static int[] selectionSort(int[] arr){
        for(int i=0; i < arr.length-1; i++){
            int index = i;
            for(int j = i + 1; j<arr.length; j++){
                if(arr[j] < arr[index]){
                    index = j;
          
                }
            }
            //swappign code
            int small = arr[index];
            arr[index] = arr[i];
            arr[i] = small;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] myArray = {10,20,34,50,80,99};
        int[] sortedArray = selectionSort(myArray);
        
        for(int i=0; i < sortedArray.length; i++){
            System.out.print(sortedArray[i]);
            System.out.print(",");
        }
    }
}
