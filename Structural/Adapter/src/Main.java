public class Main {
    public static void main(String[] args) {
        Database database = new AdapterToDatabase();
        database.insert();
        database.update();
        database.select();
        database.remove();
    }
}