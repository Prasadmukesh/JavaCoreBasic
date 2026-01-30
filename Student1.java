class Student1{  
 int rollno;  
 String name;  
 String city; 
 String country;
 String Phone; 
  
 Student1(int rollno, String name, String city,String country, String Phone){  
 this.rollno=rollno;  
 this.name=name;  
 this.city=city;  
 this.country=country;
 this.Phone=Phone;
 } 
 public String toString(){//overriding the toString() method  
    return "Roll Number: "+rollno+"\n"+"Name :"+name+" "+city+ " "+country+ " "+Phone;  
   }   
  
 public static void main(String args[]){  
   Student1 s1=new Student1(101,"Raj","lucknow","India","747354757");  
   Student1 s2=new Student1(102,"Vijay","ghaziabad","India","8484754577");  
     
   System.out.println(s1.toString());//compiler writes here s1.toString()  
   System.out.println(s2.toString());//compiler writes here s2.toString()  
 }  
}  