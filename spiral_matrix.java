import java.util.*;
class spiral_matrix{
	public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[3][3];
        System.out.println("Enter the array :");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int n=a.length;
        int left=0,right=n-1;
        int top=0,down=n-1;
        int index=1;
        while(left<=right && top<=down){
            for(int j=left;j<=right;j++){
                a[top][j]=index;
                index++;
            }
            top++;
            for(int i=top;i<=down;i++){
                a[i][right]=index;
                index++;
            }
            right--;
            for(int j=right;j>=left;j--){
                a[down][j]=index;
                index++;
            }
            down--;
            for(int i=down;i>=top;i--){
                a[i][left]=index;
                index++;
            }
            left++;
        }
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            System.out.print(a[i][j]+" ");
        }
        System.out.println();
    }
}
}