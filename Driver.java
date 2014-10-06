/**
 * This Class has only one method and its purpose is to start the program and 
 * launch the GUI.
 * 
 * @version 5.0
 * @author AlejandroFigueroa
 * @author I worked on this project with Alexis, Collen, Derek, Jess, Mike, Morgan, Liam
 */
public class Driver {

    /**
     * This Method creates and Instance of the View Class and runs the program
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        View v = new View();// Creates an Insatnce of the View and calls it "v"
        v.setVisible(true);
    }// end of main method
}// end of Driver class
