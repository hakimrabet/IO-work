import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.List;

public class ReadLineSample {

    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(new File("src/main/resources/read_line.txt").toPath(), Charset.defaultCharset());

        lines.forEach(System.out::println);
    }

}
