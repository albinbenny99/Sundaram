package first;

public class findmissingnum {
    public static void main(String[] args) {
        int [] arr={2,3,5,6,7,9,11};
        if(arr[0]!=1){
            System.out.println(1);
        }
        for (int i=0;i<arr.length-1;i++){
            int expected=arr[i]+1;

            if(arr[i+1]>expected){
                System.out.println(expected);
            }

            }

    }
}
