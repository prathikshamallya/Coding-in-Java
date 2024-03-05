import java.util.*;

public class reverseNumbersInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number of elements in an array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter Array Elements");
        int i;
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("The numbers in array before reverse are: ");
        for(i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        int rem=0,rev=0;
        int b[]=new int[n];
        System.out.print("The numbers in array After reverse are: ");
        for(i=0;i<n;i++){
            while(a[i]!=0){
                rem=a[i]%10;
                rev=rev*10+rem;
                a[i]=a[i]/10;
                b[i]=rev;
                rev=rem;
            }
        }
        for(i=0;i<n;i++)
            System.out.print(b[i]+" ");
    }
}
