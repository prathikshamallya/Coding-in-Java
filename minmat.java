import java.util.*;

public class minmat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of Rows & Columns in an array:");
        int m=sc.nextInt();
        int n=sc.nextInt();
        System.out.println("Enter the elements of the array");
        int i,j;
        int a[][]=new int[m][n];
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("The array is:");
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        int min=99;
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                if(a[i][j]<min){
                    min=a[i][j];   
                }
            } 
            
        } 
        System.out.println("The Smallest element in the matrix is: "+min);   
        
    }
}