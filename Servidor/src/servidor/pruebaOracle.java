package servidor;

import oracle.jdbc.pool.*;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

public class pruebaOracle {
  public static void main(String []args) throws SQLException {
    OracleDataSource ods = new OracleDataSource();
    ods.setURL("jdbc:oracle:thin:HR/hr@localhost:1521:ORCL");
    Connection conn = ods.getConnection();
    DatabaseMetaData meta = conn.getMetaData();
    System.out.println("JDBC driver version is "+ meta.getDriverVersion());
    String cuenta = "1";
    System.out.println(4+Integer.parseInt(cuenta));
  }
}
