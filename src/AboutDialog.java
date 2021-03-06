
/**
 * Copyright (c) 2022.
 * Auteur : Stephane Brisse
 * Mail   : stephanebrisse@gmail.com
 * -------------------------------------
 * Projet : Collection
 * Cr?er le : 16/02/2022
 * IDE : INTELLIJ
 * FileName : AboutDialog.java
 * Last Modified : 16/02/2022 16:35
 *
 **/



import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class AboutDialog extends JDialog {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AboutDialog(String titre) {
        super((Frame) null,titre,true);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setBounds(getWidth()/2,
                getHeight()/2,350,200);
        ImageIcon logo = new ImageIcon(Objects.requireNonNull
                (getClass().getResource("/images/moon.png")));
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JButton btnok = new JButton("OK");
        JLabel lbllogo = new JLabel(logo);

        JLabel lbl1 = new JLabel();
        JLabel lbl2 = new JLabel();
        JLabel lbl3 = new JLabel();
        JLabel lbl4 = new JLabel();
        panel1.setBorder(BorderFactory.createEmptyBorder());
        GridLayout gridLayout = new GridLayout();
        gridLayout.setRows(5);
        gridLayout.setColumns(1);
        gridLayout.setVgap(5);
        panel1.setLayout(gridLayout);
        lbl1.setText("COLLECTION - V1.0");
        panel1.add(lbl1);
        lbl2.setText("Powered in java");
        panel1.add(lbl2);
        lbl3.setText("Auteur : Stephane Brisse");
        panel1.add(lbl3);
        lbl4.setText("Mail   : stephanebrisse@gmail.com");
        panel1.add(lbl4);

        lbllogo.setBounds(0,150,50,50);
        panel2.add(lbllogo);
        panel3.add(btnok);
        this.add(panel1,BorderLayout.CENTER);
        this.add(panel2,BorderLayout.WEST);
        this.add(panel3,BorderLayout.SOUTH);
        this.setVisible(true);
    }
}