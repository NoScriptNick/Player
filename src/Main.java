import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Player p1 = new Player();
        Player p2 = new Player(InputHelper.getNonZeroLenString(scan, "Please enter player 2 name: "), InputHelper.getInt(scan, "Please enter player 2 x-coordinate: "), InputHelper.getInt(scan, "Please enter player 2 y-coordinate: "), InputHelper.getInt(scan, "Please enter player 2 z-coordinate: "));
        Player p3 = new Player(InputHelper.getNonZeroLenString(scan, "Please enter player 3 name: "), InputHelper.getInt(scan, "Please enter player 3 x-coordinate: "), InputHelper.getInt(scan, "Please enter player 3 y-coordinate: "), InputHelper.getInt(scan, "Please enter player 3 z-coordinate: "), 77, 2);

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
    }
}