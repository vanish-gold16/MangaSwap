package service;

import org.hibernate.Session;
import dao.CollectionItemDAO;
import entity.CollectionItem;
import entity.User;
import org.hibernate.SessionFactory;
import org.hibernate.metamodel.SessionFactoryBuilder;

import javax.security.auth.login.Configuration;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TradeService {

    private final Lock lock = new ReentrantLock();

    private CollectionItemDAO collectionItemDAO =  new CollectionItemDAO();

    public void startTrade(Session session, User buyer, User seller, CollectionItem tradeItem, LocalDateTime tradeTime) throws InterruptedException {

        if(lock.tryLock(2, TimeUnit.SECONDS)){

        }

    }

}
