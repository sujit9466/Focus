package ObjectClass;
import java.sql.Connection;
import java.sql.SQLException;

public class Database {

    Connection con;

    Database() {
        //con = something;
    }

    public void close() {
        try {
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        con.close();
    }
}
