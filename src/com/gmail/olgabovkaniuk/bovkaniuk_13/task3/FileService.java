package com.gmail.olgabovkaniuk.bovkaniuk_13.task3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileService {
    public void readFile() {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader("fileNew.txt"))) {
            String line = br.readLine();
            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            List<String> stringList = deleteWordsFromFile(sb);
            writeToFile(stringList);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private List<String> deleteWordsFromFile(StringBuilder sb) {
        String line = sb.toString();
        String[] strings = line.split("\\p{P}?[ \\t\\n\\r\\(\\)]+");
        List<String> stringList = new ArrayList<>();
        for (String string : strings) {
            if (string.length() < 3 || string.length() > 5) {
                stringList.add(string);
            }
        }
        System.out.println(stringList);
        return stringList;
    }

    private void writeToFile(List<String> stringList) {
        File file = new File("E://homework/files.txt");
        FileWriter fw = null;
        try {
            fw = new FileWriter(file);
            for (String string : stringList) {
                fw.write(string);
                fw.write(", ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
