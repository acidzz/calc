
import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scr = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String exit = "нет";
        while (!exit.equals("да")){
            System.out.println("Первый аргумент");
            int arg1 = scr.nextInt();
            System.out.println("Второй аргумент");
            int arg2 = scr.nextInt();
            System.out.println("Действие");
            char mod = (char) System.in.read();

            switch (mod){
                case '+' :
                    calculator.addition(arg1,arg2);
                    System.out.println(calculator.getResult());
                    calculator.clearResult();
                    break;
                case '-' :
                    calculator.subtraction(arg1, arg2);
                    System.out.println(calculator.getResult());
                    calculator.clearResult();
                    break;
                case '*' :
                    calculator.multiplication(arg1, arg2);
                    System.out.println(calculator.getResult());
                    calculator.clearResult();
                    break;
                case '/' :
                    calculator.devision(arg1,arg2);
                    System.out.println(calculator.getResult());
                    calculator.clearResult();
                    break;
                default:
                    System.out.println("Введён не верный модификатор!");
            }
            System.out.println("Выйти? да/нет");
            exit = scr.next();

        }

    }
}
