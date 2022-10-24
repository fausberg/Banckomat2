import java.util.ArrayList;
import java.util.Scanner;

public class UserStorage {

    boolean user = false;

    public ArrayList<User> users = new ArrayList<>();

    public void setUsers() {
        users.add(new User("Ivan", "Fadeev", "1234 3182 4132 3213", "1234", "34820"));
        users.add(new User("Anton", "Krot", "4324 4328 4324 0930", "4324", "324080"));
        users.add(new User("Masha", "Fadeeva", "2144 7389 8073 3213", "5678", "74829"));
    }

    public User getUser(String cardNumber) {
        User transferUser = new User();
        for (User anotheruser : users) {
            if (cardNumber.equals(anotheruser.getCardNumber(anotheruser.getCard()))) {
                return anotheruser;
            }
        }
        System.out.println("такого пользователя нет");
        System.out.println("Введите номер карты снова");
        cardNumber = new Scanner(System.in).nextLine();
        getUser(cardNumber);
        return new User();
    }

    public User getUserOnPIN(String PIN) {
        for (User anotheruser : users) {
            if (PIN.equals(anotheruser.getPIN(anotheruser.getCard()))) {
                return anotheruser;
            }
        }
        System.out.println("Неправильный пин-код");
        System.out.println("Введите снова пин-код");
        PIN = new Scanner(System.in).nextLine();
        getUserOnPIN(PIN);
        return new User();
    }
}

