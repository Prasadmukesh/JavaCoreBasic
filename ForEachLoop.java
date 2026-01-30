public class ForEachLoop {
    public static void main(String[] args) {
        String cars[]={"BMW","VOLVO","MERCEDES","HONDA","MG","TATA","MAHINDRA"};
        System.out.println("Length of cars array "+cars.length);
        for (String car : cars) {
            System.out.println(car);
            
        }

        // simple for loop
        for(int i=0;i<cars.length;i++)
        {
            System.out.println(i+":"+cars[i]);
        }

        //loop within loop or nested if

        for(int i=1;i<=5;i++)
        {
            for(int j=1; j<=5;j++)
            {
              System.out.print("RAM"+"  ");  
            }
            System.err.println();
        }
    }
}
