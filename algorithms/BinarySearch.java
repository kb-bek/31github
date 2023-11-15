package algorythms;

public class BinarySearch {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(binarySearch(numbers, 9));



    }

    public static Integer binarySearch(int[] arr, int item){
        int low = 0, high = arr.length-1;

        while (low <= high){
            int mid = (low + high) / 2;
            int guess = arr[mid];

            if (guess == item){
                return mid;
            }
            if (guess > item){
                high = mid - 1;
            }else {
                low = mid + 1;
            }
        }

        return null;
    }
}
