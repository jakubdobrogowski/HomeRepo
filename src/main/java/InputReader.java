import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class InputReader {

    public static void main(String[] args) {

        InputReader inputReader = new InputReader();

        List<String> strings = inputReader.readFromFile();
        System.out.println(strings);
    }

    public List<String> readFromFile() {

        List<String> list = new ArrayList<>();
        String line;
        String filepath = "/Users/jakubdobrogowski/Desktop/final_albums.txt";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filepath))) {
            while ((line = bufferedReader.readLine()) != null)

                list.add(line);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return list;
    }
}
