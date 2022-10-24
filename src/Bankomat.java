import java.util.Scanner;

public class Bankomat {

    Examination examination = new Examination();

    public void transfer(User user, UserStorage users){
        System.out.println("Введите сумму");
        String sum = new Scanner(System.in).nextLine();
        sum = examination.examinationSum(sum);
        int summ = Integer.parseInt(sum);
        System.out.println("Введите номер карты человека, которому хотите перевести деньги");
        String cardNumber = new Scanner(System.in).nextLine();
        User anotherUser = users.getUser(cardNumber);
        if(summ < user.getBalance(user.getCheck())){
            Check userCheck = user.getCheck();
            Check anotherUserCheck = anotherUser.getCheck();
            anotherUserCheck.plusBalance(summ);
            userCheck.minusBalance(summ);
            String massage = "Перевод с карты на карту на сумму " + summ;
            String massageAnotherUser = "Пополнение на сумму " + summ;
            user.info(user.getTransaction(), massage);
            anotherUser.info(anotherUser.getTransaction(), massageAnotherUser);
        }else{
            System.out.println("Недостаточно средств");
        }
    }

    public void payment(User user){
        System.out.println("Введите сумму");
        String sum = new Scanner(System.in).nextLine();
        sum = examination.examinationSum(sum);
        int summ = Integer.parseInt(sum);
        if(summ < user.getBalance(user.getCheck())){
            Check check = user.getCheck();
            check.minusBalance(summ);
            String massage = "Оплата счетов на сумму " + summ;
            user.info(user.getTransaction(), massage);
        }else{
            System.out.println("Недоствточно средств");
        }
    }

    public void replenishment(User user){
        System.out.println("Введите сумму");
        String sum = new Scanner(System.in).nextLine();
        sum = examination.examinationSum(sum);
        int summ = Integer.parseInt(sum);
        if(summ > 0){
            user.setBalance(user.getCheck(), summ);
            String massage = "Пополнение на сумму " + summ;
            user.info(user.getTransaction(), massage);
        }else{
            System.out.println("Неправильно введена сумма");
        }
    }

    public void balance(User user){
        System.out.println(user.getBalance(user.getCheck()));
    }

    public void info(User user){
        user.getInfo(user.getTransaction());
    }
}
