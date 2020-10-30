package objectmath;

import javax.swing.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class MathExersice {
    public static void main(String[] args) {
//        String r1 = JOptionPane.showInputDialog(null, "Введите радиус окружности");
//        int r = Integer.parseInt(r1);
//        double pi = Math.PI;
//        double pl = pi*Math.pow(r,2);
//        JOptionPane.showMessageDialog(null,"Площадь окружности равна " + pl);
//        System.out.println("Площадь окружности равна "+pl);
        String num1 = JOptionPane.showInputDialog(null, "Введите сумму на вашем текущем счету");
        double num = Double.parseDouble(num1);
        String perc1 = JOptionPane.showInputDialog(null, "Введите процентную ставку");
        double perc = Double.parseDouble(perc1);
        double profit = (num*perc)/100;
        BigDecimal bigDecimal = new BigDecimal(profit);
        BigDecimal fnprofit = bigDecimal.setScale(2, RoundingMode.HALF_UP);
        JOptionPane.showMessageDialog(null, "Ваша годовая прибыль составила "+fnprofit);
        System.out.println("Ваша годовая прибыль составила "+fnprofit);



    }
}
