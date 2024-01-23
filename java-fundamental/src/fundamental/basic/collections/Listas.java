package fundamental.basic.collections;

import java.util.ArrayList;
import java.util.List;

public class Listas {
    public static void main(String[] args) {

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.remove(2);

        System.out.println("integers = " + integers);

    }


}
