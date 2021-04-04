public class DemoMonth1 {
    public static void main(String args[]){
        YearMonth month = new YearMonth();

        for(int i = 1; i < 12; i++ ){
            month.setMonthNumber(i);
            System.out.println("Month " + month.getMonthNumber() + " is " + month.toString());
        }
    }

}
