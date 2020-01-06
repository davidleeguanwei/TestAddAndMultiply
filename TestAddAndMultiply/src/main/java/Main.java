import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        // input reader
        String inputFileName = args.length > 0 ? args[0] : "sampleInput";
        BufferedReader br = new BufferedReader(new FileReader(inputFileName));
        Addition addition = new Addition();
        Multiplication multiplication = new Multiplication();
        for (String line = br.readLine(); line != null; line = br.readLine()) {
            //System.out.println(line);
            String[] cmds = line.trim().split("\\s+");
            if ("add".equals(cmds[0])) {
                int result = addition.add(cmds[1], cmds[2]);
                System.out.println(result);
            } else if ("multiply".equals(cmds[0])) {
                int result = multiplication.multiply(cmds[1], cmds[2]);
                System.out.println(result);
            } else {
                // ignore
            }
        }
        br.close();
    }

}
