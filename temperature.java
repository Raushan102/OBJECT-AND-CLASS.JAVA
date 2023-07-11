class temperatureOF {

    public void celsiusToFahrenheit(int celsius) {
        int fahrenheit = 0;
        fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("temperature  fahrenheit: " + fahrenheit);
    }

    public void fahrenheitToCelsius(int fahrenheit) {
        int celsius = 0;

        celsius = (fahrenheit- 32) * 5 / 9;
        System.out.println("temperature in celsius: " + celsius);

    }

}

public class temperature {
    public static void main(String[] args) {
        temperatureOF[] first=new temperatureOF[2];

            first[0]=new temperatureOF();
            first[1]=new temperatureOF();

            first[0].celsiusToFahrenheit(65);
            first[1].fahrenheitToCelsius(25);

    }

}
