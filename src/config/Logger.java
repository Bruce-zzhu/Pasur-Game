package config;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Logger {

    /**
     * Append texts to the log file
     * @param message
     * @throws IOException
     */
    public static void log(String message) throws IOException {
        PrintWriter out = new PrintWriter(new FileWriter("Pasur.log", true), true);
        out.write(message + "\n");
        out.close();
    }

    /**
     * Clear contents in the log file
     * @throws IOException
     */
    public static void clearLog() throws IOException {
        PrintWriter out = new PrintWriter(new FileWriter("Pasur.log", false), true);
        out.write("");
        out.close();
    }

}