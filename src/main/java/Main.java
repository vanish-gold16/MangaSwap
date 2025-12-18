import org.flywaydb.core.Flyway;
import service.TradeService;

public class Main {

    public static void main(String[] args) {

    // flyway
    Flyway flyway = Flyway.configure().
            dataSource("jdbc:mysql://localhost:3306/mangaswap_database",
                    "root", "ivanmy2008").load();

    flyway.migrate();

    System.out.println("Flyway Migrated");

    }

}
