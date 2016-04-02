package controller;

import view.MainView;

import javax.swing.*;

/**
 * Created by Peonsson on 2016-03-30.
 */
public class TestApp {

    public static void main(String[] args) {
        //System.out.println("Hello World!");

        JFrame frame = new JFrame("Super Drawings");
        frame.setContentPane(new MainView().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
