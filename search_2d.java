import java.util.*;
class search_2d{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[3][3];
        System.out.println("Enter the array :");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the number u want to search it :");
        int target=sc.nextInt();
        int n=3;
        int m=3;
        int low=0;
        int high=(n*m)-1;
        while(low<=high){
            int mid=(low+(high-low)/2);
            if(a[mid/m][mid%m]==target){
                System.out.println("Number is found "+mid);
                break;
            }else if(a[mid/m][mid%m]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        if(low>high){
            System.out.println("Number is not found");
        }
    }
}