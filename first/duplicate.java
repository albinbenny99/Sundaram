package first;

public class duplicate {
    public static void main(String[] args) {
        int[] arr = {6, 6, 6, 2, 3, 6, 1, 2};
        boolean[] visited = new boolean[arr.length];

        System.out.print("Duplicate values: ");

        for (int i = 0; i < arr.length; i++) {
            if (visited[i]) continue;

            boolean isDuplicate = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    isDuplicate = true;
                }
            }
            if (isDuplicate) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
