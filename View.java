
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 * This is the View Class, it is where input and output data flows between the
 * user and the rest of the system, when using a MVC interface, this Class acts
 * as both the View and the Controller, additionally this class creates the GUI.
 * 
 * @author AlejandroFigueroa
 */
public class View extends javax.swing.JFrame implements Serializable {

    // Creates an Insatance of the Retirment and Save Classes for passing
    // Variables for claculations
    private final Retirment retirement = new Retirment();
    Save savedFile = new Save();
    
    // Creates Three Gobal variables for the Graph.
    XYSeries YEAR = new XYSeries("Years ");
    XYSeries POST = new XYSeries("postTax Balance ");
    XYSeries PRE = new XYSeries("preTax Balance ");
    
    /**
     * Creates new form View That calls initComponents
     * 
     */
    public View() {
        initComponents();
    }// End of View

    /**
     * This method is called from within the constructor to initialize the form.
     * 
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        popupMenu1 = new java.awt.PopupMenu();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        extraWindow = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        age = new javax.swing.JTextField();
        retirementAge = new javax.swing.JTextField();
        incomeTaxRate = new javax.swing.JTextField();
        capitalGainsTax = new javax.swing.JTextField();
        preTaxBalance = new javax.swing.JTextField();
        postTaxBalance = new javax.swing.JTextField();
        preTaxContribution = new javax.swing.JTextField();
        postTaxContribution = new javax.swing.JTextField();
        rateOfReturn = new javax.swing.JTextField();
        calculate = new javax.swing.JButton();
        try {
            save =(javax.swing.JButton)java.beans.Beans.instantiate(getClass().getClassLoader(), "View_save");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        clear = new javax.swing.JButton();
        LoadButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        Window = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        cFrame = new javax.swing.JInternalFrame();

        popupMenu1.setLabel("popupMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        extraWindow.setEditable(false);
        extraWindow.setColumns(20);
        extraWindow.setRows(5);
        extraWindow.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                extraWindowKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(extraWindow);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
        );

        jLabel4.setText("Age");

        jLabel5.setText("Retirement Age");

        jLabel6.setText("Income Tax Rate");

        jLabel7.setText("Cap Gains");

        jLabel8.setText("PreTax Bal");

        jLabel9.setText("PostTax Bal");

        jLabel10.setText("PreTax Contribution");

        jLabel11.setText("PostTax Contribution");

        jLabel12.setText("Rate of Return");

        age.setText(" ");

        calculate.setText("Calculate");
        calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateActionPerformed(evt);
            }
        });

        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        LoadButton.setText("Load");
        LoadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LoadButton)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(incomeTaxRate, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(age, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                                .addComponent(preTaxBalance, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(rateOfReturn, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(preTaxContribution, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(save))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11)
                            .addComponent(postTaxContribution, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(postTaxBalance, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                                .addComponent(capitalGainsTax, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(retirementAge, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(calculate)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(clear)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(retirementAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(capitalGainsTax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(incomeTaxRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(postTaxBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(preTaxBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(preTaxContribution, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(postTaxContribution, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(calculate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rateOfReturn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear))
                .addGap(18, 18, 18)
                .addComponent(save)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LoadButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Window.setEditable(false);
        Window.setColumns(20);
        Window.setRows(5);
        Window.setText("Hello, this is a retirement Claculator. \n\nPlease use non negative numbers\nin any and all fields.\ndo  not use any symbols, letters\nand or commas. You may use the periods\nto represent %'s.\n\nI.E. for 20% use 0.2\n\nAdditionally, Please keep tax rates within\na realistic range. the range in this calulator is\nfrom 1 - .001\nfore example:\n1 is 100% to .01 is 1%");
        Window.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                WindowKeyPressed(evt);
            }
        });
        jScrollPane3.setViewportView(Window);

        jTabbedPane1.addTab("Data", jScrollPane3);

        cFrame.setVisible(true);

        javax.swing.GroupLayout cFrameLayout = new javax.swing.GroupLayout(cFrame.getContentPane());
        cFrame.getContentPane().setLayout(cFrameLayout);
        cFrameLayout.setHorizontalGroup(
            cFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 358, Short.MAX_VALUE)
        );
        cFrameLayout.setVerticalGroup(
            cFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 308, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cFrame, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Graph", jPanel1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * This Method Saves the users data from specified fields, it saves them into 
     * objects created in the Save class and it stores the values in a file that 
     * the user creates.
     * 
     * @param fileName
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
    public void savedInput(String fileName, double Age, double  retAge, double preTB, double postTB,double preTC,double postTC,double ROR,double ITR,double capG){        
       
        try {
                            
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(fileName));
           
            savedFile.AgeSaved = Age;
            savedFile.retAgeSaved =  retAge;
            savedFile.preTBSaved = preTB;
            savedFile.postTBSaved = postTB;
            savedFile.preTCSaved = preTC;
            savedFile.postTCSaved = postTC;
            savedFile.RORSaved = ROR;
            savedFile.ITRSaved = ITR;
            savedFile.capGSaved = capG;        
            os.writeObject(savedFile);
            os.close();
        }
        catch(FileNotFoundException e){
            Window.setText(null);
            extraWindow.setText(null);
            Window.setText("Something went wrong, Please try agin\n"
                    + "Please make sure you are following the instructions");
        }// End of FileNotFoundException
        catch(IOException e){
            Window.setText(null);
            extraWindow.setText(null);
            Window.setText("Something went wrong, Please try agin\n"
                    + "Please make sure you are following the instructions");
        }// End of IOException
    }// End of savedInput
    
    /**
     * This Method is used when the user hits the Calculate button, it takes
     * in all the Variable and checks them with TryCatches
     * and sends all variables to the Retirement class for calculation
     * 
     */
    private void calculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateActionPerformed
        
        //This variable is created to limit the users contribution to a 
        //realitic amount
        double bigBaller = 100000;
        
        // This varibale is created to limit the users age to a realistc one
        double ageRange = 100;
        
        /* This try catch is created to perorm the operations and catch any and
           all exceptions that may be encountered within the program, it is the 
           main body of the loop.
        */
        try {
            // these four operations create a blank slate everytime u Calulate
            extraWindow.setText(null);
            Window.setText(null);
            POST.clear();
            PRE.clear();
            
            double doubleAge = Double.parseDouble(age.getText());
            double doubleRetAge = Double.parseDouble(retirementAge.getText());
            double preTB = Double.parseDouble(preTaxBalance.getText());
            double postTB = Double.parseDouble(postTaxBalance.getText());
            double preTC = Double.parseDouble(preTaxContribution.getText());
            double postTC = Double.parseDouble(postTaxContribution.getText());
            double ROR = Double.parseDouble(rateOfReturn.getText());
            double ITR = Double.parseDouble(incomeTaxRate.getText());
            double capG = Double.parseDouble(capitalGainsTax.getText());
            
            // Prases Age and retAge into ints, this is done to let user enter
            // any Age or retAge they want.
            int Age = (int)doubleAge;
            int retAge = (int) doubleRetAge;
            
                if ((Age <= 0) || (retAge < Age) || ((retAge-Age) > ageRange)){
                    throw new negativeYearException(" ");
                }
                if((postTC < 0) || (preTC < 0)){
                    throw new negativeMoneyException(" ");
                }
                if ((ROR > 1) || (ROR < .001)||(ITR > 1)||(ITR < .001)||(capG > 1)||(capG < .001)){
                    throw new tooMuchTaxException("");
                }
                if ((preTC > bigBaller) || (postTC > bigBaller)){
                    throw new makingTooMuchMoneyException("");
                }
                if ((preTB > bigBaller) || (postTB > bigBaller)){
                    throw new bigBallerException("");
                }
    
            // Sends all variable to final String Method in Retirement Class
            retirement.finalString(Age, retAge, preTB, postTB, preTC, postTC, ROR, ITR, capG);
            printToScreen();
            graphData(Age, retAge, preTB, postTB, preTC, postTC, ROR, ITR, capG);
            graph();
        }// End of try  
        // Multiple Exceptions built to handle any and all issues 
        catch (NumberFormatException e) {
            extraWindow.setText("All fields must be filled out and you can only\n"
                    + "use numbers and  decimals as input \"10\" or \".10\"\n"
                    + "I.E  no commas, letters or numbers");
        }// End of NumberFormatException
        catch(negativeYearException e){
            extraWindow.setText("Your Age cannot be 0 or negative \nand/or\n you cant have"
                    + " your RetirementYear be less than your Age \nand/or you are "
                    + "expecting to live too long");       
        }// End of negativeYearException
        catch(negativeMoneyException e){
            extraWindow.setText("You can't contribute negative money\n"
                    + "please adjust your Pre and/or Post Tax Contributions ");
        }// End of negativeMoneyException
        catch(tooMuchTaxException e){
            extraWindow.setText("You're paying too much, or too little money in taxes\n "
                    + "Plese adjust your \nRateOfReturn, Capital Gains, or your IncomeTax Rate\n "
                    + "I.E. from \"1\" to \".001\" " );
        }// End of tooMuchTaxException
        catch (makingTooMuchMoneyException e){
             extraWindow.setText("If you have that much money to contribute  every month, you\n"
                     + "need to retire now");
        }// End of makingTooMuchMoneyException
        catch (bigBallerException e){
            extraWindow.setText("Serioulsy, you need to just retire now... We're Done");
        }// End of bigBallerException
     // End of Calulations method
    }//GEN-LAST:event_calculateActionPerformed
    
	/**
	 * This Method Clears all fields from the users input field
	 *
	 */
	private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        
        Window.setText("Hello, this is a retirement Claculator. \n" +
                    "\n" +
                    "Please use non negative numbers\n" +
                    "in any and all fields.\n" +
                    "do  not use any symbols, letters\n" +
                    "and or commas. You may use the periods\n" +
                    "to represent %'s.\n" +
                    "\n" +
                    "I.E. for 20% use 0.2\n" +
                    "\n" +
                    "Additionally, Please keep tax rates within\n" +
                    "a realistic range. the range in this calulator is\n" +
                    "from 1 - .001\n" +
                    "fore example:\n" +
                    "1 is 100% to .01 is 1%");
        preTaxBalance.setText("");
        postTaxBalance.setText("");
        preTaxContribution.setText("");
        postTaxContribution.setText("");
        age.setText("");
        retirementAge.setText("");
        incomeTaxRate.setText("");
        capitalGainsTax.setText("");
        rateOfReturn.setText("");
        extraWindow.setText(null);
        Window.setEditable(false);
        extraWindow.setEditable(false);
        PRE.clear();
        POST.clear();
        YEAR.clear();
 
    }//GEN-LAST:event_clearActionPerformed

    /**
     * load Method is built go through the file system and get back the 
     * serialized file that the user asked to load, it takes the saved
     * Objects and saves them into new doubles and sends said variables to 
     * the loaded content method.
     *  
     * @param fileName
     * @throws ClassNotFoundException
     */
    public void load(String fileName) throws ClassNotFoundException{
        
        try{
            
            FileInputStream temp = new FileInputStream(fileName);
            ObjectInputStream is = new ObjectInputStream(temp);
            
            Save AgeSaved = (Save) is.readObject();
            double loadedAge = AgeSaved.AgeSaved;
            double loadedretAge = AgeSaved.retAgeSaved;
            double loadedpreTB = AgeSaved.preTBSaved;
            double loadedpostTB = AgeSaved.postTBSaved;
            double loadedpreTC = AgeSaved.preTCSaved;
            double loadedpostTC = AgeSaved.postTCSaved;
            double loadedROR = AgeSaved.RORSaved;
            double loadedITR = AgeSaved.ITRSaved;
            double loadedcapG = AgeSaved.capGSaved;
            
            loadedContent(loadedAge, loadedretAge, loadedpreTB, loadedpostTB, loadedpreTC, loadedpostTC, loadedROR, loadedITR, loadedcapG);
            is.close();
        }
        catch(FileNotFoundException e){
            extraWindow.setText("Cannot find file try again");
            Window.setText(null);
        }
        catch(IOException e){
            extraWindow.setText("Cannot find file\nPlease try again");
            Window.setText(null);
        }
    }// End of load Method.
    
    /**
     * This Method clears all fields and tells user where to type his next
     * input for name of file he wants to write
     * 
     * @param evt 
     */
    private void LoadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadButtonActionPerformed
       
        Window.setText("In the window Below, Please enter the file name you \n "
                + "would like to load I.E.  \"data.bin\" and press \n "
                + "the \"Enter\" Key when done");
        extraWindow.setText(null);
        preTaxBalance.setText("");
        postTaxBalance.setText("");
        preTaxContribution.setText("");
        postTaxContribution.setText("");
        age.setText("");
        retirementAge.setText("");
        incomeTaxRate.setText("");
        capitalGainsTax.setText("");
        rateOfReturn.setText("");
        extraWindow.setEditable(true); 
        PRE.clear();
        POST.clear();
        YEAR.clear();
    }//GEN-LAST:event_LoadButtonActionPerformed

    /**
     * loadedContent Method is built to  take in all variables and set them 
     * back into the designated fields in the GUI it accepts all parameters from
     * the load Method above
     * 
     * @param loadedAge
     * @param loadedretAge
     * @param loadedpreTB
     * @param loadedpostTB
     * @param loadedpreTC
     * @param loadedpostTC
     * @param loadedROR
     * @param loadedITR
     * @param loadedcapG
     */
    public void loadedContent(double loadedAge, double loadedretAge,double loadedpreTB,double loadedpostTB,double loadedpreTC,double loadedpostTC,double loadedROR,double loadedITR,double loadedcapG){
       
        age.setText(String.valueOf(loadedAge));
        retirementAge.setText(String.valueOf(loadedretAge));
        preTaxBalance.setText(String.valueOf(loadedpreTB));
        postTaxBalance.setText(String.valueOf(loadedpostTB));
        preTaxContribution.setText(String.valueOf(loadedpreTC));
        postTaxContribution.setText(String.valueOf(loadedpostTC));
        rateOfReturn.setText(String.valueOf(loadedROR));
        incomeTaxRate.setText(String.valueOf(loadedITR));
        capitalGainsTax.setText(String.valueOf(loadedcapG));
    }
    /**
     * This Method is implemented after the user clicks the load button,
     * it becomes editable and allows user to type the name of a file,
     * it becomes un-editable after he types the enter key.
     * 
     * @param evt 
     */
    private void extraWindowKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_extraWindowKeyPressed
     
        String fileName = "";
        
        try{
            
            if(evt.getKeyCode() == KeyEvent.VK_ENTER){
                
                fileName = extraWindow.getText();
                extraWindow.setEditable(false);
                extraWindow.setText(null);
                Window.setText("\n\n\nThe file you loaded was \"" + fileName + "\" press\n"
                        + "The Calculate Button to re-Preccess your saved results.");
                load(fileName);
            }// End of if loop
        }// End of try
       catch(Exception e){
           //Generic error message if something goes wrong.
           extraWindow.setText(null);
           Window.setText("Oops, Something went worng, please try again");
       }// End of catch
    }//GEN-LAST:event_extraWindowKeyPressed
    /**
     * This method prompts user to enter the same of the file to save and then 
     * enables the Window to be editable
     * 
     * @param evt 
     */
    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // Detailed Message telling 
        extraWindow.setText("In the Window above, Please enter the file\n "
                + "name you would like to Create I.E.  data.bin \n"
                + "Then push \"Enter Key\"");
        Window.setText(null);
        Window.setEditable(true);
    }//GEN-LAST:event_saveActionPerformed
    /**
     * This Method is implemented after the user hits the save button and allows
     * the user to enter the name of the file he would like to save it to
     * it gets all variables and send them all to the savedInput method for
     * calculation and saving.
     * 
     * @param evt 
     */
    private void WindowKeyPressed(java.awt.event.KeyEvent evt) {                                  
       
        String fileName = "";
       try{
            if(evt.getKeyCode() == KeyEvent.VK_ENTER){
                fileName = Window.getText();
                Window.setEditable(false);
                Window.setText(null);
                extraWindow.setText("Your file was saved as " + fileName);
            
                double Age = Double.parseDouble(age.getText());
                double retAge = Double.parseDouble(retirementAge.getText());
                double preTB = Double.parseDouble(preTaxBalance.getText());
                double postTB = Double.parseDouble(postTaxBalance.getText());
                double preTC = Double.parseDouble(preTaxContribution.getText());
                double postTC = Double.parseDouble(postTaxContribution.getText());
                double ROR = Double.parseDouble(rateOfReturn.getText());
                double ITR = Double.parseDouble(incomeTaxRate.getText());
                double capG = Double.parseDouble(capitalGainsTax.getText());
            
                savedInput(fileName, Age, retAge, preTB, postTB,preTC, postTC, ROR, ITR, capG);
            }
       }
       catch(NumberFormatException e){
           
           Window.setEditable(false);
           extraWindow.setText(null);
           Window.setText("Your file was not saved peoperly, Please make sure\n"
                   + "all fields are filled in appropriatly, I.E. \n"
                   + "Only numbers, and periodsto represent decimals for\n"
                   + "your percentages. No commas, letters\n"
                   + "or symbols other that whats allowed.\n"
                   + "please click Save buton to try again");
       }
    }// End of WindowKeyPressed                                                                       

    /**
     * This Method Calls the toString form Retirement class and formats it and  
     * the display string and prints it to the screen
     *
     */
    public void printToScreen()//(double retirmentAge)
    {
        Window.setText("\nYear"+"    " + " Pre Tax Balance" + "     " + "Post Tax Balance" + "     " + "Total" + "\n"
                + "---------------------------------------------------------------\n"
                + retirement.toString());
    }
       
    /**
     * This Method creates the JfreeChart by setting its format and values
     * 
     */
    public void graph()
    {
        XYSeriesCollection graphInfo = new XYSeriesCollection();
          
          graphInfo.addSeries(YEAR);
          graphInfo.addSeries(POST);
          graphInfo.addSeries(PRE);        
        
        JFreeChart chart = ChartFactory.createXYLineChart("Comparison", "Years", "Post-TaxBalance", graphInfo, PlotOrientation.VERTICAL, true, true, true);

        ChartPanel CP = new ChartPanel(chart);
        CP.setSize(350,200);
        ChartFrame cframe2 = new ChartFrame("Totals", chart);
     
        cFrame.add(CP);
        cFrame.setSize(350,200);
        cFrame.repaint();
        cFrame.revalidate();          
    }// End of graph method
    
    /**
     * This Method accepts the data to be graphed from the calculate button 
     * method  and it performs the same math as the finalString method from 
     * Retirement.
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
    public void graphData(int Age, int retAge,double preTB, double postTB, double preTC, double postTC, double ROR, double ITR, double capG)
    {
        preTC = 12 * preTC;
        postTC = 12 * postTC;
        int year = Age -1;
        
         PRE.add(year, preTB);
         POST.add(year, postTB);
        for (int i = 1; i < (retAge - Age); i++)
        {
          preTB = preTB * (1 + ROR) + preTC;
          postTB = postTB * (1 + ROR) + postTC;
                 
          if(i == (retAge - 1))
          {
            preTB = preTB - preTB * ITR;
          }
          preTB = (long)Math.floor(preTB + 0.5d);
          postTB = (long)Math.floor(postTB + 0.5d);
          year = (int)i+Age;//Switch back from 
          
          PRE.add(year, preTB);
          POST.add(year, postTB);          
        }
    }//End of graphData Method

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LoadButton;
    private javax.swing.JTextArea Window;
    private javax.swing.JTextField age;
    private javax.swing.JInternalFrame cFrame;
    public javax.swing.JButton calculate;
    private javax.swing.JTextField capitalGainsTax;
    private javax.swing.JButton clear;
    private javax.swing.JTextArea extraWindow;
    private javax.swing.JTextField incomeTaxRate;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private java.awt.PopupMenu popupMenu1;
    private javax.swing.JTextField postTaxBalance;
    private javax.swing.JTextField postTaxContribution;
    private javax.swing.JTextField preTaxBalance;
    private javax.swing.JTextField preTaxContribution;
    private javax.swing.JTextField rateOfReturn;
    private javax.swing.JTextField retirementAge;
    public javax.swing.JButton save;
    // End of variables declaration//GEN-END:variables
}