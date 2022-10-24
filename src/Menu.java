import java.util.Scanner;

public class Menu {

    Bankomat bankomat = new Bankomat();

    public void menu(User user, UserStorage userStorage){
        int start = 0;
        while (start == 0) {
            String possibility = """
                        Если хотите пополнит баланс нажмите 1
                        Если хотите посмотреть баланс нажмите 2
                        Если хотите перевести с карты на карту нажмите 3
                        Если хотите оплатить нажмите 4
                        Если хотите увидеть все транзакции нажмите 5
                        """;
            System.out.println(possibility);
            int number = new Scanner(System.in).nextInt();
            switch (number) {
                case 1 -> bankomat.replenishment(user);
                case 2 -> bankomat.balance(user);
                case 3 -> bankomat.transfer(user, userStorage);
                case 4 -> bankomat.payment(user);
                case 5 -> bankomat.info(user);
                default -> System.out.println("Такой операции нет");
            }
            System.out.println("Вы хотите продолжить? Введите да или нет");
            String endWork = new Scanner(System.in).nextLine();
            boolean examination = true;
            while (examination) {
                if (endWork.equalsIgnoreCase("нет")) {
                    start = 1;
                    examination = false;
                } else if (endWork.equalsIgnoreCase("да")) {
                    examination = false;
                } else {
                    System.out.println("Введено неверное слово. Введите снова да или нет");
                    endWork = new Scanner(System.in).nextLine();
                }
            }
        }

    }
}
