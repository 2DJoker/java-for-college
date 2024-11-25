import java.util.ArrayList;

public class task5 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        list1.add("A");
        list1.add("B");

        list2.add("C");
        list2.add("D");

        System.out.println(list1);
        System.out.println(list2);

        for (int i = 0; i < list2.size(); i++) {
            list1.add(list2.get(i));
        }
        System.out.println(list1);
    }
}
