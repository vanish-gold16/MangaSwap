package service;

import entity.Offer;
import entity.User;
import org.hibernate.Session;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class OfferService {

    private TradeService tradeService = new TradeService();

    private final Lock lock = new ReentrantLock();
    private final Condition senderCondition = lock.newCondition();
    private final Condition receiverCondition = lock.newCondition();

    private final Scanner scanner = new Scanner(System.in);

    private Offer offer = null;

    public void sendNewOffer(Offer userOffer, User sender, User receiver) throws InterruptedException {
        if(lock.tryLock(2, TimeUnit.SECONDS)){

        }
    }

    public void recieveOffers(Session session) throws InterruptedException {

        boolean isLocked = false;
        boolean acceptOffer = false;
        boolean rightInput = false;



    }

}
