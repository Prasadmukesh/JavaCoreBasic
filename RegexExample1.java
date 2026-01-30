import java.util.regex.*;  
class RegexExample1{  
public static void main(String args[]){  
//1st way  
Pattern p = Pattern.compile(".s");//. represents single character  
Matcher m = p.matcher("ors");  
boolean b = m.matches();  
  
//2nd way  
boolean b2=Pattern.compile(".s").matcher("ts").matches();  
  
//3rd way  
boolean b3 = Pattern.matches(".s", "ps");  
  
System.out.println(b+" "+b2+" "+b3);  

String mypassword="Akhil@1";
if(Pattern.matches("[a-zA-Z0-9]{6}",mypassword))
{
    //true 
System.out.println("Valid Password"); 
}
else{
    System.out.println("inValid Password"); 
}
} 
}