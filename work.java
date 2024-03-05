import java.util.*;

enum weekOfDays{
    sunday(0),monday(1),tuesday(2),wednesday(3),thursday(4),friday(5),saturday(6);
    public int day;
    weekOfDays(int d){
        day=d;
    }

        //find if working day or not
    public String getValue(){
        if(day>=1&&day<=5){

            return "working Day";
        }else{
            return "not working day";
        }
    }
}

class work{
    public static void generatecode() {
        for(weekOfDays da:weekOfDays.values()){
             System.out.println(da);
        }
    }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        generatecode();
        System.out.println("enter a day");
        String di=sc.next();
        String p;
        for(weekOfDays w:weekOfDays.values()){
             p=w.toString();
             if(p.equals(di)){
                System.out.println(w.getValue());
             }
        }
    }
}