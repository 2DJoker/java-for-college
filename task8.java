import java.util.ArrayList;

public class task8 {
    public static void searchDublicates(ArrayList<String> list){
        String key;
        for (int i = 0; i < list.size(); i++) {
            key = list.get(i);
            for (int j = i + 1; j < list.size(); j++) {
                if (key.equals(list.get(j))) {
                    list.remove(j);
                    j--;
                }
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("A");
        list.add("D");
        list.add("A");
        list.add("C");
        list.add("A");
        list.add("D");
        list.add("A");
        System.out.println(list);
        searchDublicates(list);
        System.out.println(list);
    }
}
