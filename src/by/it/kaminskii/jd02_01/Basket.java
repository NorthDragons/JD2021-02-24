package by.it.kaminskii.jd02_01;/* created by Kaminskii Ivan
 */

import java.util.LinkedList;
import java.util.List;

public class Basket extends Thread {
    static final Object monitor = new Object();

    static List<String> basketGoods() {
        synchronized (monitor) {
            List<String> basket = new LinkedList<>();
            for (String key : by.it.kaminskii.jd02_03.Good.price().keySet()) {
                basket.add(key);
            }
            return basket;
        }
    }
}


//    static StringBuffer basketGoods() {
//       StringJoiner basketGoods = new StringJoiner(",");
//        StringBuffer basketGoods = new StringBuffer();
//        String testString = Good.price().keySet().toString();
//        testString = testString.replaceAll("[\\[\\]\s]", "");
//        testString=testString.strip();
//        String[] split = testString.split(",");
//        int randomChoosedGoods = Helper.randomValue(1,4);
//        for (int i = 0; i < randomChoosedGoods; i++) {
//            int randomGoods = Helper.randomValue(9);
//            String delim = ", ";
//            if (i == randomChoosedGoods - 1) delim = "";
//            basketGoods.append(split[randomGoods])
//                    .append(delim);
//            basketGoods.add(split[randomGoods]);
//        }
//        return basketGoods;
//    }
//}
//    public static void findGoodstoBasket(){
//    String  testString = Good.price().keySet().toString();
//    testString = testString.replaceAll("[\\[\\],]","");
//    String[] split = testString.split(" ");
//    int randomChoosedGoods = Helper.randomValue(4);
//        for (int i = 0; i < randomChoosedGoods; i++) {
//            int randomGoods = Helper.randomValue(10);
//            basketGoods.add(split[randomGoods]);
//            System.out.println(basketGoods);

