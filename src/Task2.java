import java.util.Arrays;

public class Task2 {

    public static int[] task(int[] arr, int b) {

        if (arr.length < 0) {
            System.out.println("Massive not be empty");
        }
        Arrays.sort(arr);
        int firstTemp = 0;
        int last = arr.length - 1;
        while (firstTemp < last) {
            int sum = arr[firstTemp] + arr[last];
            if (sum == b) {
                System.out.println(arr[firstTemp] + "," + arr[last]);
                firstTemp++;
                last--;
            } else if (sum < b) firstTemp++;
            else last--;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {0, 12, 34, 12, 5, 18};
        task(arr, 18);

    }
}
