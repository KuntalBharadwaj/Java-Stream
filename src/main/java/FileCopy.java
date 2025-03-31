import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        String sourceFile = "source.txt";  // Change this to your source file path
        String destinationFile = "destination.txt"; // Change this to your destination file path

        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            // Open source file for reading
            fis = new FileInputStream(sourceFile);

            // Open destination file for writing (creates it if it doesn't exist)
            fos = new FileOutputStream(destinationFile);

            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }

            System.out.println("File copied successfully!");
        } catch (FileNotFoundException e) {
            System.out.println("Error: Source file not found!");
        } catch (IOException e) {
            System.out.println("Error: An I/O error occurred - " + e.getMessage());
        } finally {
            try {
                if (fis != null) fis.close();
                if (fos != null) fos.close();
            } catch (IOException e) {
                System.out.println("Error closing files: " + e.getMessage());
            }
        }
    }
}
