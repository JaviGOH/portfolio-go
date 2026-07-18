package com.javigoh.calculator.main;

import com.javigoh.calculator.controller.CalculatorController;
import com.javigoh.calculator.model.CalculatorModel;
import com.javigoh.calculator.view.CalculatorView;

public class Main {

    public static void main(String[] args) {

        CalculatorView view = new CalculatorView();
        CalculatorModel model = new CalculatorModel();
        CalculatorController controller = new CalculatorController(view,model);

        view.setVisible(true);
    }
}
