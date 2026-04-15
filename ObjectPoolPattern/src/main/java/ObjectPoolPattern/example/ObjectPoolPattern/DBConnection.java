package ObjectPoolPattern.example.ObjectPoolPattern;

public class DBConnection {
    private final int id;

    public DBConnection(int id) {
        this.id = id;
    }

    public void executeQuery(String sql) {
        System.out.println("Connection " + id + " executing: " + sql);
    }

    public void reset() {
        System.out.println("Connection " + id + " reset");
    }
}
