package CW7;

import java.time.LocalDate;
import java.util.ArrayList;

public class CreditCardForm {
    private static final ArrayList<Integer> Exper_Yer=new ArrayList<>();
    private final Object RandomNumber = 0;
    private int number;
    private int cvc;
    private int expirition;

    static {
        int currentYer=getCurrentYer();
        for (int i=currentYer; i<currentYer + 20;i ++){
            Integer t=Exper_Yer.get(i);
            System.out.println("rok"+ currentYer);
        }
    }

    public CreditCardForm (int number, int cvc){
        this.number=number;
        this.cvc=cvc;
        this.expirition= RandomNumber.nextIntFromRange(Exper_Yer.get(0),Exper_Yer.get(Exper_Yer.size()-1));
    }

    public int getExpirition(){
        return expirition;
    }



     private static int getCurrentYer(){
        return LocalDate.now().getYear();
     }
}

 
