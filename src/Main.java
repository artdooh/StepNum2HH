import java.io.FileNotFoundException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        FileWork fileWork = new FileWork("polinoms.txt");
        List<String> polinomList = fileWork.read();
        int len = polinomList.size();
        for (int i = 0; i < len; i++) {
            Polinom.openBrackets(polinomList.get(i).toCharArray());
        }
    }
}
