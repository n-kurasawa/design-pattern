package chapter18_memento.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by naohiro on 2013/12/31.
 */
public class Gamer {
    private int money;
    private List<String> fruits = new ArrayList<String>();
    private Random random = new Random();
    private static String[] fruitsname = {"リンゴ", "ぶどう", "バナナ", "みかん"};
    public Gamer(int money) {
        this.money = money;
    }
    public int getMoney() {
        return money;
    }
    public void bet() {
        int dice = random.nextInt(6) + 1;
        if (dice == 1) {
            money += 100;
            System.out.println("所持金が増えました。");
        } else if(dice == 2) {
            money /= 2;
            System.out.println("所持金が半分になりました。");
        } else if(dice == 6) {
            String f = getFruit();
            System.out.println("フルーツ(" + f + ")をもらいました。");
            fruits.add(f);
        } else {
            System.out.println("なにも起こりませんでした。");
        }
    }

    public Memento createMemento() {
        Memento m = new Memento(money);
        for (String f : fruits) {
            if(f.startsWith("おいしい")) {
                m.addFruit(f);
            }
        }
        return m;
    }

    public void restoreMemento(Memento memento) {
        this.money = memento.money;
        this.fruits = memento.getFruits();
    }

    public String toString() {
        return "[money = " + money + ", fruits = " + fruits + "]";
    }

    private String getFruit() {
        String prefix = "";
        if (random.nextBoolean()) {
            prefix = "おいしい";
        }
        return prefix + fruitsname[random.nextInt(fruitsname.length)];
    }
}
