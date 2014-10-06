import java.io.Serializable;// Used to Serialzie Objects below
import org.jfree.data.xy.XYSeries;// Used to create graph below
import org.jfree.data.xy.XYSeriesCollection;// used to create graph

/**
 * This Class is designed specifically for creating Objects to be saved
 * all Objects are saved and used in the View Class.
 * 
 * @author AlejandroFigueroa
 */
public class Save implements Serializable{
    
    /**
     * This Object is used for the Serialization of the Age 
     * variable taken from the users input.
     * 
     */
    public double AgeSaved;

    /**
     * This Object is used for the Serialization of the retAge 
     * aka Retirement Age
     * variable taken from the users input.
     * 
     */
    public double retAgeSaved;

    /**
     * This Object is used for the Serialization of the preTB
     * aka Pre Tax Balance
     * variable taken from the users input.
     * 
     */
    public double preTBSaved;

    /**
     * This Object is used for the Serialization of the postTB 
     * aka Post Tax Balance
     * variable taken from the users input.
     * 
     */
    public double postTBSaved;

    /**
     * This Object is used for the Serialization of the preTC 
     * aka Pre Tax Contribution
     * variable taken from the users input.
     *
     */
    public double preTCSaved;

    /**
     * This Object is used for the Serialization of the postTC 
     * aka Post Tax Contribution
     * variable taken from the users input.
     * 
     */
    public double postTCSaved;

    /**
     * This Object is used for the Serialization of the ROR 
     * aka Rate of Return
     * variable taken from the users input.
     * 
     */
    public double RORSaved;

    /**
     * This Object is used for the Serialization of the ITR 
     * aka Income Tax Rate
     * variable taken from the users input.
     * 
     */
    public double ITRSaved;

    /**
     * This Object is used for the Serialization of the capG 
     * aka Capital Gains Tax
     * variable taken from the users input.
     * 
     */
    public double capGSaved;
     
    /**
     * This Class is used to create the graph of the calculated values
     * it creates three objects, YEAR, POST, PRE. and it adds them to a Series
     * 
     * @param YEAR
     * @param POST
     * @param PRE
     * @return graphInfo
     */
    public XYSeriesCollection createObject(XYSeries YEAR, XYSeries POST,XYSeries PRE){
          XYSeriesCollection graphInfo = new XYSeriesCollection();
          
          graphInfo.addSeries(YEAR);
          graphInfo.addSeries(POST);
          graphInfo.addSeries(PRE);
          
          return graphInfo;
    }// End of XYSeriesCollection
}// End of Save

    
  
