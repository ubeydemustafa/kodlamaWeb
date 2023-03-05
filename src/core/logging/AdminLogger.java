package src.core.logging;

public class AdminLogger implements Logger {
    @Override
    public void log(String data) {
        System.out.println("Admin işlem yaptı: "+ data);
    }
}
