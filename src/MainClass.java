
public class MainClass {
	
	private static void createAndShowGUI() {
		
        new MyFrame();
    }

    public static void main(String[] args) {
    	//new MyFrame();
        javax.swing.SwingUtilities.invokeLater(MainClass::createAndShowGUI);
    	//MainClass.createAndShowGUI();
    }

}
