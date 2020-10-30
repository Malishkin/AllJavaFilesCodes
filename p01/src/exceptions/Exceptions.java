package exceptions;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class Exceptions {
    public static void main(String[] args) {
//        String in_1 = JOptionPane.showInputDialog(null,"Введите положительное число 1 ");
//        String in_2 = JOptionPane.showInputDialog(null,"Введите положительное число 2 ");
//        try {
//            int a = Integer.parseInt(in_1);
//            int b = Integer.parseInt(in_2);
//            if (a<=0 || b<=0) throw new NegativeException();
//            JOptionPane.showMessageDialog(null,"Сумма чисел "+(a+b));
//        }catch (NumberFormatException e) {
//            JOptionPane.showMessageDialog(null, "Некорректные данные ");
//            System.out.println(e);
//        }
//        catch (NegativeException e) {
//            JOptionPane.showMessageDialog(null, "Вы ввели отрицательное число");
//            System.out.println(e);
//        }
//
//        finally {
//            System.out.println("Программа завершена!");
//        }
//        try {
//            int[]array = {1,2,3,4,5};
//            System.out.println(array[6]);
//
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("Номера с таким индексом не существует!");
//        }
//        finally {
//            System.out.println("Завершение программы");
//        }
        String num = JOptionPane.showInputDialog(null, "Введите число  ");
        try {
            if (num == "") throw new NullException();
            int x = Integer.parseInt(num);

            JOptionPane.showMessageDialog(null, "Спасибо");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Некорректный ввод");
            System.out.println(e);
        }
        finally {
            System.out.println("Всё!");
//        String loo = JOptionPane.showInputDialog(null,"Введите логин:");
//        UserEx userEx = new UserEx();
//        try {
//            userEx.setLogin(loo);
//            System.out.println(userEx.getLogin());
//        } catch (UsersException e) {
//            if (e.getCode()==UsersException.SHORT_LOGIN){
//              JOptionPane.showMessageDialog(null,"Логин слишком короткий");
//            }
//            else if (e.getCode()==UsersException.LONG_LOGIN){
//                JOptionPane.showMessageDialog(null,"Логин слишком длинный");
//
//            }
//        }


        }
    }
}

