
/**
 *
 * 
 * 
 * @author alejandrofigueroa
 */
public class Exceptions extends Exception {

    /**
     * Creates a new instance of <code>Exceptions</code> without detail message.
     */
    public Exceptions() {
    }

    /**
     * Constructs an instance of <code>Exceptions</code> with the specified
     * detail message.
     *
     * @param wrong
     */
    public Exceptions(String wrong) {
        super("");
    }// end of Exceptions Method 
}//end of Exceptions Class

/**
 * 
 * 
 */
class negativeMoneyException extends Exceptions{
    public negativeMoneyException(String x){
        super("");
    }
    }// end of negativeMoneyException

/**
 * 
 * 
 */
class negativeYearException extends Exceptions{
    public negativeYearException(String x){
        super("");
    }
    }// end of negativeYearException

/**
 * 
 * 
 */
class tooMuchTaxException extends Exceptions{
    public tooMuchTaxException(String x){
        super("");
    }
    }// end of tooMuchTaxException

class fileNotFoundEception extends Exceptions{
    public fileNotFoundEception(String x){
        super("");
    }
    }
    class makingTooMuchMoneyException extends Exception{
        public makingTooMuchMoneyException(String x){
            super("");
    }
    }
class bigBallerException extends Exception{
    public bigBallerException(String x){
        super("");
    }
    }

