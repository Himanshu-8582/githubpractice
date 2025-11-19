import java.util.Arrays;

public class SumOfNums {
    public static int sumOfNums(int arr[]) {
        return Arrays.stream(arr).sum();
    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.println(sumOfNums(arr));
    }
}
