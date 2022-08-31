package uli.nick.stepik.basic.tasks33;

public class MoveRobot2 {

    public static void moveRobot(Robot robot, int toX, int toY) {
        while (robot.getX() != toX || robot.getY() != toY) {
            if (robot.getDirection() == Direction.UP && robot.getY() < toY
                    || robot.getDirection() == Direction.RIGHT && robot.getX() < toX
                    || robot.getDirection() == Direction.DOWN && robot.getY() > toY
                    || robot.getDirection() == Direction.LEFT && robot.getX() > toX) {
                robot.stepForward();
            } else if (robot.getDirection() == Direction.UP && robot.getX() < toX
                    || robot.getDirection() == Direction.RIGHT && robot.getY() > toY
                    || robot.getDirection() == Direction.DOWN && robot.getX() > toX
                    || robot.getDirection() == Direction.LEFT && robot.getY() < toY) {
                robot.turnRight();
            }
        }
    }
}
