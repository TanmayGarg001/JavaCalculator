/*
*Made by - Tanmay Garg.
Date - 21/12/2020.
A Java calculator using Swing UI

Tested on :-
INTELLIJ IDEA

* */

import javax.swing.*;

public class JavaCalculator {

    private double temporary1 = 0.0d;
    private double temporary2 = 0.0d;
    private char mathOperator;


    private JPanel JavaCalculator;
    private JTextField textDisplay;
    private JButton btnEquals;
    private JButton btnMultiply;
    private JButton btnTwo;
    private JButton btnThree;
    private JButton btnFive;
    private JButton btnEight;
    private JButton btnPoint;
    private JButton btnPlus;
    private JButton btnSix;
    private JButton btnNine;
    private JButton btnClear;
    private JButton btnMinus;
    private JButton btnDivide;
    private JButton btnOne;
    private JButton btnFour;
    private JButton btnSeven;
    private JButton btnZero;
    private JButton btnMod;
    private JButton btnPower;

    public JavaCalculator() {
        btnOne.addActionListener(e -> {
            String btnOneText = textDisplay.getText() + btnOne.getText();
            textDisplay.setText(btnOneText);
        });
        btnTwo.addActionListener(e -> {
            String btnTwoText = textDisplay.getText() + btnTwo.getText();
            textDisplay.setText(btnTwoText);

        });
        btnThree.addActionListener(e -> {
            String btnThreeText = textDisplay.getText() + btnThree.getText();
            textDisplay.setText(btnThreeText);

        });
        btnFour.addActionListener(e -> {
            String btnFourText = textDisplay.getText() + btnFour.getText();
            textDisplay.setText(btnFourText);

        });
        btnFive.addActionListener(e -> {
            String btnFiveText = textDisplay.getText() + btnFive.getText();
            textDisplay.setText(btnFiveText);

        });
        btnSix.addActionListener(e -> {
            String btnSixText = textDisplay.getText() + btnSix.getText();
            textDisplay.setText(btnSixText);

        });
        btnSeven.addActionListener(e -> {
            String btnSevenText = textDisplay.getText() + btnSeven.getText();
            textDisplay.setText(btnSevenText);

        });
        btnEight.addActionListener(e -> {
            String btnEightText = textDisplay.getText() + btnEight.getText();
            textDisplay.setText(btnEightText);

        });
        btnNine.addActionListener(e -> {
            String btnNineText = textDisplay.getText() + btnNine.getText();
            textDisplay.setText(btnNineText);

        });
        btnZero.addActionListener(e -> {
            String btnZeroText = textDisplay.getText() + btnZero.getText();
            textDisplay.setText(btnZeroText);

        });
        btnPlus.addActionListener(e -> {
            String btn = btnPlus.getText();
            getOperator(btn);
        });
        btnEquals.addActionListener(e -> {

            switch (mathOperator) {
                case '+':
                    temporary2 = temporary1 + Double.parseDouble(textDisplay.getText());
                    break;
                case '-':
                    temporary2 = temporary1 - Double.parseDouble(textDisplay.getText());
                    break;
                case '/':
                    temporary2 = temporary1 / Double.parseDouble(textDisplay.getText());
                    break;
                case '*':
                    temporary2 = temporary1 * Double.parseDouble(textDisplay.getText());
                    break;
                case '%':
                    temporary2 = temporary1 % Double.parseDouble(textDisplay.getText());
                    break;
                case '^':
                    temporary2 = Math.pow(temporary1, Double.parseDouble((textDisplay.getText())));
                    break;

            }

            textDisplay.setText(Double.toString(temporary2));
            temporary1 = 0.0d;
        });
        btnClear.addActionListener(e -> {
            temporary2 = 0.0d;
            textDisplay.setText("");
        });
        btnPoint.addActionListener(e -> {
            if (textDisplay.getText().equals("")) {
                textDisplay.setText("0.");
            } else if (textDisplay.getText().contains(".")) {
                btnPoint.setEnabled(false);
            } else {
                String btnPointText = textDisplay.getText() + btnPoint.getText();
                textDisplay.setText(btnPointText);
            }
            btnPoint.setEnabled(true);
        });
        btnMinus.addActionListener(e -> {
            String btn = btnMinus.getText();
            getOperator(btn);
        });
        btnDivide.addActionListener(e -> {
            String btn = btnDivide.getText();
            getOperator(btn);
        });
        btnMultiply.addActionListener(e -> {
            String btn = btnMultiply.getText();
            getOperator(btn);
        });
        btnMod.addActionListener(e -> {
            String btn = btnMod.getText();
            getOperator(btn);
        });

        btnPower.addActionListener(e -> {
            String btn = btnPower.getText();
            getOperator(btn);
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("JavaCalculator");
        frame.setContentPane(new JavaCalculator().JavaCalculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public void getOperator(String btn) {
        mathOperator = btn.charAt(0);
        temporary1 = temporary1 + Double.parseDouble(textDisplay.getText());
        textDisplay.setText("");
    }

}
