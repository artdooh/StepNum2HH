import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class FileWork {
    public String fileName;
    public File file;
    FileWork(String fileName) {
        file = new File(fileName);
    }
    public static void existsFile(File file) throws FileNotFoundException {
        if (!file.exists()) throw new FileNotFoundException(file.getName());
    }

    public List<String> read() throws FileNotFoundException {
        List<String> polinomList = new LinkedList<String>();
        existsFile(file);
        try {
            BufferedReader bfr = new BufferedReader(new FileReader(file.getAbsoluteFile()));
            String str;
            try {
                while ((str = bfr.readLine()) != null) {
                    polinomList.add(str);
                }
            } finally {
                bfr.close();
            }
        } catch (IOException e) {
                throw new RuntimeException(e);
            }
        return polinomList;
    }
}
