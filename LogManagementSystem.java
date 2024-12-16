import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
class LogManagementSystem {
    private String logFileName;

    public LogManagementSystem(String logFileName) {
        this.logFileName = logFileName;
        createLogFile();
    }

    // Create log file
    private void createLogFile() {
        FileOperations fileOps = new FileOperations();
        fileOps.createFile(logFileName);
    }

    // Write a log message
    public void writeLog(String logMessage) {
        String timestamp = java.time.LocalDateTime.now().toString();
        String logEntry = timestamp + " - " + logMessage + "\n";
        FileOperations fileOps = new FileOperations();
        fileOps.writeFile(logFileName, logEntry);
    }

    // Read logs
    public void readLogs() {
        FileOperations fileOps = new FileOperations();
        fileOps.readFile(logFileName);
    }

    // Delete logs
    public void deleteLogs() {
        FileOperations fileOps = new FileOperations();
        fileOps.deleteFile(logFileName);
    }

    public static void main(String[] args) {
        LogManagementSystem logSystem = new LogManagementSystem("app.log");

        logSystem.writeLog("Application started.");
        logSystem.writeLog("User logged in.");
        logSystem.readLogs();
        logSystem.deleteLogs();
    }
}
