package solutions.day24;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Solution {

    static Logger log = LogManager.getLogger();


    static int twoLastFunctions(int w12, int w13, int z, int y) {
        int w = w12;
        int x = 0;
        x = x + z;
        x = x % 26;
        z = z / 26;
        x = x + -10;
        x = (x == w) ? 1 : 0;
        x = (x == 0) ? 1 : 0;
        y = y * 0;
        y = y + 25;
        y = y * x;
        y = y + 1;
        z = z * y;
        y = y * 0;
        y = y + w;
        y = y + 14;
        y = y * x;
        z = z + y;

        w = w13;
        x = 0;
        x = x + z;
        x = x % 26;
        z = z / 26;
        x = x + -9;
        x = (x == w) ? 1 : 0;
        x = (x == 0) ? 1 : 0;
        y = y * 0;
        y = y + 25;
        y = y * x;
        y = y + 1;
        z = z * y;
        y = y * 0;
        y = y + w;
        y = y + 10;
        y = y * x;
        z = z + y;
        return z;
    }

    public static void main(String[] args) throws IOException {

        URL resource = solutions.day16.Solution.class.getResource("/day24.txt");
        List<String> lines = Files.lines(Paths.get(resource.getPath())).toList();
    }

    static List<String> generateCode(List<String> lines) {
        List<String> code = new ArrayList<>();
        code.add("int w = 0;");
        code.add("int x = 0;");
        code.add("int y = 0;");
        code.add("int z = 0;");

        int i = 0;
        for (String line : lines) {
            String[] s = line.split(" ");
            String action = s[0];
            String v1 = s[1];
            if (!action.equals("inp")) {
                String v2 = s[2];
                code.add(parseLine(action, v1, v2));
            } else {
                code.add("w = input[" + i + "];");
                i++;
            }
        }
        return code;
    }


    static String parseLine(String action, String v1, String v2) {
        switch (action) {
            case "add":
                return v1 + " = " + v1 + " + " + v2 + ";";
            case "mul":
                return v1 + " = " + v1 + " * " + v2 + ";";
            case "div":
                return v1 + " = " + v1 + " / " + v2 + ";";
            case "mod":
                return v1 + " = " + v1 + " % " + v2 + ";";
            case "eql":
                return v1 + " = (" + v1 + " == " + v2 + ") ? 1 : 0;";
        }
        return "";
    }

    static int generatedCode(int[] input) {
        int w = 0;
        int x = 0;
        int y = 0;
        int z = 0;
        w = input[0];
        x = x * 0;
        x = x + z;
        x = x % 26;
        z = z / 1;
        x = x + 15;
        x = (x == w) ? 1 : 0;
        x = (x == 0) ? 1 : 0;
        y = y * 0;
        y = y + 25;
        y = y * x;
        y = y + 1;
        z = z * y;
        y = y * 0;
        y = y + w;
        y = y + 13;
        y = y * x;
        z = z + y;
        w = input[1];
        x = x * 0;
        x = x + z;
        x = x % 26;
        z = z / 1;
        x = x + 10;
        x = (x == w) ? 1 : 0;
        x = (x == 0) ? 1 : 0;
        y = y * 0;
        y = y + 25;
        y = y * x;
        y = y + 1;
        z = z * y;
        y = y * 0;
        y = y + w;
        y = y + 16;
        y = y * x;
        z = z + y;
        w = input[2];
        x = x * 0;
        x = x + z;
        x = x % 26;
        z = z / 1;
        x = x + 12;
        x = (x == w) ? 1 : 0;
        x = (x == 0) ? 1 : 0;
        y = y * 0;
        y = y + 25;
        y = y * x;
        y = y + 1;
        z = z * y;
        y = y * 0;
        y = y + w;
        y = y + 2;
        y = y * x;
        z = z + y;
        w = input[3];
        x = x * 0;
        x = x + z;
        x = x % 26;
        z = z / 1;
        x = x + 10;
        x = (x == w) ? 1 : 0;
        x = (x == 0) ? 1 : 0;
        y = y * 0;
        y = y + 25;
        y = y * x;
        y = y + 1;
        z = z * y;
        y = y * 0;
        y = y + w;
        y = y + 8;
        y = y * x;
        z = z + y;
        w = input[4];
        x = x * 0;
        x = x + z;
        x = x % 26;
        z = z / 1;
        x = x + 14;
        x = (x == w) ? 1 : 0;
        x = (x == 0) ? 1 : 0;
        y = y * 0;
        y = y + 25;
        y = y * x;
        y = y + 1;
        z = z * y;
        y = y * 0;
        y = y + w;
        y = y + 11;
        y = y * x;
        z = z + y;
        w = input[5];
        x = x * 0;
        x = x + z;
        x = x % 26;
        z = z / 26;
        x = x + -11;
        x = (x == w) ? 1 : 0;
        x = (x == 0) ? 1 : 0;
        y = y * 0;
        y = y + 25;
        y = y * x;
        y = y + 1;
        z = z * y;
        y = y * 0;
        y = y + w;
        y = y + 6;
        y = y * x;
        z = z + y;
        w = input[6];
        x = x * 0;
        x = x + z;
        x = x % 26;
        z = z / 1;
        x = x + 10;
        x = (x == w) ? 1 : 0;
        x = (x == 0) ? 1 : 0;
        y = y * 0;
        y = y + 25;
        y = y * x;
        y = y + 1;
        z = z * y;
        y = y * 0;
        y = y + w;
        y = y + 12;
        y = y * x;
        z = z + y;
        w = input[7];
        x = x * 0;
        x = x + z;
        x = x % 26;
        z = z / 26;
        x = x + -16;
        x = (x == w) ? 1 : 0;
        x = (x == 0) ? 1 : 0;
        y = y * 0;
        y = y + 25;
        y = y * x;
        y = y + 1;
        z = z * y;
        y = y * 0;
        y = y + w;
        y = y + 2;
        y = y * x;
        z = z + y;
        w = input[8];
        x = x * 0;
        x = x + z;
        x = x % 26;
        z = z / 26;
        x = x + -9;
        x = (x == w) ? 1 : 0;
        x = (x == 0) ? 1 : 0;
        y = y * 0;
        y = y + 25;
        y = y * x;
        y = y + 1;
        z = z * y;
        y = y * 0;
        y = y + w;
        y = y + 2;
        y = y * x;
        z = z + y;
        w = input[9];
        x = x * 0;
        x = x + z;
        x = x % 26;
        z = z / 1;
        x = x + 11;
        x = (x == w) ? 1 : 0;
        x = (x == 0) ? 1 : 0;
        y = y * 0;
        y = y + 25;
        y = y * x;
        y = y + 1;
        z = z * y;
        y = y * 0;
        y = y + w;
        y = y + 15;
        y = y * x;
        z = z + y;
        w = input[10];
        x = x * 0;
        x = x + z;
        x = x % 26;
        z = z / 26;
        x = x + -8;
        x = (x == w) ? 1 : 0;
        x = (x == 0) ? 1 : 0;
        y = y * 0;
        y = y + 25;
        y = y * x;
        y = y + 1;
        z = z * y;
        y = y * 0;
        y = y + w;
        y = y + 1;
        y = y * x;
        z = z + y;
        w = input[11];
        x = x * 0;
        x = x + z;
        x = x % 26;
        z = z / 26;
        x = x + -8;
        x = (x == w) ? 1 : 0;
        x = (x == 0) ? 1 : 0;
        y = y * 0;
        y = y + 25;
        y = y * x;
        y = y + 1;
        z = z * y;
        y = y * 0;
        y = y + w;
        y = y + 10;
        y = y * x;
        z = z + y;
        w = input[12];
        x = x * 0;
        x = x + z;
        x = x % 26;
        z = z / 26;
        x = x + -10;
        x = (x == w) ? 1 : 0;
        x = (x == 0) ? 1 : 0;
        y = y * 0;
        y = y + 25;
        y = y * x;
        y = y + 1;
        z = z * y;
        y = y * 0;
        y = y + w;
        y = y + 14;
        y = y * x;
        z = z + y;
        w = input[13];
        x = x * 0;
        x = x + z;
        x = x % 26;
        z = z / 26;
        x = x + -9;
        x = (x == w) ? 1 : 0;
        x = (x == 0) ? 1 : 0;
        y = y * 0;
        y = y + 25;
        y = y * x;
        y = y + 1;
        z = z * y;
        y = y * 0;
        y = y + w;
        y = y + 10;
        y = y * x;
        z = z + y;
        return z;
    }
}





