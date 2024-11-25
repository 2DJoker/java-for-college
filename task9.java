import java.util.ArrayList;

public class task9 {
    public static void sortInAlphabeticalOrder(ArrayList<String>list){
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).compareTo(list.get(j)) > 0) {
                    String temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        System.out.println(list);
    }


    public static void main(String[] args) {

        ArrayList<String>list = new ArrayList<>();
        list.add("ghi");
        list.add("abcd");
        list.add("jkl");
        list.add("cdef");
        list.add("bcde");
        list.add("def");
        System.out.println(list);
        sortInAlphabeticalOrder(list);
    }
}
