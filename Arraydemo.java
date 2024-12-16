
import java.util.Arrays;

public class Arraydemo {
    int arr[] = new int[10];

    int a = 10;

    public void adddata() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = a;
            a = a + 5;

        }
    }

    public void Display() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }

    }

    public void Sum()

    {
         int s = 0;
        for (int i = 0; i < arr.length; i++)
         {
            s += arr[i];
           

        }
        System.out.println("SUM OF ARRAY DATA " + s);
    }
   public void Arraysort()
    {
        Arrays.sort(arr);
    }
}
