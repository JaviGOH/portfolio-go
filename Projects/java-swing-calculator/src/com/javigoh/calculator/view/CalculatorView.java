package com.javigoh.calculator.view;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class CalculatorView extends JFrame {

    private static final Color WINDOW_BACKGROUND_COLOR = new Color(40,40,40);
    private static final Color PRIMARY_TEXT_COLOR = Color.WHITE;
    private  static final Color DISPLAY_BACKGROUND_COLOR = new Color(190,245,205);
    private static final Color DISPLAY_BORDER_COLOR  = new Color(130,130,130);
    private static final Color EQUALS_BUTTON_COLOR = new Color(46,204,113);
    private static final Color CLEAR_BUTTON_COLOR = new Color(167,255,192);
    private static final Color NUMBER_BUTTON_COLOR = new Color(96,96,96);
    private static final Color OPERATION_BUTTON_COLOR = new Color(64,64,64);

    private JTextField Pantalla;
    private JLabel muestraOperacion;

    private JButton Number7, Number8, Number9, DivisionOperation;
    private JButton Number4, Number5, Number6, MultiplicationOperation;
    private JButton Number1, Number2, Number3, SubtractOperation;
    private JButton Number0, Point, Result, AdditionOperation, CE;

    private JPanel panelPantalla;
    private JPanel panelBotones;


    public CalculatorView() {
        setTitle("Calculadora GO");

        initComponents();
        layoutComponents();
        configureWindow();

    }

    //Metodo para la configuración de la Ventana
    private void configureWindow() {
        setSize(500,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        ImageIcon iconoCalculadoraGo = new ImageIcon(getClass().getResource("/resources/icons/calculadora-sobremesa.jpg"));
        setIconImage(iconoCalculadoraGo.getImage());
    }

    //Metodo para crear cada uno de los componentes
    private void initComponents() {

        Pantalla = new JTextField();
        Pantalla.setEditable(false);
        Pantalla.setFont(new Font("Segoe UI", Font.BOLD, 32));
        Pantalla.setHorizontalAlignment(SwingConstants.RIGHT);
        Pantalla.setBackground(DISPLAY_BACKGROUND_COLOR);
        Pantalla.setBorder(BorderFactory.createLineBorder(DISPLAY_BORDER_COLOR, 5));

        muestraOperacion = new JLabel("");
        muestraOperacion.setFont(new Font("Segoe UI", Font.PLAIN,22));
        muestraOperacion.setForeground(PRIMARY_TEXT_COLOR);

        panelPantalla = new JPanel(new BorderLayout());

        panelBotones = new JPanel(new GridLayout(5, 4,10,10));

        // Buttons
        Number7 = new JButton("7");
        Number8 = new JButton("8");
        Number9 = new JButton("9");
        DivisionOperation = new JButton("/");

        Number4 = new JButton("4");
        Number5 = new JButton("5");
        Number6 = new JButton("6");
        MultiplicationOperation = new JButton("*");

        Number1 = new JButton("1");
        Number2 = new JButton("2");
        Number3 = new JButton("3");
        SubtractOperation = new JButton("-");

        CE = new JButton("C");
        Number0 = new JButton("0");
        Point = new JButton(".");
        AdditionOperation = new JButton("+");
        Result = new JButton("=");

        //Applying styles to buttons
        styleButton(Result,EQUALS_BUTTON_COLOR,Color.BLACK);
        styleButton(CE, CLEAR_BUTTON_COLOR,Color.BLACK);

        styleButton(AdditionOperation, OPERATION_BUTTON_COLOR, Color.WHITE);
        styleButton(SubtractOperation,OPERATION_BUTTON_COLOR,Color.WHITE);
        styleButton(MultiplicationOperation,OPERATION_BUTTON_COLOR,Color.WHITE);
        styleButton(DivisionOperation,OPERATION_BUTTON_COLOR,Color.WHITE);

        styleButton(Point,NUMBER_BUTTON_COLOR,Color.WHITE);
        styleButton(Number7,NUMBER_BUTTON_COLOR,Color.WHITE);
        styleButton(Number8,NUMBER_BUTTON_COLOR,Color.WHITE);
        styleButton(Number9,NUMBER_BUTTON_COLOR,Color.WHITE);
        styleButton(Number4,NUMBER_BUTTON_COLOR,Color.WHITE);
        styleButton(Number5,NUMBER_BUTTON_COLOR,Color.WHITE);
        styleButton(Number6,NUMBER_BUTTON_COLOR,Color.WHITE);
        styleButton(Number1,NUMBER_BUTTON_COLOR,Color.WHITE);
        styleButton(Number2,NUMBER_BUTTON_COLOR,Color.WHITE);
        styleButton(Number3,NUMBER_BUTTON_COLOR,Color.WHITE);
        styleButton(Number0,NUMBER_BUTTON_COLOR,Color.WHITE);

        //Apply borders
        muestraOperacion.setBorder(BorderFactory.createEmptyBorder(15,15,15,15));
        panelPantalla.setBorder(BorderFactory.createEmptyBorder(15,15,15,15));
        panelBotones.setBorder(BorderFactory.createEmptyBorder(15,15,15,15));

        //Apply Window background color
        getContentPane().setBackground(WINDOW_BACKGROUND_COLOR);
        panelPantalla.setBackground(WINDOW_BACKGROUND_COLOR);
        panelBotones.setBackground(WINDOW_BACKGROUND_COLOR);

    }

    //Method for positioning each of the components
    private void layoutComponents() {

        setLayout(new BorderLayout());

        // Pantalla
        panelPantalla.setLayout(new BorderLayout());
        panelPantalla.add(muestraOperacion, BorderLayout.NORTH);
        panelPantalla.add(Pantalla, BorderLayout.CENTER);

        // Botones en orden calculadora
        panelBotones.add(Number7);
        panelBotones.add(Number8);
        panelBotones.add(Number9);
        panelBotones.add(DivisionOperation);

        panelBotones.add(Number4);
        panelBotones.add(Number5);
        panelBotones.add(Number6);
        panelBotones.add(MultiplicationOperation);

        panelBotones.add(Number1);
        panelBotones.add(Number2);
        panelBotones.add(Number3);
        panelBotones.add(SubtractOperation);

        panelBotones.add(CE);
        panelBotones.add(Number0);
        panelBotones.add(Point);
        panelBotones.add(AdditionOperation);

        // abajo o en otra fila si amplíamos
        panelBotones.add(Result);

        add(panelPantalla, BorderLayout.NORTH);
        add(panelBotones, BorderLayout.CENTER);
    }

    //Method styles any calculator button
    private void styleButton (JButton button, Color color, Color colorTexto) {
        button.setBackground(color);
        button.setForeground(colorTexto);
        button.setFont(new Font("Segoe UI",Font.BOLD,28));
        button.setFocusPainted(false);
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));

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

    public String getOperacion() {
        return muestraOperacion.getText();
    }

    public void setOperacion(String texto) {
        muestraOperacion.setText(texto);
    }

    public void clearOperacion() {
        muestraOperacion.setText("");
    }

}

