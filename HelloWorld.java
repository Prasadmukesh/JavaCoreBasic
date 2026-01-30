class HelloWorld {
    public static void main(String args[])
    {
        try{
            System.out.println("Hello Java");
            int[] a={90,88,66,77};

            for (int i =0;i<4;i++)
            {
            System.out.println(a[i]);
            }
            System.out.println(a[3]);
        }
        catch(Exception e)
        {
            System.out.println("Error :"+e);
        }
        //executed regardless of exception occurred or not  
 finally {  
    System.out.println("finally block is always executed");  
    }    
    }
    
}
