public class Main
{
    public static void main(String[] args) throws java.io.IOException {
        
        int[] ar={0,1,0,3,12};
        
        for(int i=0;i<ar.length-1-i;i++){
            if(ar[i]==0){
                int temp=ar[i];
                for(int j=i;j<ar.length-1-i;j++){
                    ar[j]=ar[j+1];
                }
                ar[ar.length-1-i]=temp;
            }
        }
        for(int a:ar)
        System.out.print(a+" ");
    }
}
