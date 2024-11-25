import java.util.ArrayList;
public class task3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Строка_1");
        list.add("Строка_2");
        list.add("Строка_3");
        list.add("Строка_4");
        list.add("Строка_5");


        searchString(list,"Строка_3");
    }

    public static void searchString(ArrayList<String> list,String str) {
        for (int i = 0; i <list.size(); i++) {
            if (list.get(i).equals(str)) {
                System.out.println("index: " + i);
            }
        }
    }
}
