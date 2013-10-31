package robot;

import org.junit.Test;

public class RobotTest {


    @Test
    public void write_first_empty() {
        Robot robot = new Robot("0X-------");
        System.out.println(robot.move());
        assert(robot.move() == 4);
    }

    @Test
    public void on_empty_board_player_is_nought() {
        Robot robot = new Robot("---------");
        assert(robot.player() == "0");
    }

    @Test
    public void on_odd_board_player_is_cross() {
        Robot robot = new Robot("0-X--0---");
        assert(robot.player() == "X");
    }

    @Test
    public void find_horizontal_blocks() {
        Robot robot = new Robot("00XXX00-0");
        assert(robot.move() == 7);
    }

    @Test
    public void find_last_horizontal_block() {
        Robot robot = new Robot("0-XXX00-0");
        assert(robot.move() == 7);
    }

    @Test
    public void find_vertical_block() {
        Robot robot = new Robot("0XX--XXX0");
        assert(robot.move() == 4);
    }
}
