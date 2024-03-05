import java.util.*;

enum monthOfYear{
    January(13),Febraury(14),March(3),April(4),May(5),June(6),July(7),August(8),September(9),October(10),November(11),December(12);

    public int month;
    monthOfYear(int m){
        month=m;
    }

    public String getMonth(){
        if(month>=6 && month<=9){
            return "Monsoon Season";
        }else if(month<=14&&month>=10){
            return "Winter Season";
        }else{
            return "Summer Season";
        }
    }

}

public class yearMonth{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the month to know the season: ");
        String ms=sc.next();
        for(monthOfYear my:monthOfYear.values()){
            String me=my.toString();
            if(me.equals(ms)){
                System.out.println(my.getMonth());
            }
        }
    }
}