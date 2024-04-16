package Exercise2;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> cousinNum = new ArrayList<>();

        for (int i = 100; i < 301; i++) {
            boolean isCousin = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isCousin = false;
                    break;
                }
            }
            if (isCousin) {
                cousinNum.add(i);
                if (cousinNum.size() == 10) {
                    break;
                }
            }
        }

        for (int num : cousinNum) {
            System.out.println(num);
        }
    }
}




