/*
 *  @author
 *  -   Akmal 'Aisy Bin Rudy                (52215220045)
 *  -   Mohd Faiz Bin Radzi                 (52215220049)
 *  -   Danish Imran Bin Mohd Arif Archi    (52215220060)
 *  -   Nur Arifa Binti Nor Azlan           (52215220050)
 *
 */
public class DemoMonth2 {
    public static void main(String args[]){

        //  Instantiate YearMonth object with argument of 12, to m1
        YearMonth m1 = new YearMonth(12);

        //  Instantiate YearMonth object with argument of 5, to m2
        YearMonth m2 = new YearMonth(5);

        //  Print out the monthNumber and converted month name of both m1 and m2 variable.
        System.out.println("Month " + m1.getMonthNumber() + " is " + m1.toString());
        System.out.println("Month " + m2.getMonthNumber() + " is " + m2.toString());

        //  Compare whether m1 and m2 monthNumber is equal
        if (m1.equal(m2)) {
            System.out.println(m1.getMonthName() + " and " + m2.getMonthName() + " are equal");
        }
        else{
            System.out.println(m1.getMonthName() + " and " + m2.getMonthName() + " are NOT equal");
        }

        //  Compare whether m1 monthNumber is greater than m2 monthNumber.
        if (m1.greaterThan(m2)) {
            System.out.println(m1.getMonthName() + " is greater than " + m2.getMonthName() );
        }
        else{
            System.out.println(m1.getMonthName() + " is NOT greater than " + m2.getMonthName() );
        }

        //  Compare whether m1 monthNumber is lesser than m2 monthNumber.
        if (m1.lessThan(m2)) {
            System.out.println(m1.getMonthName() + " is less than " + m2.getMonthName() );
        }
        else{
            System.out.println(m1.getMonthName() + " is NOT less than " + m2.getMonthName() );
        }
    }
}
