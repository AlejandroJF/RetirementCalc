
/**
 *This Class constructs and creates the toString for the ArrayList it creates
 * variables and parameters for internal usage. Additionally it creates Getter
 * methods used in the construction of the ArryList in the finalString method
 * from Retirement Class.
 * 
 * @author alejandrofigueroa
 */
public class RetirementYears
{
    private final int year;
    private final double preTB;
    private final double postTB;
    private final double Total;
                                    
    /**
     *This is the constructor method, i takes in the parameters and creates
     * instances of them to be used in the toString for creating the string
     * for the ArrayList
     * 
     * @param year
     * @param preTB
     * @param postTB
     * @param Total
     */
    public RetirementYears(int year, double preTB, double postTB, double Total)
    {
        this.year = year;
        this.preTB = preTB;
        this.postTB = postTB;
        this.Total = Total;
    }// end of RetirementYears
    
    /**
     * This Method creates my string and it creates the formatting of said string
     * additionally this toString method is in the Retirement Class
     * when building the ArrayList and it
     * 
     *@return result
     *@Override
     */
    public String toString()
    {
        String result = (year + "             " + preTB + "                  " + postTB + "                " + Total +  "\n");
        return result;
    }// end of toString

    /**
     *This method gets the location for Year from the toString method and returns
     * it to the finalString Method in Retirement class when it is called for 
     * building the ArryList
     * 
     * @return year
     */
    public double getYear() {
        return year;
    }// end of getYear

    /**
     *This method gets the location for preTB from the toString method and returns
     * it to the finalString Method in Retirement class when it is called for 
     * building the ArryList
     * 
     * @return preTB
     */
    public double getPreTB() {
        return preTB;
    }// end of getPreTB

    /**
     *This method gets the location for postTB from the toString method and returns
     * it to the finalString Method in Retirement class when it is called for 
     * building the ArryList
     * 
     * @return postTB
     */
    public double getPostTB() {
        return postTB;
    }// end of etPostTB

    /**
     *This method gets the location for Total from the toString method and returns
     * it to the finalString Method in Retirement class when it is called for 
     * building the ArryList
     * 
     * @return Total
     */
    public double getTotal() {
        return Total;
    }//getTotal    
}// end of RetirementYears Class