
import java.util.*;

public class Task {
    public static double[] task(double[] arr) {
        Map<Double, Integer> map = new LinkedHashMap<>();
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            if (arr[i] < 0) {
                throw new RuntimeException();
            }
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }

        }
        map.forEach((k, v) -> System.out.println(k + ""));
        return arr;
    }

    public static void main(String[] args) {
        double[] ab = {22.22, 22.22, 33.44, 22.22, 22.22};
        task(ab);

    }
}
