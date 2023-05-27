

import javax.sql.rowset.spi.SyncResolver;
 class Array16 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int length = arr.length;
        if (length % 2 == 0) {
            for (int i = 0; i < arr.length / 2; i++) {
                int start = 0;
                int end = length / 2 - 1;
                while (start < end) {
                    int temp = arr[start];
                    arr[start] = arr[end];
                    arr[end] = temp;
                    start++;
                    end--;

                }

            }
            for (int i = arr.length / 2; i < arr.length; i++) {
                int start = arr.length / 2;
                int end = arr.length - 1;
                while (start < end) {
                    int temp = arr[start];
                    arr[start] = arr[end];
                    arr[end] = temp;
                    start++;
                    end--;

                }

            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    

    
}
