import java.util.*;

enum weekOfDays{
    sunday(0),monday(1),tuesday(2),wednesday(3),thursday(4),friday(5),saturday(6);
    public int day;
    weekOfDays(int d){
        day=d;
    }

    public String getValue(){
        //System.out.println(day);
        if(day>=1&&day<=5){

            return "working Day";
        }else{
            return "not working day";
        }
    }
}

class work{
    public static void generatecode() {
        // weekOfDays w;
        // w=weekOfDays.monday;
        
        
        // System.out.println(di+"is "+di.getValue());
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
        // System.out.println(di+" is "+p.getValue());
    }
}