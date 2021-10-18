package config;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Logger {

    public static void log(String message) throws IOException {
        PrintWriter out = new PrintWriter(new FileWriter("Pasur.log", true), true);
        out.write(message + "\n");
        out.close();
    }

    public static void clearLog() throws IOException {
        PrintWriter out = new PrintWriter(new FileWriter("Pasur.log", false), true);
        out.write("");
        out.close();
    }

}