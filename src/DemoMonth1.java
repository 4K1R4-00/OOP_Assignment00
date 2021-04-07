/*
 *  @author
 *  -   Akmal 'Aisy Bin Rudy                (52215220045)
 *  -   Mohd Faiz Bin Radzi                 (52215220049)
 *  -   Danish Imran Bin Mohd Arif Archi    (52215220060)
 *  -   Nur Arifa Binti Nor Azlan           (52215220050)
 *
 */
public class DemoMonth1 {
    public static void main(String args[]){

        //  Instantiate a YearMonth object into the variable month.
        YearMonth month = new YearMonth();

        //  Loop over all 12 months, starting from 1
        for(int i = 1; i < 12; i++ ){

            //  Set the month number using the iterator
            month.setMonthNumber(i);

            //  Print out the month number and its month name equivalent
            System.out.println("Month " + month.getMonthNumber() + " is " + month.toString());
        }
    }

}
