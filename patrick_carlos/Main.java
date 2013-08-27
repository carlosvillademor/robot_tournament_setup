
public class Main {
	public static void main(String[] args) {
		Robot robot = new Robot();
        System.out.println(robot.move());
    }

    @Test
    public void write_out_four() {
        assert(Robot.move() == 4);
    }

    public static class Robot {
        public void move() {
            return 4;
        }
    }


}