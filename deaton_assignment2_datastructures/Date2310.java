/* Date2310
 * public class Date2310
 * takes date and can be output as word format or number format, also includes a function for incrimenting the day
 * Parameters:
 * int month - integer value for month
 * int day - integer value for day
 * int year - integet value for year
 * int monthMaxDay - integer value for the given months last day
 * months[] - an array containing the months in String format
 */
package deaton_assignment2_datastructures;

/**
 *
 * @author Adeat
 */
public class Date2310 {
    int monthMaxDay;
    int day;
    int month;
    int year;
    String[] months = {"January", "Febuary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    
    public Date2310(int month, int day, int year){
        this.month = month;                                                     // takes given values and initalizes an object of the Date2310 class. if day is > 0 and does not exceed the maximum day for given month, and month is > 0 and <=12
        getMaxDay();
        this.day = day;
        this.year = year;
        if ((this.day < 0) || (this.day > monthMaxDay)){
            throw new IllegalArgumentException("Invalid Day Value:" + day);
        }
        if ((this.month < 0) || (this.month > 12)){
            throw new IllegalArgumentException("Invalid Month Value:" + month);
        }
    }
    // Date2310
    // public Date2310(int month, int day, int year)
    // initalizes an object of the date2310 class with given integers for month day and year
    // Parameters:
    // int month, int day, int year
    // Precondition:
    // day is > 0 and does not exceed the maximum day for given month, and month is > 0 and <=12
    // Returns:
    // Date2310 that has been initialized with int month, int day, int year
    // Throws IllegalArgumentException:
    // indicates given values do not make sense for the calendar format
    public Date2310(){
        this.day = 1;
        this.month = 1;
        this.year = 1;
    }
    // Date2310
    // public Date2310()
    // initalizes a Date2310 object with day 1 month 1 year 1
    // Parameters:
    // Precondition:
    // Returns:
    // Date2310 object initialized with day 1 month 1 year 1
    public Date2310 cloneDate(){                                                // creating a new object in memory, setting its values equal to the values of the class that
        Date2310 cd = new Date2310();                                           // invoked the method, then returning the object reference of that class;
        cd.day = this.day;
        cd.month = this.month;
        cd.year = this.year;
        return cd;
    }
    // cloneDate
    // public Date2310 cloneDate()
    // Parameters:
    // Precondition:
    // Returns:
    // Date2310 object that has values cloned from class it was called on
    public boolean equalsDate(Date2310 x){                                      // if the input classs' values for day, month, and year are the same as the calling class then return true, else return false
          if (x.year == this.year && x.month == this.month && x.day == this.day ) {
              return true;
          }
          else{
              return false;
          }
      }
    // equalsDate
    // public boolean equalsDate(Date2310 x)
    // Parameters:
    // Date2310 x
    // Precondition:
    // given object is of Date2310 class
    // Returns:
    // boolean value if values for date month and year of given parameter is equal to the object it was invoked on
    public void incrimentDay(){                                                 // if the day incrimented would be creater than the monthMaxDay, and the month is < 12, incriment month
        getMaxDay();                                                            // getMaxDay(), and set day = 1
        if(((day + 1) > monthMaxDay) && (month < 12)){
            month++;
            getMaxDay();
            day = 1;
        }
        else if(((day + 1) > monthMaxDay) && (month == 12)){                    // if the day incrimented would be greater than the monthMaxDay, and the month is 12, set day and month to 1
            month = 1;                                                          // incriment year, and getMaxDay()
            day = 1;
            year++;
            getMaxDay();
        }
        else {                                                                  // else just incriment the day
            day++;
        }
    }
    // incrimentDay
    // public void incrimentDay()
    // Parameters:
    // Precondition:
    // Returns:
    // next proper calender date, checking for month and year rollover
    public String toNumberFormat(){
        String out = (month + " / " + day + " / " + year);                      // creates a string of the date formated into numbers
        return out;
    }
    // toNumberFormat
    // public String toNumberFormat()
    // Parameters:
    // Precondition:
    // Returns:
    // Date2310 parameters in a numerical date format
    public String toWordFormat(){                                               // creates a string of the date formated into words, by casting the month into a value that would make sense for the 
        int arraycast = month - 1;                                              // months[] array, then checking what the date suffix would be by checking the ones place and updating the suffix String with the proper suffix
        String suffix;                                                          // then printing the value from the array, the int day followed by the suffix, then the year
        switch (day % 10) {
            case 1:
                suffix = "st";
                break;
            case 2:
                suffix = "nd";
                break;
            case 3:
                suffix = "rd";
                break;
            default:
                suffix = "th";
                break;
        }
        String out = (months[arraycast] + " " + day + suffix + ", " + year );
        return out;
    }
    // toNumberFormat
    // public String toWordFormat()
    // Parameters:
    // Precondition:
    // Returns:
    // Date2310 parameters in a word date format
    private void getMaxDay(){                                                   // updating the monthMaxDay int by checking the value for month and updating accordingly, if the month is 2
        switch (month){                                                         // and the year is divisible by 4, it is a leap year, updating the value for monthMaxDay accordingly
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                monthMaxDay = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:    
                monthMaxDay = 30;
                break;
            case 2:
                if((year % 4) == 0){
                    monthMaxDay = 29;
                }
                else{
                    monthMaxDay = 28;
                }
                break;
            
            
        }
    // getMaxDay
    // private void getMaxDay()
    // Parameters:
    // Precondition:
    // Returns:
    // updates int monthMaxDay to the max day for month stored in int month
    }
    
}
