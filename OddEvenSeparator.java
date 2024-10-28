import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OddEvenSeparator {
    private List<Integer> evenNumbers;
    private List<Integer> oddNumbers;

    public OddEvenSeparator() {
        evenNumbers = new ArrayList<>();
        oddNumbers = new ArrayList<>();
    }

    public void addNumber(int number) {
        if (number % 2 == 0) {
            evenNumbers.add(number);
        } else {
            oddNumbers.add(number);
        }
    }

    public void even() {
        System.out.println("Чётные числа: " + evenNumbers);
    }

    public void odd() {
        System.out.println("Нечётные числа: " + oddNumbers);
    }

    public static void main(String[] args) {
        OddEvenSeparator separator = new OddEvenSeparator();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите число (введите 000 для выхода): ");
            String input = scanner.nextLine();

            // Проверяем, введено ли 000
            if (input.equals("000")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);
                separator.addNumber(number);
            } catch (NumberFormatException e) {
                System.out.println("Пожалуйста, введите корректное число.");
            }
        }

        separator.even(); // Вывод чётных чисел
        separator.odd();  // Вывод нечётных чисел

        scanner.close();
    }
}