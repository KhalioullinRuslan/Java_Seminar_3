import java.util.ArrayList;
import java.util.Comparator;

// Заполнить список десятью случайными числами. 
// Отсортировать список методом sort() и вывести его на экран.

public class Task_15 {
     public static void main(String[] args) {
        ArrayList<Double> arrayList = new ArrayList<>(10);


        for (int i = 0; i <= 10; i++) {
            double rand = Math.round((Math.random())*100);
            arrayList.add(rand);

        }

        arrayList.sort(Comparator.naturalOrder());

        for (double i: arrayList) {
            System.out.println(i);

        }
     }
    }