import java.util.ArrayList;

public class task1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        ArrayList<String> list1 = new ArrayList<>(){{
            add("A1");
            add("B2");
            add("C3");
            add("D4");
            add("E5");
        }};

        System.out.println(list);
        System.out.println(list1);
    }
}
