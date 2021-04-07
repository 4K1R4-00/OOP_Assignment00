/*
 *  @author
 *  -   Akmal 'Aisy Bin Rudy                (52215220045)
 *  -   Mohd Faiz Bin Radzi                 (52215220049)
 *  -   Danish Imran Bin Mohd Arif Archi    (52215220060)
 *  -   Nur Arifa Binti Nor Azlan           (52215220050)
 *
 */
public class YearMonth {
    private int monthNumber;

    //  Default YearMonth constructor
    YearMonth(){

    }

    YearMonth(int month){
        this.monthNumber    = month;
    }

    /*
     *  @params String monthName
     *
     *  @description
     *  The constructor takes in a month name as a String argument,
     *  Then it uses the String to assign the monthNumber field with the corresponding month in numerical form.
     *
     *  @return none
     */
    YearMonth(String monthName){
        switch (monthName){
            case "January":
                this.monthNumber = 1;
            break;
            case "February":
                this.monthNumber = 2;
            break;
            case "March":
                this.monthNumber = 3;
                break;
            case "April":
                this.monthNumber = 4;
                break;
            case "May":
                this.monthNumber = 5;
                break;
            case "June":
                this.monthNumber = 6;
                break;
            case "July":
                this.monthNumber = 7;
                break;
            case "August":
                this.monthNumber = 8;
                break;
            case "September":
                this.monthNumber = 9;
                break;
            case "October":
                this.monthNumber = 10;
                break;
            case "November":
                this.monthNumber = 11;
                break;
            case "December":
                this.monthNumber = 12;
                break;

        }
    }

    /*
     *  @params int monthNumber
     *
     *  @description
     *  The accessor takes in an int argument representing the month in numerical form,
     *  Then it compares whether the argument is greater than 12.
     *
     *  if the month is greater than 12, the monthNumber field is set to 1.
     *  else it sets the monthNumber field to the given argument.
     *
     *  @return void
     */
    public void setMonthNumber(int monthNumber) {
        if (monthNumber > 12) {
            this.monthNumber = 1;
        }
        else{
            this.monthNumber = monthNumber;
        }
    }

    /*
     *  @params none
     *
     *  @description
     *  The accessor returns the monthNumber field.
     *
     *  @return int monthNumber
     */
    public int getMonthNumber() {
        return this.monthNumber;
    }

    /*
     *  @params none
     *
     *  @description
     *  The method checks the monthNumber field with the equivalent month numerical
     *  and returns a string equivalent
     *
     *  @return String
     */
    public String getMonthName(){
        if (this.monthNumber == 1) {
            return "January";
        } else if (this.monthNumber == 2) {
            return "February";
        } else if (this.monthNumber == 3) {
            return "March";
        } else if (this.monthNumber == 4) {
            return "April";
        } else if (this.monthNumber == 5) {
            return "May";
        } else if (this.monthNumber == 6) {
            return "June";
        } else if (this.monthNumber == 7) {
            return "July";
        } else if (this.monthNumber == 8) {
            return "August";
        } else if (this.monthNumber == 9) {
            return "September";
        } else if (this.monthNumber == 10) {
            return "October";
        } else if (this.monthNumber == 11) {
            return "November";
        } else if (this.monthNumber == 12) {
            return "December";
        } else {
            return "Invalid Condition";
        }

    }

    /*
     *  @params none
     *
     *  @description
     *  The method checks the monthNumber field with the equivalent month numerical
     *  and converts the monthNumber with a string equivalent
     *
     *  @return String
     */
    public String toString(){
        if (this.monthNumber == 1) {
            return "January";
        } else if (this.monthNumber == 2) {
            return "February";
        } else if (this.monthNumber == 3) {
            return "March";
        } else if (this.monthNumber == 4) {
            return "April";
        } else if (this.monthNumber == 5) {
            return "May";
        } else if (this.monthNumber == 6) {
            return "June";
        } else if (this.monthNumber == 7) {
            return "July";
        } else if (this.monthNumber == 8) {
            return "August";
        } else if (this.monthNumber == 9) {
            return "September";
        } else if (this.monthNumber == 10) {
            return "October";
        } else if (this.monthNumber == 11) {
            return "November";
        } else if (this.monthNumber == 12) {
            return "December";
        } else {
            return "Invalid Condition";
        }

    }

    /*
     *  @params YearMonth month
     *
     *  @description
     *  The method takes in a YearMonth object,
     *  Then it compares whether its monthNumber is equal to the current object monthNumber field.
     *
     *  @return boolean
     */
    public boolean equal(YearMonth month){
        if (month.getMonthNumber() == this.monthNumber) {
            return true;
        }
        else{
            return false;
        }
    }

    /*
     *  @params YearMonth month
     *
     *  @description
     *  The method takes in a YearMonth object,
     *  Then it compares whether its monthNumber is greater than the current object monthNumber field.
     *
     *  @return boolean
     */
    public boolean greaterThan(YearMonth month){
        if (this.monthNumber > month.getMonthNumber()) {
            return true;
        }
        else{
            return false;
        }
    }

    /*
     *  @params YearMonth month
     *
     *  @description
     *  The method takes in a YearMonth object,
     *  Then it compares whether its monthNumber is lesser than the current object monthNumber field.
     *
     *  @return boolean
     */
    public boolean lessThan(YearMonth month){
        if (this.monthNumber < month.getMonthNumber()) {
            return true;
        }
        else{
            return false;
        }
    }
}
