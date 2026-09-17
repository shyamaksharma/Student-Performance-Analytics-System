package util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileUtility {

    private static final String DATA_FOLDER = "data";

    public static void saveData(String fileName, String data) {

        try {
            Path folderPath = Paths.get(DATA_FOLDER);

            if (!Files.exists(folderPath)) {
                Files.createDirectories(folderPath);
            }

            Path filePath = folderPath.resolve(fileName);

            Files.writeString(filePath, data);

            System.out.println("Data saved successfully.");

        } catch (IOException e) {
            System.out.println("Error saving data: " + e.getMessage());
        }
    }

    public static String loadData(String fileName) {

        try {
            Path filePath = Paths.get(DATA_FOLDER, fileName);

            if (!Files.exists(filePath)) {
                return "";
            }

            return Files.readString(filePath);

        } catch (IOException e) {
            System.out.println("Error loading data: " + e.getMessage());
            return "";
        }
    }
}