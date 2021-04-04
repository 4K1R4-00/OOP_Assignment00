public class YearMonth {
    private int monthNumber;

    YearMonth(){

    }

    YearMonth(int month){
        this.monthNumber    = month;
    }

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

    public void setMonthNumber(int monthNumber) {
        if (monthNumber > 12) {
            this.monthNumber = 1;
        }
        else{
            this.monthNumber = monthNumber;
        }
    }

    public int getMonthNumber() {
        return this.monthNumber;
    }

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

    public boolean equal(YearMonth month){
        if (month.getMonthNumber() == this.monthNumber) {
            return true;
        }
        else{
            return false;
        }
    }

    public boolean greaterThan(YearMonth month){
        if (this.monthNumber > month.getMonthNumber()) {
            return true;
        }
        else{
            return false;
        }
    }

    public boolean lessThan(YearMonth month){
        if (this.monthNumber < month.getMonthNumber()) {
            return true;
        }
        else{
            return false;
        }
    }
}
