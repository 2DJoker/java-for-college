import java.util.ArrayList;

public class task6 {
    public static void searchCharacterAndDelete(ArrayList<String> list, String character) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).charAt(0) == character.charAt(0)) {
                list.remove(i);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A gentle breeze whispers through the trees.");
        list.add("The sun sets behind the distant hills.");
        list.add("A quiet morning greets the sleepy town.");
        list.add("Stars twinkle in the velvet sky.");
        list.add("A lone bird sings its evening song.");
        searchCharacterAndDelete(list, "A");
        System.out.println(list);

    }

}
