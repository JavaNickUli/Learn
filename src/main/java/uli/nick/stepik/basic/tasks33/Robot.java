package uli.nick.stepik.basic.tasks33;

public class Robot {
    private int x=0;
    private int y=0;
    private Direction direction = Direction.UP;

    public Direction getDirection() {
        return direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void turnLeft() {
        switch (getDirection()) {
            case DOWN -> direction = Direction.RIGHT;
            case UP -> direction = Direction.LEFT;
            case RIGHT -> direction = Direction.UP;
            case LEFT -> direction = Direction.DOWN;
        }
    }
    public void turnRight() {
        switch (getDirection()) {
            case DOWN -> direction = Direction.LEFT;
            case UP -> direction = Direction.RIGHT;
            case RIGHT -> direction = Direction.DOWN;
            case LEFT -> direction = Direction.UP;
        }
    }

    public void stepForward() {
        switch (getDirection()) {
            case RIGHT -> x++;
            case LEFT -> x--;
            case UP -> y++;
            case DOWN -> y--;
        }
    }
}
