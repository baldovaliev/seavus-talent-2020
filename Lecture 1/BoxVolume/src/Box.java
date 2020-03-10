import java.util.*;

public class Box {
    private int height;
    private int width;
    private int depth;

    public Box(int height, int width, int depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public int volume() {
        return height * width * depth;
    }

    public static void main(String[] args) {
        System.out.println("Enter the height, width and depth of a box:");

        Scanner scanner = new Scanner(System.in);

        Box box = new Box(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());

        System.out.println(box.volume());
    }
}
