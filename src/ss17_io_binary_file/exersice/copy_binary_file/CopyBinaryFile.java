package ss17_io_binary_file.exersice.copy_binary_file;

import ss17_io_binary_file.exersice.product_managment.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyBinaryFile {
    public static void writeBinaryFile(String pathFile, List<String> text) {
        File file = new File(pathFile);
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(text);

            objectOutputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static List<String> readBinaryFile(String pathFile) {
        List<String> productList = new ArrayList<>();
        File file = new File(pathFile);
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            objectInputStream = new ObjectInputStream(fileInputStream);
            productList = (List<String>) objectInputStream.readObject();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return productList;
    }

    public static void main(String[] args) {
        final String PATH_SOURCE_FILE = "src/ss17_io_binary_file/exersice/copy_binary_file/sourcefile.dat";
        final String PATH_TARGET_FILE = "src/ss17_io_binary_file/exersice/copy_binary_file/targetfile.dat";
        String text = "em thôi đẹp trai";
        String text1 = "em thôi đẹp gái";
        List<String> stringList = new ArrayList<>();
        stringList.add(text);
        stringList.add(text1);
        writeBinaryFile(PATH_SOURCE_FILE, stringList);

        List<String> list = readBinaryFile(PATH_SOURCE_FILE);
        writeBinaryFile(PATH_TARGET_FILE, list);

    }
}
