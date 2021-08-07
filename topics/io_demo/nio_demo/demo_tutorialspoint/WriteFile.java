package topics.io_demo.nio_demo.demo_tutorialspoint;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

public class WriteFile {

    public static void main(String[] args) {

        // copy(InputStream in, Path target, CopyOption� options)
        // This method is used to copy all bytes from specified input stream to specified target file and returns number of bytes read or written as long value.
        // LinkOption for this parameter with the following values

        // COPY_ATTRIBUTES  − copy attributes to the new file, e.g. last-modified-time attribute.
        // REPLACE_EXISTING − replace an existing file if it exists.
        // NOFOLLOW_LINKS   − If a file is a symbolic link, then the link itself, not the target of the link, is copied.

        // .copy()
        Path sourceFile = Paths.get("src\\topics\\io_demo\\nio_demo\\demo_tutorialspoint\\dataFile2a.txt");
        Path targetFile = Paths.get("src\\topics\\io_demo\\nio_demo\\demo_tutorialspoint\\dataFile2b.txt");

        try {
            Files.copy(sourceFile, targetFile, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            //e.printStackTrace();
            System.err.format("I/O Error when copying file");
        }

        // .readAllLines()
        Path wiki_path = Paths.get("src\\topics\\io_demo\\nio_demo\\demo_tutorialspoint\\dataFile2b.txt");
        //Charset charset = Charset.forName("ISO-8859-1");
        Charset charset = StandardCharsets.ISO_8859_1;

        try {
            List<String> lines = Files.readAllLines(wiki_path, charset);
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println(e);
        }

    }
}
