package src.core.logging;

public class StudentLogger implements Logger {
    @Override
    public void log(String data) {
        System.out.println("Öğrenci işlem yaptı: "+ data);
    }
}
