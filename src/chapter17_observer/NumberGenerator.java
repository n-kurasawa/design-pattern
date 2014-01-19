package chapter17_observer;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: naohiro
 * Date: 2013/12/22
 * Time: 13:12
 * To change this template use File | Settings | File Templates.
 */
public abstract class NumberGenerator {
    private ArrayList<Observer> observers = new ArrayList<Observer>();
    public void addObserver(Observer observer) {
        observers.add(observer);
    }
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
    public abstract int getNumber();
    public abstract void execute();
}