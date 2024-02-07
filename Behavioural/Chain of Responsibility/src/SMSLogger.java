public class SMSLogger extends Logger{
    public SMSLogger(int priority) {
        super(priority);
    }

    @Override
    void write(String msg) {
        System.out.println("СМС " + msg);
    }
}
