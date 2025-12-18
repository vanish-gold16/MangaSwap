import entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import service.TradeService;

public class UI {

    SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
    Session session = sessionFactory.openSession();

    public void startApp(){

        User buyer = new User("Ivan Romanov", "netupoi", "pidoras228");

        TradeService tradeService = new TradeService();
        tradeService.startTrade(session, buyer, );

    }

}
