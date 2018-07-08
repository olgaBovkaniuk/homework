package com.gmail.olgabovkaniuk.bovkaniuk_17.task1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class FileService {
    private final FileInfo fileInfo = new FileInfo();

    public void writeToFile(int numberOfLine) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("lines.txt"))) {
            for (int i = 0; i < numberOfLine; i++) {
                String string = String.format("С:\\WebServers\\home\\testsite\\www\\myfile%d.txt", i);
                bufferedWriter.write(string);
                bufferedWriter.write("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<String> readFromFile() {
        List<String> strings = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("lines.txt"))) {
            String string = bufferedReader.readLine();
            while (string != null) {
                strings.add(string);
                string = bufferedReader.readLine();
            }
            System.out.println(strings);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return strings;
    }

    private List<String> getFileNameFromString(List<String> strings) {
        List<String> namesList = new ArrayList<>();
        for (String string : strings) {
            String[] stringsArray = string.split(Pattern.quote(File.separator));
            for (String s : stringsArray) {
                if(s.endsWith(".txt")) {
                    namesList.add(s.replaceAll(".txt", ""));
                }
            }
        }
        return namesList;
    }

    public void writeToFileNames() {
        List<String> namesList = getFileNameFromString(readFromFile());
        System.out.println(namesList);
        Thread thread = new Thread(new WriteFileRunnable(namesList, fileInfo));
        thread.start();
        System.out.println("Thread started.");
        System.out.println("Waiting for size.");
        System.out.println("Final size is: " + fileInfo.getSize());
    }
}
