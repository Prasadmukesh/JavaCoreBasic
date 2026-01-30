import java.util.Scanner;
import java.util.Arrays;


class ArrayTestDemo {
    int arr4[]=new int[11];

   Scanner sc=new Scanner(System.in);
   void Userinput()
   {
    for(int i=0;i<arr4.length;i++)
    {
        System.out.println("Enter a number :");
        arr4[i]=sc.nextInt();

       
    }
   }
   
    void Showdata()
    {
        System.out.println("Length of array is "+arr4.length);
        int s=0;
        for(int i=0;i<arr4.length;i++)
        {
            System.out.println(i+"->"+arr4[i]);
            s+=arr4[i];
        }
        System.out.println("\n Sum of Array is "+s);

    }

    public static void main(String[] args)

    {
        // ArrayTestDemo t1=new ArrayTestDemo();
        // t1.Userinput();
        // t1.Showdata();
        int[] array1={66,55,33,22,88,99,11,57};
        System.out.println("Length of Array1 "+array1.length);

        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1)); 

        System.out.println(Arrays.toString(array1)); 


        // copy array data
        int[] copiedArray = Arrays.copyOf(array1, 8);
        System.out.println("Copy array data "+Arrays.toString(copiedArray)); 

        int[] array2={66,99,44,99,33,90,34};

        System.out.println(Arrays.equals(array1, copiedArray));  // Output: true

        System.out.println(Arrays.equals(array1, array2));

        int[] numbers = new int[15];
        Arrays.fill(numbers, 78);
        System.out.println(Arrays.toString(numbers));  // Output: [42, 42, 42, 42, 42]


    
        int index = Arrays.binarySearch(array1, 55);
        System.out.println(index);  // Output: 2

        // Array Stream API
        int total = Arrays.stream(array1).sum();
        System.out.println("Total is "+total);  // Output: 15




        
        
    }




    
}
