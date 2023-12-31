package HW21;

import HW21.config.DataSourceConfig;
import HW21.datasource.PooledDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        PooledDataSource dataSource = initPooledDataSource();

        long start = System.nanoTime();
        for (int i = 0; i < 100; i++) {
            try (Connection connection = dataSource.getConnection()) {
                connection.prepareStatement("select * from persons");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        var end = System.nanoTime();
        System.out.println((end - start) / 1000_000 + "ms");
    }

    private static PooledDataSource initPooledDataSource() {
        return new PooledDataSource(new DataSourceConfig(
                "jdbc:postgresql://localhost:5432/test_db",
                "postgres",
                "123"
        ));
    }
}