public class FileLogger extends  Logger{
    public FileLogger(int priority) {
        super(priority);
    }

    @Override
    void write(String msg) {
        System.out.println("Записываем в файл " + msg);
    }
}
