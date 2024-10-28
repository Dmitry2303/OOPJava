import java.util.Scanner;

public class Bell {
    public void sound(int i){
        while (i>0){
            System.out.println("Ding");
            System.out.println("Dong");
            i--;

        }

    }
    public static void main(String[] args){
        System.out.println("Введите количество повторений");
        Scanner scan = new Scanner(System.in);
        Bell per = new Bell();
        per.sound(scan.nextInt());
    }
}
