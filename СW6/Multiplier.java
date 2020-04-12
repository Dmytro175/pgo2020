import java.math.BigDecimal;
import java.util.ArrayList;
public class Multiplier {
    private ArrayList<Integer> liczby=new ArrayList<>();
    public int multiply(int a, int b){
        return a*b;
    }
    public int multiply(int a, int b, int c, int d) {

        return multiply(a, b)*c*d;
    }
    public double multiply(double a, double b){
        return a*b;
    }
    public BigDecimal multiply(BigDecimal a, BigDecimal b) {
        return a.multiply(b);
    }

    public int multiply(ArrayList<Integer> liczby){
        int result=1;
        for (int i = 0; i < liczby.size(); i++){
            int n = liczby.get(i);
            result = result * n;
        }
        return result;
    }
}

