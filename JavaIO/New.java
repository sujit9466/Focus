package JavaIO;

import  java.io.File;

public class New {
    public static void main(String[] args) {
        String directoryPath = "C:/Users/DELL 5430/Desktop/javaeclipse-workspaces/";
        String filePath = "C:/Users/DELL 5430/Desktop/javaeclipse-workspaces/java4";
        createDirectories(directoryPath);
        createFile(filePath);
    }
    
    public static void createDirectories(String directoryPath) {
        File directory = new File(directoryPath);
        if (!directory.exists()) {
            createDirectories(directory.getParent());
            if (directory.mkdir()) {
                System.out.println("Directory created: " + directoryPath);
            } else {
                System.out.println("Failed to create directory: " + directoryPath);
            }
        }
    }
    
    public static void createFile(String filePath) {
        File file = new File(filePath);
        if (!file.exists()) {
            createDirectories(file.getParent());
            try {
                if (file.createNewFile()) {
                    System.out.println("File created: " + filePath);
                } else {
                    System.out.println("Failed to create file: " + filePath);
                }
            } catch (Exception e) {
                System.out.println("Error creating file: " + e.getMessage());
            }
        }
    }
}