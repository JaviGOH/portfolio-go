package com.javigoh.calculator.controller;

import com.javigoh.calculator.model.CalculatorModel;
import com.javigoh.calculator.view.CalculatorView;

import javax.swing.*;
import java.awt.event.ActionListener;

public class CalculatorController {

    private double primerNumero;
    private String operacion;

    private CalculatorView view;
    private CalculatorModel model;

    public CalculatorController(CalculatorView view) {
        this.view = view;
        this.model = model;

        //Este metodo sirve para inicializar los listener que contiene dentro
        initListeners();
    }

    //Aqui todos los listener dentro
    private void initListeners() {

        ActionListener listener = e -> {

            String command = e.getActionCommand();

            switch (command) {

                default:
                    view.setPantalla(view.getPantalla() + command);
                    break;

                case "CE":
                    view.clearPantalla();
                    break;
            }
        };

        //Identificación de cada boton
        view.getNumber7().setActionCommand("7");
        view.getNumber8().setActionCommand("8");
        view.getNumber9().setActionCommand("9");
        view.getNumber4().setActionCommand("4");
        view.getNumber5().setActionCommand("5");
        view.getNumber6().setActionCommand("6");
        view.getNumber1().setActionCommand("1");
        view.getNumber2().setActionCommand("2");
        view.getNumber3().setActionCommand("3");
        view.getNumber0().setActionCommand("0");

        view.getPoint().setActionCommand(".");
        view.getAdditionOperation().setActionCommand("+");
        view.getSubtractOperation().setActionCommand("-");
        view.getMultiplicationOperation().setActionCommand("*");
        view.getDivisionOperation().setActionCommand("/");
        view.getResult().setActionCommand("=");

        view.getCE().setActionCommand("CE");

        //Indicamos que codigo debe ejecutarse cuando se pulse un boton
        view.getNumber7().addActionListener(listener);
        view.getNumber8().addActionListener(listener);
        view.getNumber9().addActionListener(listener);
        view.getNumber4().addActionListener(listener);
        view.getNumber5().addActionListener(listener);
        view.getNumber6().addActionListener(listener);
        view.getNumber1().addActionListener(listener);
        view.getNumber2().addActionListener(listener);
        view.getNumber3().addActionListener(listener);
        view.getNumber0().addActionListener(listener);

        view.getPoint().addActionListener(listener);
        view.getAdditionOperation().addActionListener(listener);
        view.getSubtractOperation().addActionListener(listener);
        view.getMultiplicationOperation().addActionListener(listener);
        view.getDivisionOperation().addActionListener(listener);
        view.getResult().addActionListener(listener);

        view.getCE().addActionListener(listener);
    }

    public void guardarPrimerNumeroYOperacion(String operacion) {
        primerNumero = Double.parseDouble(view.getPantalla());
        this.operacion = operacion;
        view.clearPantalla();
    }

    public void ejecutarOperacion () {

    }

    public void limpiarCalculadora() {
        view.clearPantalla();
    }
}

