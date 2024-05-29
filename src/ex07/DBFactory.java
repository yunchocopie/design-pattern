package ex07;

import ex07.lib.DB;
import ex07.lib.MariaDB;
import ex07.lib.OracleDB;

public class DBFactory {

    private static DBFactory instance = new DBFactory();

    private DBFactory() {}

    public static DBFactory getInstance() {
        return instance;
    }

    // 단점 : OCP 위배
    // 책임 : new를 대신해줌
    public DB createDB(String protocol) { // maria, oracle, mysql, mssql
        if (protocol.equals("maria")) {
            MariaDB mariaDB = new MariaDB();
            mariaDB.setUrl("jdbc:mariadb://127.0.0.1:3306");

            return mariaDB;

        } else if (protocol.equals("oracle")) {
            OracleDB oracleDB = new OracleDB();
            oracleDB.setUrl("jdbc:oracle:thin://127.0.0.1:8080");

            return oracleDB;
        } else {
            throw new NullPointerException("db driver not found exception");
        }
    }
}
