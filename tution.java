import java.util.*;

public class tution {

    public static void generateFee(float tution,float perce){
        float nextfee=tution*(perce/100);
        float finalFees=tution+nextfee;
        int i=1;
        while(i!=11){
            System.out.println("The fee after "+i+" year is = " +finalFees);
            finalFees=finalFees+nextfee;
            i++;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the tution fee of the year");
        float tut=sc.nextFloat();
        System.out.println("Enter the increase percentage");
        float per=sc.nextFloat();
        generateFee(tut,per);
    } 
}
