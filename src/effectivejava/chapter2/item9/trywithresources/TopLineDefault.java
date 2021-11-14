package effectivejava.chapter2.item9.trywithresources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TopLineDefault {
    static String firstLineOfFile(String path, String defaultValue) {
        try (BufferedReader br = new BufferedReader(
                new FileReader(path))) {
            return br.readLine();
        } catch (IOException e) {
            return defaultValue;
        }
    }

    public static void main(String[] args) throws IOException {
        String path = args[0];
        String defaultValue = "Toppy mctopface";
        System.out.println(firstLineOfFile(path, defaultValue));
    }
}
