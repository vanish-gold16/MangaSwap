package service;

import entity.Trade;
import org.hibernate.Session;
import dao.CollectionItemDAO;
import entity.CollectionItem;
import entity.User;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.metamodel.SessionFactoryBuilder;

import javax.security.auth.login.Configuration;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TradeService {

    private final Lock lock = new ReentrantLock();

    private CollectionItemDAO collectionItemDAO =  new CollectionItemDAO();

    public void startTrade(Session session, User buyer, User seller, CollectionItem tradeItem) throws InterruptedException {

        Transaction transaction = session.beginTransaction();

        try{
            tradeItem.setUser(buyer);
            tradeItem.setForTrade(false);

            Trade trade = new Trade(buyer, seller, tradeItem, LocalDateTime.now());
            session.update(tradeItem);
            session.persist(trade);

            transaction.commit();
            System.out.println("Deal is done!\n" + tradeItem.toString());
        } catch(Exception e){
            if(transaction != null) transaction.rollback();
            e.printStackTrace();
            System.out.println("Trade failed! Rolling back.\n");
        }

    }

}
