package chapter22_command.drawer;

import chapter22_command.command.Command;

import java.awt.*;

/**
 * Created by naohiro on 2014/01/02.
 */
public class DrawCommand implements Command {
    protected Drawable drawable;
    private Point position;
    public DrawCommand(Drawable drawable, Point position) {
        this.drawable = drawable;
        this.position = position;
    }
    public void execute() {
        drawable.draw(position.x, position.y);
    }

}
