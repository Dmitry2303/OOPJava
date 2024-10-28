import java.util.Scanner;

public class Balance {
    // Переменные для хранения веса на левой и правой чашах
    private int leftWeight;
    private int rightWeight;

    // Конструктор, инициализирующий веса на обеих чашах
    public Balance() {
        this.leftWeight = 0;
        this.rightWeight = 0;
    }

    // Метод для добавления веса на левую чашу
    public void addLeft(int weight) {
        if (weight > 0) {
            leftWeight += weight; // Увеличиваем вес на левой чаше
        } else {
            System.out.println("Ошибка: вес должен быть положительным.");
        }
    }

    // Метод для добавления веса на правую чашу
    public void addRight(int weight) {
        if (weight > 0) {
            rightWeight += weight; // Увеличиваем вес на правой чаше
        } else {
            System.out.println("Ошибка: вес должен быть положительным.");
        }
    }

    // Метод для определения положения чаш и вывода результата
    public String result() {
        if (leftWeight == rightWeight) {
            return "="; // Весы в равновесии
        } else if (leftWeight > rightWeight) {
            return "L"; // Лвая чаша перевесила
        } else {
            return "R"; // Правая чаша перевесила
        }
    }

    public static void main(String[] args) {
        // Пример использования класса Balance
        Balance balance = new Balance();

        Scanner console = new Scanner(System.in);

        System.out.println("Введите груз слева: ");
        int left = console.nextInt();
        System.out.println("Введите груз справа: ");
        int right = console.nextInt();

        balance.addLeft(left);
        balance.addRight(right);
        if (left < right){
            System.out.println("R");
        }
        else if (left > right) {
            System.out.println("L");
        }
        else {
            System.out.println("=");
        }
    }
}
