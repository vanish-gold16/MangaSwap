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

        lock.lock();

        try{
            isLocked = true;
            while(offer == null){
                receiverCondition.await();
            }
            System.out.println("You've received new offer!\n");
            Thread.sleep(1000);
            while(!rightInput) {
                System.out.print("Do you accept it? (Y/n): ");
                String answer = scanner.nextLine();
                if (answer.equalsIgnoreCase("Y")) {
                    acceptOffer = true;
                    rightInput = true;
                } else if (answer.equalsIgnoreCase("n")) {
                    acceptOffer = false;
                    rightInput = true;
                } else System.out.println("There's no such an answer!\n"); rightInput = false;
            }

            if(acceptOffer){
                tradeService.startTrade(session, );
            }

        } finally{
            if(isLocked) lock.unlock();
        }
    }

}
