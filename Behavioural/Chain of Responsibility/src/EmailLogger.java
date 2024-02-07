public class EmailLogger extends Logger{
    public EmailLogger(int priority) {
        super(priority);
    }

    @Override
    void write(String msg) {
        System.out.println("Email сообщение " + msg);
    }
}
