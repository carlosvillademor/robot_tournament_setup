package robot;

public class Main {
	public static void main(String[] args) {
		Robot robot = new Robot(args[0]);
        System.out.println(robot.move());
    }
}