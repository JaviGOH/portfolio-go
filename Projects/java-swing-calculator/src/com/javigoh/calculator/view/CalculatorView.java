package com.javigoh.calculator.view;

import javax.swing.*;
import java.awt.GridLayout;

public class CalculatorView extends JFrame {

    private JPanel rootPanel;

    private JTextField Pantalla;
    private JButton Number7;
    private JButton Number5;
    private JButton Number6;
    private JButton MultiplicationOperation;
    private JButton Number4;
    private JButton Number1;
    private JButton Number8;
    private JButton Number2;
    private JButton Number3;
    private JButton Number9;
    private JButton DivisionOperation;
    private JButton SubtractOperation;
    private JButton Number0;
    private JButton Point;
    private JButton AdditionOperation;
    private JButton Result;
    private JPanel panelPantalla;
    private JPanel panelBotones;

    public CalculatorView() {
        setTitle("Calculadora GO");
        //setContentPane(panelBotones);
        setContentPane(rootPanel);

        //panelBotones.setLayout(new GridLayout(7, 6));

        setSize(500,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

    }
}

