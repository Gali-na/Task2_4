/**
 * <p>На игровом поле находится робот. Позиция робота на поле описывается двумя
 * целочисленным координатами: X и Y.
 * Ось X смотрит слева направо, ось Y — снизу вверх.(Помните, как рисовали
 * графики функций в школе?)
 * В начальный момент робот находится в некоторой позиции на поле.
 * Также известно, куда робот смотрит: вверх, вниз, направо или налево.
 * Ваша задача — привести робота в заданную точку игрового поля.
 * Реализуйте метод moveRobot()</p>
 */

public class FieldXY {
    public void message (){
        System.out.println("robot at place");
    }
    public void gotoX ( int coordinateXNOW,int toX,Robot robot ){
        if(coordinateXNOW > toX){
            while(robot.getDirection()!=Direction.LEFT){
                robot.turnLeft();
            }

        }
        if(coordinateXNOW <toX){
            while(robot.getDirection()!=Direction.RIGHT){
                robot.turnRight();
            }

        }
        while(coordinateXNOW != toX){
            robot.stepForward();
        }
    }

    public void gotoY ( int coordinateYNOW,int toY,Robot robot ){
        if(coordinateYNOW > toY){
            while(robot.getDirection()!=Direction.DOWN){
                robot.turnLeft();
            }
        }
        if(coordinateYNOW <toY){
            while(robot.getDirection()!=Direction.UP){
                robot.turnRight();
            }

        }
        while(coordinateYNOW != toY){
            robot.stepForward();
        }

    }

    public void moveRobot(Robot robot, int toX, int toY) {
        int coordinateXNOW = robot.getX();
        int coordinateYNOW = robot.getY();
        if(coordinateXNOW == toX && coordinateYNOW== toY) {
            message ();
        }



        if(coordinateXNOW != toX && coordinateYNOW == toY ){
            gotoX ( coordinateXNOW,toX,robot );
            if(coordinateYNOW == toY) {
                message ();
            }
    }

        if(coordinateXNOW == toX && coordinateYNOW != toY ){

            gotoY ( coordinateYNOW, toY,robot );
            if(coordinateYNOW == toY) {
                message ();;
            }

        }

        if(coordinateXNOW != toX && coordinateYNOW != toY ){
            gotoX ( coordinateXNOW,toX,robot );
            gotoY ( coordinateYNOW, toY,robot );

            if(coordinateXNOW == toX && coordinateYNOW == toY ) {
                message ();
            }
        }

    }
}
