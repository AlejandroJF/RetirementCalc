
/**
 *This Class constructs and creates the toString for the ArrayList it creates
 * variables and parameters for internal usage. Additionally it creates Getter
 * methods used in the construction of the ArryList in the finalString method
 * from Retirement Class.
 * 
 * @author AlejandroFigueroa
 */
public class RetirementYears{
    
    private final int year;
    private final double preTB;
    private final double postTB;
    private final double Total;
                                    
    /**
     * This is the constructor method, it takes in the parameters and creates
     * instances of them to be used in the toString for creating the string
     * for the ArrayList
     * 
     * @param year
     * @param preTB
     * @param postTB
     * @param Total
     */
    public RetirementYears(int year, double preTB, double postTB, double Total){
        
        this.year = year;
        this.preTB = preTB;
        this.postTB = postTB;
        this.Total = Total;
    }// End of RetirementYears Method
    
    /**
     * This Method creates my string and it creates the formatting of said string
     * additionally this toString method is in the Retirement Class
     * when building the ArrayList and it
     * 
     *@return result
     *@Override
     */
    @Override
    public String toString(){
        
        String result = (year + "             " + preTB + "                  " + postTB + "                " + Total +  "\n");
        return result;
    }// End of toString Method

    /**
     * This method gets the location for Year from the toString method and returns
     * it to the finalString Method in Retirement class when it is called for 
     * building the ArryList
     * 
     * @return year
     */
    public double getYear() {
        return year;
    }// End of getYear Method

    /**
     * This method gets the location for preTB from the toString method and returns
     * it to the finalString Method in Retirement class when it is called for 
     * building the ArryList
     * 
     * @return preTB
     */
    public double getPreTB() {
        return preTB;
    }// End of getPreTB Method

    /**
     * This method gets the location for postTB from the toString method and returns
     * it to the finalString Method in Retirement class when it is called for 
     * building the ArryList
     * 
     * @return postTB
     */
    public double getPostTB() {
        return postTB;
    }// End of getPostTB Method

    /**
     * This method gets the location for Total from the toString method and returns
     * it to the finalString Method in Retirement class when it is called for 
     * building the ArryList
     * 
     * @return Total
     */
    public double getTotal() {
        return Total;
    }// End of getTotal Method
}// End of RetirementYears Class
