import java.util.ArrayList;//Used to create the ArrayList retirementYearsArray


/**
 *This Class contains two methods and it is where the calculations are performed
 * for the project. It accepts the parameters from the GUI from respectful fields 
 * and they are passed to the finalString method where they are loaded into the 
 * Array List. This class also creates said ArrayList called retirementYearsArray
 * 
 * @author AlejandroFigueroa
 */
public class Retirment
{
    
   ArrayList<RetirementYears> retirementYearsArray;
    /**
     *This Method is where the to string from RetirementYears is loaded into the array list 
     * to create its size and length using a for loop.
     *
     *
     * @return 
     * @Override toString
    */
   @Override
    public String toString()
    {
	String result = "";
        for (int j = 0; j < retirementYearsArray.size(); j++)
	if (retirementYearsArray.get(j) != null)
        {
            result += retirementYearsArray.get(j).toString() + "\n";
	}
	result += "\n";
    return result;
    }//end of toString Method
    
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
    public void finalString(int Age, int retAge,double preTB, double postTB, double preTC, double postTC, double ROR, double ITR, double capG)
    {
        double Gain = 0;
        double tax = 0;
        double oneYear = 12;
        double prevPostTB = postTB;
        double total = preTB + postTB;
        
        preTC = (oneYear * preTC);
        postTC = (oneYear * postTC);
        ROR = (1 + ROR);
        Age = (Age -1);
        
        retirementYearsArray = new ArrayList<RetirementYears>();
        retirementYearsArray.add(new RetirementYears(Age, preTB, postTB, total));
        for (int i = 1; i < (retAge - Age); i++) //change back from ret - age if errors
        {
          preTB = retirementYearsArray.get(i-1).getPreTB() * (ROR) + preTC;
          postTB = retirementYearsArray.get(i-1).getPostTB() * (ROR);
          Gain = postTB - prevPostTB;
          tax = Gain * capG;
          postTB = postTB - tax + postTC;

          

          if(i == (retAge - 1))//switch back from ret age to end age
          {
            preTB = preTB - preTB * ITR;
          }
          total = preTB + postTB;
          preTB = (long)Math.floor(preTB + 0.5d);
          postTB = (long)Math.floor(postTB + 0.5d);
          total = (long)Math.floor(total + 0.5d);
          int year = (int)i+Age;//Switch back from
          prevPostTB = postTB;
          
          retirementYearsArray.add(new RetirementYears(year, preTB, postTB, total));
        }//end of for loop
    }//end of finalString Method.  
}//end of Retirement Class.
