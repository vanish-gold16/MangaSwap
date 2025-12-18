package service;

import entity.User;
import org.hibernate.Session;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class BalanceService {

    private final Scanner scanner = new Scanner(System.in);

    public void depositByCard(Session session, User user, Long card){

        boolean flag = true;
        AtomicInteger amount = new AtomicInteger(0);
        int amount1 = 0;

        System.out.print("--- Depositing by a card ---\nPlease, enter " +
                "amount of deposit(Kč): ");
        while(flag) {
            amount1 = scanner.nextInt();
            if(amount1 > 0) {
                flag = false;
                continue;
            }
            System.out.println("The amount cannot be negative or zero!");
        }
        System.out.println("Please, enter your card number:");
        Long cardNumber = scanner.nextLong();

        user.setBallance(user.getBallance().getAndAdd(amount1));
    }

}
