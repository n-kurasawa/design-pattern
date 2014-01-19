package chapter10_strategy;

/**
 * じゃんけんの戦略のためのインターフェイス
 * @author naohiro
 *
 */
public interface Strategy {
	Hand nextHand();
	void study(boolean win);
}
