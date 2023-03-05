package src.core.logging;

public class TeacherLogger implements Logger {
    @Override
    public void log(String data) {
        System.out.println("Öğretmen işlem yaptı: "+ data);
    }
}
