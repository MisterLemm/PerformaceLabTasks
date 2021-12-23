package task1;

import java.io.IOException;
import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) throws IOException {
        int length = Integer.parseInt(args[0]);
        int moveLength = Integer.parseInt(args[1]);

        /* BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите длину массива");
        int length = Integer.parseInt(reader.readLine());
        System.out.println("Введите длину обхода");
        int moveLength = Integer.parseInt(reader.readLine());
        reader.close();*/

        int firstElement = 0;
        int lastElement = 0;
        String path = "";
        int arrayStart = 0;

        CircularList<Integer> circularList = new CircularList<>();
        for (int i = 1; i <= length; i++) {
            circularList.add(i);
        }

        ArrayList<Integer> bufferedList = new ArrayList<>();
        firstElement = circularList.get(0);
        arrayStart = firstElement;
        while (true) {

            for (int i = firstElement; i <= ((firstElement + moveLength)-1); i++) {
                bufferedList.add(circularList.get(i));
            }

            path = path + firstElement;
            lastElement = bufferedList.get(moveLength - 2);
            firstElement = lastElement;
            bufferedList.clear();
            if (firstElement == arrayStart) {
                break;
            }
        }

        System.out.println(path);
    }
}
