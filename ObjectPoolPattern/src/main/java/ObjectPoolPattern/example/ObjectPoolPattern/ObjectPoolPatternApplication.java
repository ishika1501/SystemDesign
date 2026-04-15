package ObjectPoolPattern.example.ObjectPoolPattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ObjectPoolPatternApplication {

	public static void main(String[] args) {

		SpringApplication.run(ObjectPoolPatternApplication.class, args);

		DBConnectionPool pool = new DBConnectionPool(2);

		DBConnection conn1 = pool.getConnection();
		conn1.executeQuery("SELECT * FROM users");

		pool.releaseConnection(conn1);

		DBConnection conn2 = pool.getConnection();
		conn2.executeQuery("SELECT * FROM orders");

		DBConnection conn3 = pool.getConnection();
		conn3.executeQuery("SELECT * FROM orders");

		pool.releaseConnection(conn3);

		DBConnection conn4 = pool.getConnection();
		conn4.executeQuery("SELECT * FROM orders");
	}

}
