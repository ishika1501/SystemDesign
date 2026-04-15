package ObjectPoolPattern.example.ObjectPoolPattern;

import java.util.LinkedList;
import java.util.Queue;

public class DBConnectionPool {
    private final Queue<DBConnection> pool = new LinkedList<>();
    private final int maxSize;
    private int currentSize = 0;

    public DBConnectionPool(int maxSize) {
        this.maxSize = maxSize;
    }

    public synchronized DBConnection getConnection(){
        if(!pool.isEmpty())return pool.poll();

        if (currentSize < maxSize) {
            currentSize++;
            return new DBConnection(currentSize);
        }

        throw new RuntimeException("No DB connections available");
    }

    public synchronized void releaseConnection(DBConnection conn){
        conn.reset();
        pool.offer(conn);
    }

}
