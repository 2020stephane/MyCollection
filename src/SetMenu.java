
/**
 * Copyright (c) 2022.
 * Auteur : Stephane Brisse
 * Mail   : stephanebrisse@gmail.com
 * -------------------------------------
 * Projet : Collection
 * Créer le : 16/02/2022
 * IDE : INTELLIJ
 * FileName : SetMenu.java
 * Last Modified : 16/02/2022 17:51
 *
 **/





import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;

public class SetMenu implements ActionListener {

    private JMenuItem mexo1;
    private JMenuItem mexo2;


    public SetMenu() {

    }

    public JMenu SetItems() {
        JMenu mset = new JMenu("Set");
        mset.add(exo1());
        mset.add(exo2());
        return mset;
    }
    private JMenuItem exo1() {
        mexo1 = new JMenuItem("Exo1");
        mexo1.setAccelerator(KeyStroke.getKeyStroke("ctrl 1"));
        mexo1.addActionListener(this);
        return mexo1;
    }
    private JMenuItem exo2() {
        mexo2 = new JMenuItem("Exo2");
        mexo2.setAccelerator(KeyStroke.getKeyStroke("ctrl 2"));
        mexo2.addActionListener(this);
        return mexo2;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Object event = e.getSource();
        if (event == mexo1) {
            actionexo1(event);
        } else if (event == mexo2) {
            actionexo2();
        }
    }
    private void actionexo1(Object event) {

        JMenuItem source = (JMenuItem)  event;
        String s = "Action event detected." + "    Event source: " + source.getText();
        MyPanel.output.append(s );
        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");

    }
    private void actionexo2() {

    }
}