import java.util.ArrayList;

public class task7 {
    public static void searchMaxInt(ArrayList<Integer> list){
        int max = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(2);
        list.add(34);
        list.add(5);
        System.out.println(list);
        searchMaxInt(list);
    }
}
