import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();
        System.out.println("Введите число: ");
        rectangle.setA(scanner.nextInt());
        System.out.println("Введите число: ");
        rectangle.setB(scanner.nextInt());
        System.out.println("Введите число: ");
        rectangle.setS(scanner.nextInt());
        System.out.println("Введите число: ");
        rectangle.setD(scanner.nextInt());
        System.out.println(rectangle.getA()+"\t" + rectangle.getB()+ "\t" + rectangle.getS()+ "\t" + rectangle.getD());
        System.out.println(rectangle.suumma());
    }
}