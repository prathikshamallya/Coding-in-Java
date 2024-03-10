import java.util.*;

class rotate{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of elements in the array");
        int n=sc.nextInt();
        System.out.println("Enter the array elemets");
        int i,j;
        int a[]=new int[n];
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("The array elements are: ");
        for(i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();

        System.out.print("Enter the no of places the array to be rotated: ");
        int rot=sc.nextInt();

        for(i=0;i<rot;i++){
           int temp=a[n-1];
           j=n-1;
           while(j!=0){
            a[j]=a[j-1];
            j--;
           }
           a[0]=temp;
        }

        for(i=0;i<n;i++)
            System.out.print(a[i]+" ");
        sc.close();
    }
}