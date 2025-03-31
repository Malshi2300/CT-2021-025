package Q_01;

import java.util.Scanner;

public class Temperature {

        private double celsius;

        public Temperature(){
            this.celsius = 0.0;
        }

        Temperature(double celsius){
            this.celsius = celsius;
        }

        public double toCelsius() {
            return this.celsius;
        }
        public double toFahrenheit() {
            return this.celsius * 9/5 + 32;
        }

        public void setCelsius(double celsius){
            this.celsius = celsius;
        }
        public void setFahrenheit(double fahrenheit) {
            this.celsius = (fahrenheit - 32) * 5/9;
        }

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.println("Enter temperature in celsius :");
                double inputCelsius = scanner.nextDouble();

                Temperature temp = new Temperature((inputCelsius));

                System.out.println("Temperature in Fahrenheit : " + temp.toFahrenheit());

                scanner.close();
            }

}


