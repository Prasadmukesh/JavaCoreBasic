class JavaString {
    public static void main(String[] args) {
        char[] cityname={'b','a','n','g','l','o','r','e'};

        System.out.println(cityname);

        String s1=new String(cityname);
        String resultString = new String(cityname, 4, 4); 
        System.out.println(resultString); 

        System.out.println(s1);
        System.out.println("length of s1 "+s1.length());

        String name="Mukesh";
        System.out.println("Hi  I am "+name);

        String language=new String("English");
        System.out.println("I teach java in "+language);

       String s2= name.concat(" Kumar");
        System.out.println(s2);

        System.out.println(s2.toUpperCase());
        System.out.println(s2.toLowerCase());


        // String Buffer 
        // Creating a StringBuffer  
        StringBuffer sb = new StringBuffer("Hello");  
        System.out.println(sb);
        // Appending to the StringBuffer  
        sb.append(", World!");  
        System.out.println(sb);
        // Inserting into the StringBuffer  
        sb.insert(5, " Java");  
        System.out.println(sb);
        // Deleting from the StringBuffer  
        sb.delete(5, 10);  
        System.out.println(sb); // Output: Hello, World!  

    }
    
    
}
