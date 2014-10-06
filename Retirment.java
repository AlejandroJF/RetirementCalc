import java.util.ArrayList;// Used to create the ArrayList retirementYearsArray
import java.lang.Math;// Used in finalString to format paramters before paaing them into the ArrayList

/**
 *This Class contains two methods and it is where the calculations are performed
 * for the project. It accepts the parameters from the GUI from respectful fields 
 * and they are passed to the finalString method where they are loaded into the 
 * Array List. This class also creates said ArrayList called retirementYearsArray
 * 
 * @author AlejandroFigueroa
 */
public class Retirment {
    
   ArrayList<RetirementYears> retirementYearsArray;// Created a Arraylist of Retirement Years
   
    /**
     *This Method is where the to string from RetirementYears is loaded into the array list 
     * to create its size and length using a for loop.
     *
     *
     * @return 
     * @Override toString
    */
   @Override
    public String toString(){
        
	String result = "";
        for (int j = 0; j < retirementYearsArray.size(); j++){
            if (retirementYearsArray.get(j) != null){
                result += retirementYearsArray.get(j).toString() + "\n";
            }// End of the if Statment.
        }// End of for Loop
        result += "\n";
        return result;
    }// End of toString Method
    
    /**
     * This Method takes in all of my parameters and does the calculations for the program to work
     * And it loads the Array list called "retirementYearsArray" in a for loop while doing the calculations
     * on each iteration of the loop. All parameters except Age and retAge are passed in as doubles and then
     * formated into longs to eliminate trailing decimals, this is done right before the parameter is passed into
     * the array list to maximize on the accuracy of the calculation.
     *
     * @param Age
     * @param retAge
     * @param preTB
     * @param postTB
     * @param preTC
     * @param postTC
     * @param ROR
     * @param ITR
     * @param capG
     */
    public void finalString(int Age, int retAge,double preTB, double postTB, double preTC, double postTC, double ROR, double ITR, double capG){
        
        double Gain = 0;// Used to figure out the difference between prevPosTB and postTB 
        double tax = 0; //Used to calculate the taxed amount for Gain
        double oneYear = 12;// Creates a year in months
        double prevPostTB = postTB; // is the first year for prevPostTB
        double total = preTB + postTB;// is the total
        
        preTC = (oneYear * preTC);// Splites decleration and assignment for future adjusting
        postTC = (oneYear * postTC);// Splites decleration and assignment for future adjusting
        ROR = (1 + ROR);// Splites decleration and assignment for future adjusting
        Age = (Age -1);// splites decleration and assignment for future adjusting
        
        // Creates a new retirementYearsArray before begining the loop This is done
        // when user re clicks the submit button to avoid errors.
        retirementYearsArray = new ArrayList<RetirementYears>();
        retirementYearsArray.add(new RetirementYears(Age, preTB, postTB, total));
        
        // This is the Main body loop creates and modifies the values that will be 
        // Displayed to the user, it runs until the retirmet year is calulated.
        for (int i = 1; i < (retAge - Age); i++){
            preTB = retirementYearsArray.get(i-1).getPreTB() * (ROR) + preTC;
            postTB = retirementYearsArray.get(i-1).getPostTB() * (ROR);
            Gain = postTB - prevPostTB;
            tax = Gain * capG;
            postTB = postTB - tax + postTC;
            
            // Loop is executed on the last year, it changes the last preTB
            // by calulating the IncomeTax Rate
            if(i == (retAge - 1)){
                preTB = preTB - preTB * ITR;
            }// End of if statment
            
            total = preTB + postTB;// Ads total through every iteration of the loop
            preTB = (long)Math.floor(preTB + 0.5d);// Formats to avoid long trailing deicimal
            postTB = (long)Math.floor(postTB + 0.5d);// Formats to avoid long trailing deicimal
            total = (long)Math.floor(total + 0.5d);// Formats to avoid long trailing deicimal
            int year = (int)i+Age;// Casts year into a int for formatting and visual purposes
            prevPostTB = postTB;// Re-sets the prevPostTB for recalulation above in the loop
          
        retirementYearsArray.add(new RetirementYears(year, preTB, postTB, total));
        }// End of for loop
    }// End of finalString Method.  
}// End of Retirement Class.
