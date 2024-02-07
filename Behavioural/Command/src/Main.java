public class Main {
    public static void main(String[] args) {
        Comp c = new Comp();
        User u = new User(new StartCommand(c), new StopCommand(c), new ResetCommand(c));

        u.startComputer();
        u.stopComputer();
        u.resetComputer();

    }
}