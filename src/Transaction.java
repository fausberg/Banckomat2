import java.util.ArrayList;

public class Transaction {

    ArrayList<String> info = new ArrayList<>();

    public void transactionInfo(String massage){
        info.add(massage);
        info.add("\n");
    }

    public void getInfo(){
        System.out.println(info);
    }
}
