package uli.nick.stepik.basic.tasks33;

public class MoveRobot {

    public static void moveRobot(Robot robot, int toX, int toY) {
        int deltaX = toX - robot.getX();
        int deltaY = toY - robot.getY();
        while (deltaX != 0 || deltaY != 0) {
            if (robot.getDirection().name().equals("UP")) {
                if (deltaY > 0) {
                    robot.stepForward();
                    deltaY--;
                } else if (deltaX > 0) {
                    robot.turnRight();
                } else {
                    robot.turnLeft();
                }
            }
            if (robot.getDirection().name().equals("RIGHT")) {
                if (deltaX > 0) {
                    robot.stepForward();
                    deltaX--;
                } else if (deltaY < 0) {
                    robot.turnRight();
                } else {
                    robot.turnLeft();
                }
            }
            if (robot.getDirection().name().equals("DOWN")) {
                if (deltaY < 0) {
                    robot.stepForward();
                    deltaY++;
                } else if (deltaX < 0) {
                    robot.turnRight();
                } else {
                    robot.turnLeft();
                }
            }
            if (robot.getDirection().name().equals("LEFT")) {
                if (deltaX < 0) {
                    robot.stepForward();
                    deltaX++;
                } else if (deltaY > 0) {
                    robot.turnRight();
                } else {
                    robot.turnLeft();
                }
            }
        }
    }
}
