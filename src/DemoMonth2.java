public class DemoMonth2 {
    public static void main(String args[]){
        YearMonth m1 = new YearMonth(12);
        YearMonth m2 = new YearMonth(5);

        System.out.println("Month " + m1.getMonthNumber() + " is " + m1.toString());
        System.out.println("Month " + m2.getMonthNumber() + " is " + m2.toString());

        if (m1.equal(m2)) {
            System.out.println(m1.getMonthName() + " and " + m2.getMonthName() + " are equal");
        }
        else{
            System.out.println(m1.getMonthName() + " and " + m2.getMonthName() + " are NOT equal");
        }

        if (m1.greaterThan(m2)) {
            System.out.println(m1.getMonthName() + " is greater than " + m2.getMonthName() );
        }
        else{
            System.out.println(m1.getMonthName() + " is NOT greater than " + m2.getMonthName() );
        }

        if (m1.lessThan(m2)) {
            System.out.println(m1.getMonthName() + " is less than " + m2.getMonthName() );
        }
        else{
            System.out.println(m1.getMonthName() + " is NOT less than " + m2.getMonthName() );
        }
    }
}
