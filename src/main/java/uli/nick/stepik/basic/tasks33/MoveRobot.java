package uli.nick.stepik.basic.tasks33;

/**
 * <p>На игровом поле находится робот. Позиция робота на поле описывается двумя целочисленным координатами: X и Y. Ось X смотрит слева направо, ось Y — снизу вверх. (Помните, как рисовали графики функций в школе?)
 * <p>В начальный момент робот находится в некоторой позиции на поле. Также известно, куда робот смотрит: вверх, вниз, направо или налево. Ваша задача — привести робота в заданную точку игрового поля.
 * <p>Робот описывается классом Robot. Вы можете пользоваться следующими его методами (реализация вам неизвестна):
 * <pre>{@code public class Robot {
 *     public Direction getDirection() // текущее направление взгляда
 *     public int getX() // текущая координата X
 *     public int getY() // текущая координата Y
 *     public void turnLeft() // повернуться на 90 градусов против часовой стрелки
 *     public void turnRight() // повернуться на 90 градусов по часовой стрелке
 *     public void stepForward() // шаг в направлении взгляда
 *         // за один шаг робот изменяет одну свою координату на единицу
 * }}</pre>
 * Direction, направление взгляда робота,  — это перечисление:
 * <pre>{@code public enum Direction {
 *     UP, DOWN, LEFT, RIGHT
 * }}</pre>
 */

public class MoveRobot {

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
            } else {
                robot.turnLeft();
            }
        }
    }
}
