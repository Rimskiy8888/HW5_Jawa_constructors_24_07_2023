import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
          // Ввод со сканера

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your message: ");
        String yourMessage =  scanner.nextLine();
        System.out.println(yourMessage.replaceAll("fuck","f**k").replaceAll("bullshit","b******t"));

        // Без сканера
        TextMessage textMessage = new TextMessage("I don't give a fuck");

        TextMessage textMessage1 = new TextMessage("Hello world");

        TextMessage textMessage2 = new TextMessage("Your programm is bullshit");

    }
}
