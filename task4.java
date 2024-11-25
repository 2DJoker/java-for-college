import java.util.ArrayList;

public class task4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) + 2);
        }
        System.out.println(list);
    }
}
