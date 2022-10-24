import java.util.Scanner;

public class Examination {

    public String examinationSum(String sum){
        sum = sum.replaceAll(" ","");
        String regex = "[0-9]+";
        if(!sum.matches(regex)){
            System.out.println("Неправильно введёна сумма. Введите её снова");
            sum = new Scanner(System.in).nextLine();
            sum = sum.replaceAll(" ", "");
            examinationSum(sum);
        }
        return sum;
    }

    public String examinationCardNumber(String cardNumber) {
        cardNumber = cardNumber.replaceAll(" ", "");
        String regex = "[0-9]+";
        if (!cardNumber.matches(regex) || cardNumber.length() != 16) {
            System.out.println("Неправильно введён номер карты. Введите его снова");
            cardNumber = new Scanner(System.in).nextLine();
            cardNumber = cardNumber.replaceAll(" ", "");
            examinationCardNumber(cardNumber);
        }
        return cardNumber;
    }
}
