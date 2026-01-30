public class FinalizeExample {    
     public static void main(String[] args)     
    {     
        String s=new String("Shivani");
        FinalizeExample obj = new FinalizeExample();        
        FinalizeExample obj1 = new FinalizeExample();        
        FinalizeExample obj2 = new FinalizeExample();        
        // printing the hashcode   
        System.out.println("Hashcode is: " + obj.hashCode());           
        System.out.println("Hashcode is: " + obj1.hashCode());           
        System.out.println("Hashcode is: " + obj2.hashCode());           
        System.out.println("Hashcode is: " + s.hashCode());           
        obj = null;    
        // calling the garbage collector using gc()   
        System.gc();     
        System.out.println("End of the garbage collection");     
    }     
   // defining the finalize method   
    protected void finalize()     
    {     
        System.out.println("Called the finalize() method");     
    }     
}    