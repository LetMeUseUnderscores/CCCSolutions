import java.util.Arrays;
import java.util.Scanner;


public class CCC08S1 {

    public static class City implements Comparable<City> {
        String name;
        int temperature;

        public City(String n, int t) {
            name = n;
            temperature = t;
        }

        public int compareTo(City o) {
            return Integer.compare(this.temperature, o.temperature);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "";
        City[] cities = new City[10000];
        int i = 0;
        do {
            name = sc.next();
            City x = new City(name, sc.nextInt());
            cities[i] = x;
            i++;
        } while (!name.equals("Waterloo"));
        Arrays.sort(cities, 0, i);
        System.out.println(cities[0].name);
    }

}
