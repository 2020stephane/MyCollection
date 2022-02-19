
/**
 * Copyright (c) 2022.
 * Auteur : Stephane Brisse
 * Mail   : stephanebrisse@gmail.com
 * -------------------------------------
 * Projet : Collection
 * Créer le : 16/02/2022
 * IDE : INTELLIJ
 * FileName : MenuBar.java
 * Last Modified : 16/02/2022 16:11
 *
 **/



import javax.swing.*;

public class MenuBar {

    private final JMenuBar mBar;

    public MenuBar(JPanel mypanel) {

        mBar = new JMenuBar();
        SetMenu mSet = new SetMenu();
        ListMenu mList = new ListMenu();
        MapMenu mMap = new MapMenu();
        HelpMenu mHelp = new HelpMenu();

        mBar.add(mSet.SetItems());
        mBar.add(mList.ListItems());
        mBar.add(mMap.MapItems());
        mBar.add(mHelp.helpItems());
        }
    public JMenuBar getMenuBar() {

        return mBar;
    }
}