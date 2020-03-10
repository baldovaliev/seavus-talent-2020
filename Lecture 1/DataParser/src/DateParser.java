import java.util.*;

public class DateParser {
    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine();

        String[] split = str.split("/");
        String month = split[0];
        String day = split[1];
        String year = split[2];
        System.out.println("Month:" + month + " day:" + day + " year:" + year);

    }
}
