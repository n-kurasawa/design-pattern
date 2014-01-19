package chapter18_memento.game;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by naohiro on 2013/12/31.
 */
public class Memento {
    int money;
    ArrayList<String> fruits;
    public int getMoney() {
        return money;
    }
    Memento(int money) {
        this.money = money;
        this.fruits = new ArrayList<String>();
    }
    void addFruit(String fruit) {
        fruits.add(fruit);
    }
    List<String> getFruits() {
        return (List)fruits.clone();
    }
}
