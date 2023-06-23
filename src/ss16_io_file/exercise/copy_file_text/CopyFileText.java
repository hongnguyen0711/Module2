package ss16_io_file.exercise.copy_file_text;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFileText {
    public static void writeFile(String pathFIle, List<String> text, boolean append) {
        File file = new File(pathFIle);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, append);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (String s : text) {
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            }


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<String> readFile(String pathFile) {
        List<String> stringList = new ArrayList<>();
        File file = new File(pathFile);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }

    public static void main(String[] args) {
        final String PATH_FILE_DATA = "src\\ss16_io_file\\exercise\\copy_file_text\\data.csv";
        final String PATH_FILE_DATA_COPY = "src\\ss16_io_file\\exercise\\copy_file_text\\datacopy.csv";
        List<String> stringList = readFile(PATH_FILE_DATA);
        writeFile(PATH_FILE_DATA_COPY, stringList, true);
    }
}
