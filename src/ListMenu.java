
/*******************************************************************************
 * Copyright (c) 2022.
 * Auteur : Stephane Brisse
 * Mail   : stephanebrisse@gmail.com
 * -------------------------------------
 * Projet : Collection
 * Créer le : 16/02/2022
 * IDE : INTELLIJ
 * FileName : ListMenu.java
 * Last Modified : 17/02/2022 20:40
 *
 ******************************************************************************/



import javax.swing.*;




import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ListMenu implements ActionListener {

    public static ArrayList<Integer> tabInt;
   
    private JMenuItem marray;
    private JMenuItem mlinked;

    public ListMenu() {
    	
    }

    public JMenu ListItems() {

        JMenu mlist = new JMenu("LIST");
        mlist.add(array());
        mlist.add(linked());


        return mlist;
    }
    private JMenuItem array() {
        marray = new JMenuItem("ArrayList");
        marray.setAccelerator(KeyStroke.getKeyStroke("ctrl 1"));
        marray.addActionListener(this);
        return marray;
    }
    private JMenuItem linked() {
        mlinked = new JMenuItem("LinkedList");
        mlinked.setAccelerator(KeyStroke.getKeyStroke("ctrl 2"));
        mlinked.addActionListener(this);
        return mlinked;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Object event = e.getSource();
        if (event == marray) {
            actionarray(event);
        } else if (event == mlinked) {
            actionlinked();
        }
    }
    private void actionarray(Object e) {

        tabInt = new ArrayList<Integer>();
        tabInt.add(2);
        tabInt.add(4);
        tabInt.add(Integer.valueOf("6"));
        tabInt.add(8);
        tabInt.add(Integer.valueOf("10"));
        tabInt.add(12);
        tabInt.add(14);
        tabInt.add(16);
        MyPanel.getOutput2().append("ArrayList<Integer> tabInt = new ArrayList<Integer>();" + "\n");
        MyPanel.getOutput2().append("for (int i = 0; i < tabInt.size(); i++) {\n");
        MyPanel.getOutput2().append("    MyPanel.output.append(\"index: \" + i + \", value: \" + tabInt.get(i) + \"\\n\"); ");
        MyPanel.getOutput2().append("}" + "\n");
        for (int i = 0; i < tabInt.size(); i++) {
            MyPanel.output.append("index: " + i + ", value: " + tabInt.get(i) + "\n");
        }
        CustomDialog mywindow12 = new CustomDialog(MyFrame.getFrame(), "ARRAY LIST", false);
        mywindow12.setVisible(true);

    }
    private void actionlinked() {

    }
}