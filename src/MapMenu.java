
/**
 * Copyright (c) 2022.
 * Auteur : Stephane Brisse
 * Mail   : stephanebrisse@gmail.com
 * -------------------------------------
 * Projet : Collection
 * Créer le : 16/02/2022
 * IDE : INTELLIJ
 * FileName : MapMenu.java
 * Last Modified : 16/02/2022 16:26
 *
 **/

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class MapMenu implements ActionListener {

    private JMenuItem mexo1;
    private String newLine = "\n";

    public MapMenu() { }

    public JMenu MapItems() {

        JMenu mMap = new JMenu("Map");
        mMap.add(exo1());
        return mMap;
    }
    private JMenuItem exo1() {
        mexo1 = new JMenuItem("Exo1");
        mexo1.setAccelerator(KeyStroke.getKeyStroke("ctrl 1"));
        mexo1.addActionListener(this);
        return mexo1;
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        Object event = e.getSource();
        if (event == mexo1) {
            actionexo1(event);
        }
    }
    private void actionexo1(Object e) {

        HashMap<String,String> glossaire = new HashMap<>();

        glossaire.put("sous classe", "Classe heritant d'une autre classe");
        glossaire.put("methode", "une fonction destinatrice d'un message");
        glossaire.put("classe derivee", "Classe heritant d'une autre classe");
        glossaire.put("polymorphisme", "un comportement differnet pour un meme message");
        glossaire.put("collection", "instance d'une classe gerant un ensemble d'elements");
        glossaire.put("instance", "objet cree a partir d'une classe");
        glossaire.put("valeur", "test");
        for (String i : glossaire.keySet()) {
            MyPanel.output.append("key: " + i + ", value: " + glossaire.get(i) + newLine);
        }
        MyPanel.output.append("get methode = " + glossaire.get("methode")+ newLine);
        MyPanel.output.append("taille avant = " + glossaire.size() + newLine );
        MyPanel.output.append("remove methode = " + glossaire.remove("valeur")+ newLine);
        MyPanel.output.append("taille apres = " + glossaire.size() + newLine);

        for (Map.Entry<String, String> entry : glossaire.entrySet())
        {
            MyPanel.output.append("key = " + entry.getKey() + "valeur = " + entry.getValue()+ newLine);
        }
        for (String i : glossaire.keySet()) {
            MyPanel.output.append("key: " + i + newLine);
        }
        for (String i : glossaire.values()) {
            MyPanel.output.append("value: " + i + newLine);
        }
    }
}