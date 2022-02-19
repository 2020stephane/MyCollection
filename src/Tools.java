/*******************************************************************************
 * Copyright (c) 2022.
 * Auteur : Stephane Brisse
 * Mail   : stephanebrisse@gmail.com
 * -------------------------------------
 * Projet : Collection
 * Créer le : 16/02/2022
 * IDE : INTELLIJ
 * FileName : Tools.java
 * Last Modified : 18/02/2022 08:23
 *
 ******************************************************************************/

import javax.swing.*;

/**
 * Some usefull methode.
 */
public class Tools {

    public Tools() { }

    /**
     *
     * @param path the complete path for the image of the icon.
     * @return a pointer on the icon.
     */
    public static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = MainClass.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }
}
