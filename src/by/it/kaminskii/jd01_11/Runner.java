package by.it.kaminskii.jd01_11;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<String> list = new ListB<>();
        List<String> listerList = new ListB<>();
        list.add("0");
        list.add("2");
        list.add("4");
        list.add("6");
        list.add("8");
        list.add("10");
        list.add("12");
        list.add("14");
        list.add("16");
        list.add("18");
        System.out.println(list);
        list.remove(0);
        list.remove(4);
        list.remove(7);
        list.get(2);
        System.out.println(list + "\n");
        list.set(0, "0");
        list.set(6, null);
        listerList.add("1000");
        listerList.add("1001");
        listerList.add("1002");
        System.out.println(list);

    }
}
