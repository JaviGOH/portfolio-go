package com.javigoh.calculator.view;

import javax.swing.*;

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
    private JButton CE;

    public CalculatorView() {
        setTitle("Calculadora GO");
        //setContentPane(panelBotones);
        setContentPane(rootPanel);

        //panelBotones.setLayout(new GridLayout(7, 6));

        setSize(500,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

    }

    public JButton getNumber7() {
        return Number7;
    }

    public JButton getNumber8() {
        return Number8;
    }

    public JButton getNumber9() {
        return Number9;
    }

    public JButton getNumber1() {
        return Number1;
    }

    public JButton getNumber0() {
        return Number0;
    }

    public JButton getNumber2() {
        return Number2;
    }

    public JButton getNumber3() {
        return Number3;
    }

    public JButton getDivisionOperation() {
        return DivisionOperation;
    }

    public JButton getSubtractOperation() {
        return SubtractOperation;
    }

    public JButton getNumber4() {
        return Number4;
    }

    public JButton getMultiplicationOperation() {
        return MultiplicationOperation;
    }

    public JButton getNumber6() {
        return Number6;
    }

    public JButton getNumber5() {
        return Number5;
    }

    public JButton getPoint() {
        return Point;
    }

    public JButton getAdditionOperation() {
        return AdditionOperation;
    }

    public JButton getResult() {
        return Result;
    }

    public JButton getCE() {
        return CE;
    }


    //Este metodo mira el contenido de la pantalla de nuestra calculadora
    public String getPantalla() {
        return Pantalla.getText();
    }

    //Este metodo recibe un texto y lo coloca en la pantalla
    public void setPantalla(String text) {
        Pantalla.setText(text);
    }

    //Method to clean the calculator
    public void clearPantalla() {
        Pantalla.setText("");
    }
}

