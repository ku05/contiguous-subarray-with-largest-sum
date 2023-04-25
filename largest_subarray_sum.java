import java.util.*;
public class largest_subarray_sum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[]=new int[9];
        System.out.println("Enter the array :");
        for(int i=0;i<9;i++){
            a[i]=sc.nextInt();
        }
        int max_sum=Integer.MIN_VALUE;
        int sum_ending=0;
        int start=0,end=0,s=0;
        for(int i=0;i<9;i++){
            sum_ending=sum_ending+a[i];
            if(max_sum<sum_ending){
                max_sum=sum_ending;
                start=s;
                end=i;
            }
            if(sum_ending<0){
                sum_ending=0;
                s=i+1;
            }
        }
        System.out.println("Largest sum of sub array is :"+max_sum);
        System.out.println(" Starting Index is :"+start+"Ending index is :"+end);
    }
}
