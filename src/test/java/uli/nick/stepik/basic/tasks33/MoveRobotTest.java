package uli.nick.stepik.basic.tasks33;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.BDDAssertions.then;
import static uli.nick.stepik.basic.tasks33.MoveRobot.moveRobot;

class MoveRobotTest {

    @Test
    void moveRobotTest0() {
        Robot robot = new Robot();
        moveRobot(robot, 3, 4);

        int[] actual = new int[]{robot.getX(), robot.getY()};

        then(actual).isEqualTo(new int[]{3, 4});
    }

    @Test
    void moveRobotTest1() {
        Robot robot = new Robot();
        moveRobot(robot, -3, 4);

        int[] actual = new int[]{robot.getX(), robot.getY()};

        then(actual).isEqualTo(new int[]{-3, 4});
    }

    @Test
    void moveRobotTest2() {
        Robot robot = new Robot();
        moveRobot(robot, 3, -4);

        int[] actual = new int[]{robot.getX(), robot.getY()};

        then(actual).isEqualTo(new int[]{3, -4});
    }

    @Test
    void moveRobotTest3() {
        Robot robot = new Robot();
        moveRobot(robot, -3, -4);

        int[] actual = new int[]{robot.getX(), robot.getY()};

        then(actual).isEqualTo(new int[]{-3, -4});
    }

    @Test
    void moveRobotTest4() {
        Robot robot = new Robot();
        moveRobot(robot, 0, 0);

        int[] actual = new int[]{robot.getX(), robot.getY()};

        then(actual).isEqualTo(new int[]{0, 0});
    }
}