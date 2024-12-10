package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Turn lights on,if it is raining and car is running(>100) OR is dark.
 */
public class LightsOn {

    public static void main(String[] args) {
        final int MAX_CAR_SPEED = 100;
        boolean isRaining = false;
        boolean isDark = false;
        boolean isRunning = false;
        boolean areLightsOn = false;
        Scanner in = new Scanner(System.in);
        int speed = 0;

        System.out.println("Please insert if it is raining");
        isRaining = in.nextBoolean();

        System.out.println("Please insert if it is dark");
        isDark = in.nextBoolean();

        System.out.println("Please insert car's speed");
        speed = in.nextInt();

        isRunning = speed > MAX_CAR_SPEED;
        areLightsOn = isRaining && (isDark || isRunning);
        //areLightsOn = (isRaining && isDark) || (isRaining && isRunning);

    }
}
