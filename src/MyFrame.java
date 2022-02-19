/*******************************************************************************
 * Copyright (c) 2022.

 * Auteur : Stephane Brisse
 * Mail   : stephanebrisse@gmail.com
 * -------------------------------------
 * Projet : Collection
 * Créer le : 16/02/2022
 * IDE : INTELLIJ
 * FileName : MyFrame.java
 * Last Modified : 18/02/2022 08:17
 *
 ******************************************************************************/

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private static JFrame myframe;

    /**
     * The main window.
     */
    public MyFrame() {

        myframe = this;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon logo = Tools.createImageIcon("/images/moon.png");
        assert logo != null;
        this.setIconImage(logo.getImage());
        this.setTitle("COLLECTION");
        this.setLocation(100, 50);
        this.setSize(1280, 800);
        MyPanel mypanel = new MyPanel();
        MenuBar mymenubar = new MenuBar(mypanel);
        this.setJMenuBar(mymenubar.getMenuBar());
        this.add(mypanel.getPane(), BorderLayout.CENTER);
        this.add(mypanel.getPaneText(), BorderLayout.NORTH);
        this.setVisible(true);
    }
    public static JFrame getFrame() {
        return myframe;
    }

}