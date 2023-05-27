

public class secondLargest {
    public static void main(String[] args) {
        int[] a={122,55,23,45,97,99,123,120};
        int largest=a[0];
        int secLarge=a[0];
        for (int i = 0; i < a.length; i++) {
            if(a[i]>largest){
                secLarge=largest;
                largest=a[i];
            }
            else if(a[i]>secLarge)
              secLarge=a[i];
        }
        System.out.println(secLarge);
    }
    
}
