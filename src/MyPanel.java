/*******************************************************************************
 * Copyright (c) 2022.
 * Auteur : Stephane Brisse
 * Mail   : stephanebrisse@gmail.com
 * -------------------------------------
 * Projet : Collection
 * Créer le : 16/02/2022
 * IDE : INTELLIJ
 * FileName : MyPanel.java
 * Last Modified : 18/02/2022 08:17
 *
 ******************************************************************************/

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	public static JTextArea output;
    public static JTextArea output2;
    private static JScrollPane scrollPane;
    private static JScrollPane scrollPane2;
    private static JPanel myPanel;
    private static JPanel myPanelText;
    
    public JPanel getPane() { return myPanel;}
    public Container getPaneText() { return myPanelText;}
    public static JTextArea getOutput() { return output; }
    public static JTextArea getOutput2() { return output2; }

    public MyPanel() {
        ImageIcon logo = Tools.createImageIcon("/images/BackGround2.jpg");
        JLabel myLabel = new JLabel(logo,JLabel.CENTER);
        myPanel = new JPanel(new BorderLayout());
        myPanelText = new JPanel(new BorderLayout());
        output = new JTextArea(15, 50);
        output.setEditable(false);
        output2 = new JTextArea(15, 50);
        output2.setEditable(false);
        scrollPane = new JScrollPane(output);
        scrollPane2 = new JScrollPane(output2);
        myPanelText.add(scrollPane, BorderLayout.WEST);
        myPanelText.add(scrollPane2, BorderLayout.EAST);
        myPanel.add(myLabel,BorderLayout.CENTER);
        myPanelText.setVisible(true);
        myPanel.setVisible(true);
    }
   
}
