package first;

public class commonelementsintwoarrays{
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 1};
        int[] arr2 = {4, 5, 6, 1, 1,1,3};

        System.out.println("Common elements:");

        for (int i = 0; i < arr1.length; i++) {
            boolean alreadyPrinted = false;

            // Check if arr1[i] was already printed
            for (int k = 0; k < i; k++) {
                if (arr1[i] == arr1[k]) {
                    alreadyPrinted = true;
                    break;
                }
            }
            if (alreadyPrinted) continue;

            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.println(arr1[i]);
                    break;
                }
            }
        }
    }
}
