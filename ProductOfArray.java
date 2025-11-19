import java.util.Arrays;

public class ProductOfArray {
    public static int product(int arr[]) {
        return Arrays.stream(arr).reduce(1, (a, b) -> a * b);
    }
    
    public static int mult(int arr[]) {
        int pdt = 1;
        for (int x : arr)
            pdt *= x;
        return pdt;
    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.println(product(arr));
    }
}
