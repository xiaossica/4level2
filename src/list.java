/**
 * Created by Queen on 2016/11/3 0003.
 */
import java.util.*;

public class list {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("我");
        strings.add("是");
        strings.add("一");
        strings.add("只");
        strings.add("小");
        strings.add("小");
        strings.add("小");
        strings.add("鸟");
        for (int i = 0; i < strings.size(); i++) {
            System.out.print(strings.get(i));
        }
        System.out.println(" ");
        for (int i = strings.size() - 1; i >= 0; i--) {
            System.out.printf(strings.get(i));
        }
        System.out.println(" ");
        strings = new Vector<String>();
        strings.add("我");
        strings.add("是");
        strings.add("一");
        strings.add("只");
        strings.add(0,"小");
        strings.add(4,"小");
        strings.add("小");
        strings.add("鸟");
        for (int i = 0;i < strings.size();i++){
            System.out.printf(strings.get(i));
        }
        System.out.println(" ");
        for (int i = strings.size() - 1;i >= 0;i--){
            System.out.printf(strings.get(i));
        }
        System.out.println(" ");
        Iterator<String> it = strings.iterator();
        while(it.hasNext()){
            System.out.print(it.next());
        }
        System.out.println(" ");
        strings = new ArrayList<>();
        strings.add("我");
        strings.add("是");
        strings.add("一");
        strings.add("只");
        strings.add("小");
        strings.add("小");
        strings.add("小");
        strings.add("鸟");
        for (String str : strings) {
            System.out.print(str);
        }

    }
}
