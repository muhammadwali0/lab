// Program to suggest appropriate clothing based on temperature and weather condition (rainy or sunny).

import java.util.Scanner;

public class WeatherAdvisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the current temperature (°C): ");
        int temperature = input.nextInt();

        System.out.print("Enter the weather condition (rainy/sunny): ");
        String weather = input.next().toLowerCase();

        String advice;

        if (temperature < 0) {
            advice = weather.equals("rainy") ? "Wear a heavy coat and take an umbrella." : "Wear a heavy coat and sunglasses.";
        } else if (temperature <= 10) {
            advice = weather.equals("rainy") ? "Wear a warm jacket and take an umbrella." : "Wear a warm jacket and sunglasses.";
        } else if (temperature <= 20) {
            advice = weather.equals("rainy") ? "Wear a light jacket and take an umbrella." : "Wear a light jacket and sunglasses.";
        } else {
            advice = weather.equals("rainy") ? "Wear light clothing and take an umbrella." : "Wear light clothing and sunglasses.";
        }

        System.out.println("Advice: " + advice);
    }
}
