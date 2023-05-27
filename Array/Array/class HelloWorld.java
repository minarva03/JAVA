package Array;

class A{
    public static void main(String[] args) {
        int[] x={1,2,3,4};
        int[] y={10,20,30,40};
        int[] z=new int[x.length+y.length];
        // System.out.println(z.length);
        int j=0;
        for(int i=0;i<x.length;i++){
            z[i]=x[i];
            j++;
            z[j]=y[i];
            j++;
        }
        for(j=0;j<z.length;j++){
            System.out.println(z[j]);
        }
    
            

            
        }
    }
