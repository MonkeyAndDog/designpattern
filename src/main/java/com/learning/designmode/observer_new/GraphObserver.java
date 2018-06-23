package com.learning.designmode.observer_new;

public class GraphObserver implements Observer {
    @Override
    public void update(NumberGenerator generator) {
        int count = generator.getNumber();
        for (int i = 0; i < count; i++) {
            System.out.print('*');
        }
        System.out.print(generator.getNumber());
        System.out.println("");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
    }
}
