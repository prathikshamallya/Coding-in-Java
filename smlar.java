import java.util.*;

public class smlar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,i;
        System.out.println("Enter the no of elements in an array: ");
        n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter array elements: ");
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
       }
       int min,max;
       if(n==1)
       {
        min=a[0];
        max=a[0];
        System.out.println("Min is: "+min);
        System.out.println("Max is: "+max);
       }
       else if(n==2)
       {
        min=a[0];
        max=a[0];
        if(a[1]>max){
            min=a[1];
            max=a[0];
        }else{
            min=a[0];
            max=a[1];
        }
        System.out.println("Min is: "+min);
        System.out.println("Max is: "+max);
       }
        else{
            min=a[0];
            max=a[0];
            for(i=1;i<n;i++)
            {
            if(a[i]>max){
                max=a[i];
            }
            if(a[i]<min){
                min=a[i];
            }
            }
            System.out.println("Min is: "+min);
            System.out.println("Max is: "+max);
        }
    }
}
