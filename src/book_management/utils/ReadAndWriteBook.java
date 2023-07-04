package book_management.utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteBook {
    public static List<String> readFile(String path) {
        List<String> list = new ArrayList<>();
        File file = new File(path);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                list.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void writeFile(String path, String text, boolean append) {
        File file = new File(path);
        try {
            FileWriter fileWriter = new FileWriter(file,append);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(text);
            bufferedWriter.newLine();

            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
