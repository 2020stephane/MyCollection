
/**
 * Copyright (c) 2022.
 * Auteur : Stephane Brisse
 * Mail   : stephanebrisse@gmail.com
 * -------------------------------------
 * Projet : Collection
 * Créer le : 16/02/2022
 * IDE : INTELLIJ
 * FileName : HelpMenu.java
 * Last Modified : 16/02/2022 16:29
 *
 **/

import javax.swing.*;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelpMenu implements ActionListener {

    JMenuItem mabout;
    JMenuItem mihelp;

    public HelpMenu() {
    }

    public JMenu helpItems() {

        JMenu mHelp = new JMenu("Help");
        mHelp.add(menuhelp());
        mHelp.add(menuabout());
        return mHelp;
    }
    public JMenuItem menuabout() {

        mabout = new JMenuItem("About");
        mabout.setAccelerator(KeyStroke.getKeyStroke("ctrl A"));
        mabout.addActionListener(this);
        return mabout;
    }
    public JMenuItem menuhelp() {
        mihelp = new JMenuItem("Help");
        mihelp.setAccelerator(KeyStroke.getKeyStroke("ctrl H"));
        mihelp.addActionListener(this);
        return mihelp;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object event = e.getSource();

        if (event == mabout) {
            actionabout();
        }
    }
    public void actionabout() {

        new AboutDialog("About COLLECTION");

    }
}