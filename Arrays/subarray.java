public class subarray {
    public static void main(String[] args) {
     int array[]={2,5,8,9,10};
     int n=array.length;
     int sum[]=new int[(n*(n+1)/2)];
     int count=0;
     for(int i=0;i<n;i++){
         for(int j=i;j<n;j++){
             int temp=0;
             for(int k=i;k<=j;k++){
                 System.out.print(+array[k]+"\t");
                 temp +=array[i];
             }
             sum[count]=temp;
             count++;
             System.out.println("\n");
         }
     }
    // System.out.println("Greatest sum: " + sum[4]);
     
    }
} 