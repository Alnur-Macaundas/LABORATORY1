public class TemperatureAct4 {
    public static void main (String[] args){

        int temp = 25;

        System.out.println("Temperature: " + temp);

        if (temp < 20) {
            System.out.println("Cold");
        } else if (temp <= 29) {
            System.out.println("Warm");
        } else {
            System.out.println("Hot");
        }
    }
}