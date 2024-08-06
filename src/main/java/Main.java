import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankAccount client = new BankAccount();
        client.deposit(15000);

        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Сумма для вывода денег: ");
            int userSumInput = scanner.nextInt();
            try {
                client.withDraw(userSumInput);
                System.out.println("Успешно! Остаток: " + client.getAmount());
            } catch (LimitException e) {
                System.out.println(e.getMessage());
            }
        }
    }

}