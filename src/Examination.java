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


}
