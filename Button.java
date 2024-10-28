import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button extends JFrame {
    // Переменная для хранения количества нажатий
    private int clickCount;
    private JLabel label;

    public Button() {
        // Инициализация количества нажатий
        this.clickCount = 0;

        // Настройка окна
        setTitle("Счетчик нажатий кнопки");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Центрирование окна

        // Создание кнопки
        JButton button = new JButton("Нажми меня!");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                click(); // Обработка нажатия кнопки
            }
        });

        // Создание метки для отображения количества нажатий
        label = new JLabel("Количество нажатий: " + clickCount);
        label.setHorizontalAlignment(SwingConstants.CENTER);

        // Размещение компонентов в окне
        setLayout(new java.awt.BorderLayout());
        add(label, java.awt.BorderLayout.CENTER);
        add(button, java.awt.BorderLayout.SOUTH);
    }

    // Метод для обработки нажатия кнопки
    private void click() {
        clickCount++; // Увеличиваем количество нажатий
        label.setText("Количество нажатий: " + clickCount); // Обновляем текст метки
    }

    public static void main(String[] args) {
        // Создание и отображение окна
        SwingUtilities.invokeLater(() -> {
            Button frame = new Button();
            frame.setVisible(true);
        });
    }
}