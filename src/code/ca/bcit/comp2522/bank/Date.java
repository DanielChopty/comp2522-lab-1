package ca.bcit.comp2522.bank;
/**
 * The Date class represents a specific date (year, month, day).
 * It provides methods for validating, formatting, and determining the day of the week
 for a given date.
 * It also includes constants related to date calculations and validation.
 *
 * @author Daniel Chopty
 * @version 1.0
 */
public class Date {
    /**
     * Represents an externally sourced year.
     */
    private final int year;
    /**
     * Represents an externally sourced month.
     */
    private final int month;
    /**
     * Represents an externally sourced day.
     */
    private final int day;
    /**
     * The current year, used for validation.
     */
    public static final int CURRENT_YEAR = 2025;
    /**
     * The minimum valid year.
     */
    public static final int MIN_YEAR = 1800;
    /**
     * The minimum valid month number.
     */
    public static final int MIN_MONTH = 1;
    /**
     * The maximum valid month number.
     */
    public static final int MAX_MONTH = 12;
    /**
     * The minimum valid day number.
     */
    public static final int MIN_DAY = 1;
    /**
     * The maximum valid day for February in a non-leap year.
     */
    public static final int MAX_DAY_FEBRUARY_NO_LEAP = 28;
    /**
     * The maximum valid day for February in a leap year.
     */
    public static final int MAX_DAY_FEBRUARY_LEAP = 29;
    /**
     * The maximum valid day for a month with 30 days.
     */
    public static final int MAX_DAY_REGULAR_MONTH = 30;
    /**
     * The maximum valid day for a month with 31 days.
     */
    public static final int MAX_DAY_LONG_MONTH = 31;
    /**
     * The numeric code for January.
     */
    public static final int JANUARY = 1;
    /**
     * The numeric code for February.
     */
    public static final int FEBRUARY = 2;
    /**
     * The numeric code for March.
     */
    public static final int MARCH = 3;
    /**
     * The numeric code for April.
     */
    public static final int APRIL = 4;
    /**
     * The numeric code for May.
     */
    public static final int MAY = 5;
    /**
     * The numeric code for June.
     */
    public static final int JUNE = 6;
    /**
     * The numeric code for July.
     */
    public static final int JULY = 7;
    /**
     * The numeric code for August.
     */
    public static final int AUGUST = 8;
    /**
     * The numeric code for September.
     */
    public static final int SEPTEMBER = 9;
    /**
     * The numeric code for October.
     */
    public static final int OCTOBER = 10;
    /**
     * The numeric code for November.
     */
    public static final int NOVEMBER = 11;
    /**
     * The numeric code for December.
     */
    public static final int DECEMBER = 12;
    /**
     * The leap year interval for normal years (every 4 years).
     */
    public static final int LEAP_YEAR_INTERVAL_NORMAL = 4;
    /**
     * The interval adjustment for century years not divisible by 400 (e.g., 1900).
     */
    public static final int LEAP_YEAR_INTERVAL_ADJUST_100 = 100;
    /**
     * The interval adjustment for years divisible by 400 (e.g., 2000).
     */
    public static final int LEAP_YEAR_INTERVAL_ADJUST_400 = 400;
    /**
     * The determinant value used in leap year calculation.
     */
    public static final int LEAP_YEAR_DETERMINANT = 0;
    /**
     * The numeric code for Saturday.
     */
    public static final int SATURDAY = 0;
    /**
     * The numeric code for Sunday.
     */
    public static final int SUNDAY = 1;
    /**
     * The numeric code for Monday.
     */
    public static final int MONDAY = 2;
    /**
     * The numeric code for Tuesday.
     */
    public static final int TUESDAY = 3;
    /**
     * The numeric code for Wednesday.
     */
    public static final int WEDNESDAY = 4;
    /**
     * The numeric code for Thursday.
     */
    public static final int THURSDAY = 5;
    /**
     * The numeric code for Friday.
     */
    public static final int FRIDAY = 6;
    /**
     * Extracts the last two digits of the year for calculations.
     */
    public static final int LAST_TWO_DIGIT_EXTRACTOR = 100;
    /**
     * The constant representing the number four, used in calculations.
     */
    public static final int FOUR = 4;
    /**
     * The constant representing the number twelve, used in calculations.
     */
    public static final int TWELVE = 12;
    /**
     * The month code for January, used in calculations.
     */
    public static final int MONTH_CODE_JANUARY = 1;
    /**
     * The month code for February, used in calculations.
     */
    public static final int MONTH_CODE_FEBRUARY = 4;
    /**
     * The month code for March, used in calculations.
     */
    public static final int MONTH_CODE_MARCH = 4;
    /**
     * The month code for April, used in calculations.
     */
    public static final int MONTH_CODE_APRIL = 0;
    /**
     * The month code for May, used in calculations.
     */
    public static final int MONTH_CODE_MAY = 2;
    /**
     * The month code for June, used in calculations.
     */
    public static final int MONTH_CODE_JUNE = 5;
    /**
     * The month code for July, used in calculations.
     */
    public static final int MONTH_CODE_JULY = 0;
    /**
     * The month code for August, used in calculations.
     */
    public static final int MONTH_CODE_AUGUST = 3;
    /**
     * The month code for September, used in calculations.
     */
    public static final int MONTH_CODE_SEPTEMBER = 6;
    /**
     * The month code for October, used in calculations.
     */
    public static final int MONTH_CODE_OCTOBER = 1;
    /**
     * The month code for November, used in calculations.
     */
    public static final int MONTH_CODE_NOVEMBER = 4;
    /**
     * The month code for December, used in calculations.
     */
    public static final int MONTH_CODE_DECEMBER = 6;
    /**
     * The number of days in a week.
     */
    public static final int DAYS_IN_WEEK = 7;
    /**
     * The additional value for January and February when calculating the day of the
     week.
     */
    public static final int ALGORITHM_JANUARY_FEBRUARY_ADDITION = 6;
    /**
     * The additional value for 2000s when calculating the day of the week.
     */
    public static final int ALGORITHM_2000S_ADDITION = 6;
    /**
     * The additional value for 1800s when calculating the day of the week.
     */
    public static final int ALGORITHM_1800S_ADDITION = 2;
    /**
     * The starting year of the 19th century.
     */
    public static final int START_OF_19TH_CENTURY = 1800;
    /**
     * The ending year of the 19th century.
     */
    public static final int END_OF_19TH_CENTURY = 1899;
    /**
     * The starting year of the 21st century.
     */
    public static final int START_OF_21ST_CENTURY = 2000;
    /**
     * Initial value for the day of week algorithm calculation.
     */
    public static final String SATURDAY_STRING = "Saturday";
    /**
     * The string representation of Sunday.
     */
    public static final String SUNDAY_STRING = "Sunday";
    /**
     * The string representation of Monday.
     */
    public static final String MONDAY_STRING = "Monday";
    /**
     * The string representation of Tuesday.
     */
    public static final String TUESDAY_STRING = "Tuesday";
    /**
     * The string representation of Wednesday.
     */
    public static final String WEDNESDAY_STRING = "Wednesday";
    /**
     * The string representation of Thursday.
     */
    public static final String THURSDAY_STRING = "Thursday";
    /**
     * The string representation of Friday.
     */
    public static final String FRIDAY_STRING = "Friday";
    /**
     * The string representation of January.
     */
    public static final String JANUARY_STRING = "January";
    /**
     * The string representation of February.
     */
    public static final String FEBRUARY_STRING = "February";
    /**
     * The string representation of March.
     */
    public static final String MARCH_STRING = "March";
    /**
     * The string representation of April.
     */
    public static final String APRIL_STRING = "April";
    /**
     * The string representation of May.
     */
    public static final String MAY_STRING = "May";
    /**
     * The string representation of June.
     */
    public static final String JUNE_STRING = "June";
    /**
     * The string representation of July.
     */
    public static final String JULY_STRING = "July";
    /**
     * The string representation of August.
     */
    public static final String AUGUST_STRING = "August";
    /**
     * The string representation of September.
     */
    public static final String SEPTEMBER_STRING = "September";
    /**
     * The string representation of October.
     */
    public static final String OCTOBER_STRING = "October";
    /**
     * The string representation of November.
     */
    public static final String NOVEMBER_STRING = "November";
    /**
     * The string representation of December.
     */
    public static final String DECEMBER_STRING = "December";
    /**
     * Value that the day of week algorithm adjustment value is initialized to.
     */
    public static final int INITIAL_START_VALUE = 0;
    /**
     * Constructs a Date object with the specified year, month, and day.
     *
     * @param year the year of the date
     * @param month the month of the date
     * @param day the day of the date
     * @throws IllegalArgumentException if the year, month, or day is invalid
     */
    public Date(int year,
                int month,
                int day)
    {
        validateDate(year, month, day);
        this.year = year;
        this.month = month;
        this.day = day;
    }
    /**
     * Determines if the given year is a leap year.
     *
     * @param year the year to check
     * @return true if the year is a leap year, false otherwise
     */
    private static boolean isLeapYear(int year) {
        if (year % LEAP_YEAR_INTERVAL_NORMAL == LEAP_YEAR_DETERMINANT
                && year % LEAP_YEAR_INTERVAL_ADJUST_100 != LEAP_YEAR_DETERMINANT
                || year % LEAP_YEAR_INTERVAL_ADJUST_400 == LEAP_YEAR_DETERMINANT)
        {
            return true;
        } else {
            return false;
        }
    }
    /**
     * Validates the given year, month, and day to ensure they form a valid date.
     *
     * @param year the year to validate
     * @param month the month to validate
     * @param day the day to validate
     * @throws IllegalArgumentException if the date is invalid
     */
    private static void validateDate(int year, int month, int day)
    {
        if (year < MIN_YEAR || year > CURRENT_YEAR)
        {
            throw new IllegalArgumentException("Bad year: " + year);
        }
        if (month < MIN_MONTH || month > MAX_MONTH)
        {
            throw new IllegalArgumentException("Bad month: " + month);
        }
        if ((day < MIN_DAY
                || (month == FEBRUARY && isLeapYear(year) && day > MAX_DAY_FEBRUARY_LEAP)
                || (month == FEBRUARY && !isLeapYear(year) && day >
                MAX_DAY_FEBRUARY_NO_LEAP)
                || (month == APRIL
        ) || month == JUNE
                || month == SEPTEMBER
                || month == NOVEMBER) && (day > MAX_DAY_REGULAR_MONTH)
                || (month == JANUARY
                || month == MARCH
                || month == MAY
                || month == JULY
                || month == AUGUST
                || month == OCTOBER
                || month == DECEMBER) && (day > MAX_DAY_LONG_MONTH))
        {
            throw new IllegalArgumentException("Bad day: " + day);
        }
    }
    /**
     * Returns the year of the date.
     *
     * @return the year
     */
    public int getYear()
    {
        return year;
    }
    /**
     * Returns the month of the date.
     *
     * @return the month
     */
    public int getMonth()
    {
        return this.month;
    }
    /**
     * Returns the day of the date.
     *
     * @return the day
     */
    public int getDay()
    {
        return this.day;
    }
    public String getLongMonth(int month) {
        switch (month) {
            case JANUARY: return JANUARY_STRING;
            case FEBRUARY: return FEBRUARY_STRING;
            case MARCH: return MARCH_STRING;
            case APRIL: return APRIL_STRING;
            case MAY: return MAY_STRING;
            case JUNE: return JUNE_STRING;
            case JULY: return JULY_STRING;
            case AUGUST: return AUGUST_STRING;
            case SEPTEMBER: return SEPTEMBER_STRING;
            case OCTOBER: return OCTOBER_STRING;
            case NOVEMBER: return NOVEMBER_STRING;
            default: return DECEMBER_STRING;
        }
    }
    /**
     * Returns the date in "YYYY, MM, DD" format.
     *
     * @return the formatted date string
     */
    public String getYYYYMMDD()
    {
        return String.format("%04d-%02d-%02d", year, month, day);
    }
    /**
     * Returns the date in a long format "ex. thursday, September 3, 2020"
     *
     * @return the formatted date string
     */
    public String getLongDate()
    {
        final StringBuilder longDate;
        longDate = new StringBuilder();
        longDate.append(getLongMonth(month));
        longDate.append(" ");
        longDate.append(getDay());
        longDate.append(", ");
        longDate.append(getYear());
        return longDate.toString();
    }
    /**
     * Returns the month code for the given month.
     *
     * @param month the month for which to get the code
     * @return the month code
     */
    public int getMonthCode(int month)
    {
        switch (this.month)
        {
            case JANUARY: return MONTH_CODE_JANUARY;
            case FEBRUARY: return MONTH_CODE_FEBRUARY;
            case MARCH: return MONTH_CODE_MARCH;
            case APRIL: return MONTH_CODE_APRIL;
            case MAY: return MONTH_CODE_MAY;
            case JUNE: return MONTH_CODE_JUNE;
            case JULY: return MONTH_CODE_JULY;
            case AUGUST: return MONTH_CODE_AUGUST;
            case SEPTEMBER: return MONTH_CODE_SEPTEMBER;
            case OCTOBER: return MONTH_CODE_OCTOBER;
            case NOVEMBER: return MONTH_CODE_NOVEMBER;
            default: return MONTH_CODE_DECEMBER;
        }
    }
    /**
     * Returns the day of the week for a given numeric day of the week (0-6).
     *
     * @param dayOfWeekNumeric the numeric day of the week (0 for Saturday, 6 for Friday)
     * @return the name of the day of the week
     */
    public String getDayOfWeekString(int dayOfWeekNumeric)
    {
        switch (dayOfWeekNumeric)
        {
            case SATURDAY: return SATURDAY_STRING;
            case SUNDAY: return SUNDAY_STRING;
            case MONDAY: return MONDAY_STRING;
            case TUESDAY: return TUESDAY_STRING;
            case WEDNESDAY: return WEDNESDAY_STRING;
            case THURSDAY: return THURSDAY_STRING;
            default: return FRIDAY_STRING;
        }
    }
    /**
     * Calculates and returns the day of the week for the current date.
     *
     * @return the name of the day of the week for the current date
     */
    public String getDayOfWeek()
    {
        int numTwelves;
        int remainder;
        int fours;
        int afterAddingDay;
        int afterAddingMonthCode;
        int dayOfWeekNumeric;
        int startValue = INITIAL_START_VALUE;
        // Adjust start value based on leap years and century
        if (isLeapYear(year) && (month == JANUARY || month == FEBRUARY))
        {
            startValue += ALGORITHM_JANUARY_FEBRUARY_ADDITION;
            if (year >= START_OF_21ST_CENTURY)
            {
                startValue += ALGORITHM_2000S_ADDITION;
            }
            else if (year >= START_OF_19TH_CENTURY && year <= END_OF_19TH_CENTURY)
            {
                startValue += ALGORITHM_1800S_ADDITION;
            }
        }
        else if (year >= START_OF_21ST_CENTURY)
        {
            startValue += ALGORITHM_2000S_ADDITION;
        }
        else if (year >= START_OF_19TH_CENTURY && year <= END_OF_19TH_CENTURY)
        {
            startValue += ALGORITHM_1800S_ADDITION;
        }
        numTwelves = (year % LAST_TWO_DIGIT_EXTRACTOR) / TWELVE;
        remainder = (year % LAST_TWO_DIGIT_EXTRACTOR) - (numTwelves * TWELVE);
        fours = remainder / FOUR;
        afterAddingDay = this.day + fours + remainder + numTwelves + startValue;
        afterAddingMonthCode = afterAddingDay + getMonthCode(month);
        dayOfWeekNumeric = afterAddingMonthCode % DAYS_IN_WEEK;
        return getDayOfWeekString(dayOfWeekNumeric);
    }
}