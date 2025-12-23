public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int[] reversedArr = new int[n];

        for(int i = 0; i < n; i++){
            reversedArr[i] = arr[n - 1 - i];
        }

        System.out.print("Original Array: ");
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Reversed Array: ");
        for(int num : reversedArr){
            System.out.print(num + " ");
        }
    }
}
