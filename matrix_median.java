import java.util.*;
class matrix_median{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[3][3];
        System.out.println("Enter the array :");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int b[]=new int[9];
        int k=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                b[k++]=a[i][j];
            }
        }
        System.out.println("After conver matrix in 1d array is :");
        for(int i=0;i<9;i++){
            System.out.print(b[i]+" ");
        }
        System.out.println();
        System.out.println("Now sort the array to find the midean :");
        for(int i=0;i<8;i++){
            for(int j=i+1;j<9;j++){
                if(b[i]> b[j]){
                    int temp=b[i];
                    b[i]=b[j];
                    b[j]=temp;
                }
            }
        }
        for(int i=0;i<9;i++){
            System.out.print(b[i]+" ");
        }
        System.out.println();
        int n=b.length;
        int mid = n / 2;
        if (n % 2 == 0) {
            mid=(b[mid - 1] + b[mid]) / 2;
            System.out.println("median is :"+mid);
        } else {
            mid = b[mid];
            System.out.println("Median is "+mid);
        }
    }
}