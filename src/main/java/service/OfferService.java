package service;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class OfferService {

    private final Lock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();

}
