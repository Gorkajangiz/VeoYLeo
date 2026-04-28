package main;

import javax.swing.*;

public class main {
    public static void main(String[] args) {
        FVeoYLeo fVeoYLeo = new FVeoYLeo();
        fVeoYLeo.setVisible(true);
        try {
            UIManager.setLookAndFeel(
                    UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        fVeoYLeo.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }
}
