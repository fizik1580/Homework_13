import java.util.Scanner;

public class Str_comparsion {

    public static void main(String args[]){

                // Program info

        System.out.println("Необходимо провести сравнение длинны двух строк, которые были введены с клавиатуры и записаны в соответствующие переменные. Вывести на экран строку с наибольшей длинной.");

                // Var

        String first_in_str, second_in_str;

                // Data processing

        Scanner scan = new Scanner(System.in);

        System.out.print("Введите первую сроку: ");
        first_in_str = scan.nextLine();
        System.out.print("Введите вторую сроку: ");
        second_in_str = scan.nextLine();

        if (first_in_str.length() > second_in_str.length()){

            System.out.println("Первая строка длиннее, и вот она: " + first_in_str);

        }

        else if (first_in_str.length() < second_in_str.length()){

            System.out.println("Вторая строка длиннее, и вот она: " + second_in_str);

        }

        else {

            System.out.println("Строки одинаковой длины.");

        }
    }
}
