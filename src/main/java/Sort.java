/**
 * @program: jj->Sort
 * @description:
 * @author: hunyiha
 * @create: 2020-03-31 14:33
 **/
public class Sort {

    public static void main(String[] args) {
        int[] arr = {23,1,35,44,66,34};
        arr =  sort(arr);
        for(int i=0 ;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    private static int[] sort(int[] arr) {
        for(int i=0; i<arr.length; i++){
            for(int j=1; j<arr.length-i; j++){
                if(arr[j-1] > arr[j]){
                    int temp;
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }

    public static int commonBinarySearch(int[] arr,int key){
        int low = 0;
        int high = arr.length - 1;
        int middle = 0;

        if(key < arr[low] || key > arr[high] || low > high){
            return -1;
        }

        while(low <= high){
            middle = (low + high) / 2;
            if(arr[middle] > key){
                high = middle - 1;
            }else if(arr[middle] < key){
                low = middle + 1;
            }else{
                int k = 2;
                return middle;
            }
        }
        return -1;
    }

}
