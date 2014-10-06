
/**
 * This is my exception Class, it has custom built exceptions for different 
 * scenarios throughout the program. 
 * 
 * @author AlejandroFigueroa
 */
public class Exceptions extends Exception {

    /**
     * Creates a new instance of <code>Exceptions</code> without detail message.
     * 
     */
    public Exceptions() {
    }// End of Exceptions Method 

    /**
     * Constructs an instance of <code>Exceptions</code> with the specified
     * detail message.
     *
     * @param wrong
     */
    public Exceptions(String wrong) {
        super("");
    }// End of Exceptions Method 
    
}//End of Exceptions Class

/**
 * this Exception was built to handle the users input as a negative quantity
 * for money. 
 * 
 */
class negativeMoneyException extends Exceptions{
    public negativeMoneyException(String x){
        super("");
    }// End of negativeMoneyException Method
    }// End of negativeMoneyException Class

/**
 * This Exception was built to handle the users input avoiding
 * negative years as a form of input
 * 
 */
class negativeYearException extends Exceptions{
    public negativeYearException(String x){
        super("");
    }// End of negativeYearException Method
    }// End of negativeYearException Class

/**
 * This Exception was built to handle the users input of too high a Tax
 * rate, it purpose is to avoid the user breaking the program and restricting 
 * their input from 1 - 100%
 * 
 */
class tooMuchTaxException extends Exceptions{
    public tooMuchTaxException(String x){
        super("");
    }// End of tooMuchTaxException Method
    }// End of tooMuchTaxException Class

/**
 * This exception was built to handle the user input but restricting him
 * to only enter letters and a ending in ".bin" for example
 * 
 */
class fileNotFoundEception extends Exceptions{
    public fileNotFoundEception(String x){
        super("");
    }// End of fileNotFoundEception Method
    }// End of fileNotFoundEception Class

/**
 * This Exception was built to handle the users input restricting
 * the amount of money that can be contributed on a monthly bases.
 * by doing so it avoid the monthly from growing beyond the 
 * capability of doubles.
 * 
 */
class makingTooMuchMoneyException extends Exception{
        public makingTooMuchMoneyException(String x){
            super("");
    }// End of makingTooMuchMoneyException Method
    }// End of makingTooMuchMoneyException clss

/**
 * This Exception was built to handle the users input restricting
 * the amount of money that can be contributed on a monthly bases.
 * by doing so it avoid the monthly from growing beyond the 
 * capability of doubles.
 * 
 */
class bigBallerException extends Exception{
    public bigBallerException(String x){
        super("");
    }// End of bigBallerException Method
    }// End of bigBallerException Class

