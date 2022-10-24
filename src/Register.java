import java.util.Scanner;

public class Register {

    public User register(UserStorage users){
        System.out.println("Добро пожаловать");
        System.out.println("Введите пин код");
        String PIN = new Scanner(System.in).nextLine();
        User user = users.getUserPIN(PIN);
        return user;
    }
}
