public class Table {
    private int[][] table;

    // Конструктор, инициализирующий таблицу с заданными количеством строк и столбцов
    public Table(int rows, int cols) {
        table = new int[rows][cols];  // Инициализация двумерного массива
    }

    // Метод для установки значения в ячейку по заданным индексам
    public void setValue(int row, int col, int value) {
        table[row][col] = value;
    }

    // Метод для получения значения из ячейки по заданным индексам
    public int getValue(int row, int col) {
        return table[row][col];
    }

    // Метод для получения количества строк
    public int rows() {
        return table.length;  // Возвращает количество строк
    }

    // Метод для получения количества столбцов
    public int cols() {
        return table[0].length;  // Возвращает количество столбцов
    }

    // Метод для вычисления среднего значения всех элементов таблицы
    public double average() {
        int sum = 0;
        int count = 0;

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                sum += table[i][j];
                count++;
            }
        }
        return (count == 0) ? 0 : (double) sum / count;  // Возвращает 0, если таблица пуста
    }

    // Метод для преобразования таблицы в строку
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                sb.append(table[i][j]).append("\t");
            }
            sb.append("\n");  // Переход на новую строку после вывода одной строки таблицы
        }
        return sb.toString();
    }

    // Метод для вывода таблицы на экран
    public void printTable() {
        System.out.print(this);  // Используем toString для печати
    }

    public static void main(String[] args) {
        // Пример использования класса Table
        Table Table = new Table(4, 4); // Создание таблицы 3 строки на 4 столбца

        // Установка значений в таблице
        Table.setValue(0, 0, 1);
        Table.setValue(1, 1, 5);
        Table.setValue(2, 2, 10);
        Table.setValue(3, 3, 50);

        // Печать таблицы
        System.out.println("Таблица:\n" + Table);



        // Получение размеров таблицы
        System.out.println("               Количество строк: " + Table.rows());
        System.out.println("            Количество столбцов: " + Table.cols());

        // Получение значений
        System.out.println("       Значение в ячейке (1, 2): " + Table.getValue(1, 2));

        // Вычисление среднего
        System.out.println("Среднее значение всех элементов: " + Table.average());
    }
}