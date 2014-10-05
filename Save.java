
import java.io.Serializable;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author AlejandroFigueroa
 */
public class Save implements Serializable
{
    /**
     *
     */
    public double AgeSaved;

    /**
     *
     */
    public double retAgeSaved;

    /**
     *
     */
    public double preTBSaved;

    /**
     *
     */
    public double postTBSaved;

    /**
     *
     */
    public double preTCSaved;

    /**
     *
     */
    public double postTCSaved;

    /**
     *
     */
    public double RORSaved;

    /**
     *
     */
    public double ITRSaved;

    /**
     *
     */
    public double capGSaved;
     
    /**
     *
     * @param YEAR
     * @param POST
     * @param PRE
     * @return
     */
    public XYSeriesCollection createObject(XYSeries YEAR, XYSeries POST,XYSeries PRE)
     {
          XYSeriesCollection graphInfo = new XYSeriesCollection();
          
          graphInfo.addSeries(YEAR);
          graphInfo.addSeries(POST);
          graphInfo.addSeries(PRE);
          
          return graphInfo;
     }
}
 
   /* public Save (int Age, int retAge,double preTB, double postTB, double preTC, double postTC, double ROR, double ITR, double capG)      
    {
        this.Age=Age;
        this.retAge = retAge;
        this.preTB = preTB;
        this.postTB = postTB;
        this.preTC = preTC;
        this.postTC = postTC;
        this.ROR = ROR;
        this.ITR = ITR;
        this.capG = capG;
    }*/
    
  
