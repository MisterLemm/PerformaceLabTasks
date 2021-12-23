package task2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class RingCoordinates {
    public static void main(String[] args) throws IOException {
        BufferedReader circleCoords = new BufferedReader(
                new FileReader(args[0]));
        String initialCoords = circleCoords.readLine();
        String[] split = initialCoords.split(" ");
        int centreX = Integer.parseInt(split[0]);
        int centreY = Integer.parseInt(split[1]);
        int radius = Integer.parseInt(circleCoords.readLine());
        circleCoords.close();

        BufferedReader listOfCoords = new BufferedReader(
                new FileReader(args[1]));
        String coords = listOfCoords.readLine();

        int x = 0;
        int deltaX = 0;
        int y = 0;
        int deltaY = 0;
        int squareDistance = 0;
        int squareRadius = 0;

        while (coords != null) {
            String[] split2 = coords.split(" ");
            x = Integer.parseInt(split2[0]);
            y = Integer.parseInt(split2[1]);
            deltaX = x - centreX;
            deltaY = y - centreY;
            squareDistance = deltaX * deltaX + deltaY * deltaY;
            squareRadius = radius * radius;
            if (squareDistance == squareRadius) {
                System.out.println("0");
            } else if (squareDistance < squareRadius) {
                System.out.println("1");
            } else {
                System.out.println("2");
            }
            coords = listOfCoords.readLine();
        }
        listOfCoords.close();
    }
}
