 class ExceptionExample1 {
    public static void main(String[] args)

    {
        try{
        int a=120;
        int b=0;
        int c=a/b;
        System.out.println(c);
        }
        catch(Exception e)
        {
            System.out.println("Zero division Error");
            System.out.println("Error");
        }
        System.out.println("Hello java");
    }
    
}
