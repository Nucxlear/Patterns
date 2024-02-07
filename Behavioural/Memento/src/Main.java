public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        game.set("1",3000);
        System.out.println(game);

        File file = new File();
        file.setSave(game.save());

        game.set("2",5500);
        System.out.println(game);

        System.out.println("Loading...");
        game.load(file.getSave());
        System.out.println(game);
    }
}