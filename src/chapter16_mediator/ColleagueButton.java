package chapter16_mediator;

import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * User: naohiro
 * Date: 2013/12/22
 * Time: 10:34
 * To change this template use File | Settings | File Templates.
 */
public class ColleagueButton extends Button implements Colleague {
    private Mediator mediator;
    public ColleagueButton(String caption) {
        super(caption);
    }
    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
    @Override
    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);
    }
}
