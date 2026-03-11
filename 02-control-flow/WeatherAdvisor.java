// Task #3
// Scenario: You are developing a weather prediction system that advises users on
// how to dress based on the temperature and weather conditions.
//
// Task Description: The program asks the user to input the current temperature
// (in degrees Celsius) and weather condition ("rainy" or "sunny"), then gives
// advice on appropriate clothing based on the following logic:
// - Below 0°C + rainy: "Wear a heavy coat and take an umbrella."
// - Below 0°C + sunny: "Wear a heavy coat and sunglasses."
// - 0°C to 10°C + rainy: "Wear a warm jacket and take an umbrella."
// - 0°C to 10°C + sunny: "Wear a warm jacket and sunglasses."
// - 11°C to 20°C + rainy: "Wear a light jacket and take an umbrella."
// - 11°C to 20°C + sunny: "Wear a light jacket and sunglasses."
// - Above 20°C + rainy: "Wear light clothing and take an umbrella."
// - Above 20°C + sunny: "Wear light clothing and sunglasses."

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
            if (weather.equals("rainy")) {
                advice = "Wear a heavy coat and take an umbrella.";
            } else {
                advice = "Wear a heavy coat and sunglasses.";
            }
        } else if (temperature <= 10) {
            if (weather.equals("rainy")) {
                advice = "Wear a warm jacket and take an umbrella.";
            } else {
                advice = "Wear a warm jacket and sunglasses.";
            }
        } else if (temperature <= 20) {
            if (weather.equals("rainy")) {
                advice = "Wear a light jacket and take an umbrella.";
            } else {
                advice = "Wear a light jacket and sunglasses.";
            }
        } else {
            if (weather.equals("rainy")) {
                advice = "Wear light clothing and take an umbrella.";
            } else {
                advice = "Wear light clothing and sunglasses.";
            }
        }

        System.out.println("Advice: " + advice);
    }
}
