import dao.CollectionItemDAO;
import dao.UserDAO;
import entity.CollectionItem;
import entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import service.TradeService;

import java.util.ArrayList;
import java.util.List;

public class UI {

    private SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
    private Session session = sessionFactory.openSession();

    private UserDAO userDAO = new UserDAO();
    private CollectionItemDAO collectionItemDAO = new CollectionItemDAO();

    public void startApp() throws InterruptedException {

        List<CollectionItem> tradeItems = new ArrayList<>();

        CollectionItem item1 = collectionItemDAO.findByID(session, 1)
        tradeItems.add(item1);

        User seller = userDAO.findByID(session, 1);
        User buyer = userDAO.findByID(session, 2);

        TradeService tradeService = new TradeService();
        tradeService.startTrade(session, buyer, seller, tradeItems.getFirst());

    }

}
