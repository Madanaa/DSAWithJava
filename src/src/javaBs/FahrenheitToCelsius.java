package javaBs;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        // celsius = (5/9)(fahrenheit-32)
        double celsius;
        double tempInFahrenheit = 43;
        celsius = ((tempInFahrenheit-32)*5)/9;
        System.out.println(celsius);
        System.out.printf("%10.2f  %10.5f",tempInFahrenheit,celsius);
    }
}
