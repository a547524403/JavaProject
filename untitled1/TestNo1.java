class BirthDate{
    private int day;
    private int month;
    private int year;

    public BirthDate(int d,int m,int y){
        day =d; month=m; year=y;
    }
    public void setDay(int d){
        day =d;
    }
    public void setMonth(int m){
        month =m;
    }
    public void setYear(int y){
        year =y;
    }public int getDay(){
        return day;
    }
    public int getMonth(){
        return month;
    }
    public int getYear(){
        return year;
    }
    public void disPlay(){
        System.out.println(day + "." +month +"."+ year);
    }
}
public class TestNo1 {
    public static void main(String args[]){
        TestNo1 test=new TestNo1();
        int date =9;
        BirthDate d1=new BirthDate(7,7,1970);
        BirthDate d2=new BirthDate(1,1,1988);
        test.change1(date);
        test.change2(d1);
        test.change3(d2);
        System.out.println("date" + date);
        d1.disPlay();
        d2.disPlay();
    }
    public void change1 (int i){
        i=1234;
    }
    public void change2(BirthDate b){
        b=new BirthDate(22,2,2200);
    }
    public void change3(BirthDate b){
        b.setDay(22);
    }
}