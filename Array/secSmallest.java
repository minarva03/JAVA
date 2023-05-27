

public class secSmallest {
    public static void main(String[] args) {
        int[] a={122,55,23,25,45,97,99,123,120,12,9};
        int smallest=a[0];
        int secSmall=a[0];
        for (int i = 0; i < a.length; i++) {
            if(a[i]<smallest){
                secSmall=smallest;
                smallest=a[i];
            }
            else if(a[i]>smallest && a[i]<secSmall){
                secSmall=a[i];
            }
        }
        System.out.println(secSmall);
    }
    
}
