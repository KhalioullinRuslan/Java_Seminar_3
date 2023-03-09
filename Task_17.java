import java.util.ArrayList;
import java.util.Arrays;

// Создать список типа ArrayList. Поместить в него как строки, так и целые числа. 
// Пройти по списку, найти и удалить целые числа.

public class Task_17 {

    public static void main(String[] args) {
    ArrayList arrLst = new ArrayList<>(Arrays.asList("propety1", 59, "propety1", 1.62, "propety1", "propety2", 8, "propety5"));
        System.out.println(arrLst);
        int i = 0;
        while (i < arrLst.size())
        {
            if (arrLst.get(i) instanceof Integer == true)
            {
                arrLst.remove(i);
            }
            i++;
        }
        System.out.println(arrLst);
    }
}
