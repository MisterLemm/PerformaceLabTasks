package task4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Task4 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(
                new FileReader(args[0]));
        String line = reader.readLine();
        ArrayList<Integer> arrayList = new ArrayList<>();

        while (line != null) {
            arrayList.add(Integer.valueOf(line));
            line = reader.readLine();
        }
        reader.close();
        Collections.sort(arrayList);
        double median;
        if (arrayList.size() % 2 == 0) {
            median = ((double) arrayList.get(arrayList.size() / 2) + (double) arrayList.get(arrayList.size() / 2 - 1)) / 2;
        } else {
            median = (double) arrayList.get(arrayList.size() / 2);
        }
        int roundedMedian = (int) Math.round(median);
        int moves;
        int count = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            moves = Math.abs(arrayList.get(i) - roundedMedian);
            count = count + moves;
        }
        System.out.println(count);
    }
}
