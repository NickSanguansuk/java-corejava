package topics.io_demo.nio_demo.demo2_tutorialspoint;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadFile {

    public static void main(String[] args) {

        Path wiki_path = Paths.get("src\\topics\\io_demo\\nio_demo\\demo2_tutorialspoint\\dataFile2a.txt");
        Charset charset = StandardCharsets.ISO_8859_1;
        try {
            List<String> lines = Files.readAllLines(wiki_path, charset);
            for (String line : lines) {
                System.out.println(line);
            }
        }
        catch (IOException e) {
            System.out.println(e);
        }

    }
}
