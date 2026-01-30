//User-defined class objects in Java ArrayList
import java.util.*; 
class Student{    
    int rollno;    
    String name;    
    int age;    
    Student(int rollno,String name,int age){    
     this.rollno=rollno;    
     this.name=name;    
     this.age=age;    
    }    
  }    
    
    
   class ArrayList5{    
   public static void main(String args[]){    
    //Creating user-defined class objects    
    Student s1=new Student(101,"Sonoo",23);    
    Student s2=new Student(102,"Ravi",21);    
    Student s3=new Student(103,"Hemant",20);    
    Student s4=new Student(104,"samarth",22);    
    Student s5=new Student(105,"rahul",22);    
    Student s6=new Student(106,"ajay",20);    
    Student s7=new Student(107,"anita",25);    
    Student s8=new Student(108,"Simran",25);    
    //creating arraylist    
    ArrayList<Student> al=new ArrayList<Student>();    
    al.add(s1);//adding Student class object    
    al.add(s2);    
    al.add(s3);    
    al.add(s4);    
    al.add(s5);    
    al.add(s6);    
    al.add(s7);    
    al.add(s8);    
      
    //Getting Iterator    
    Iterator itr=al.iterator();    
    //traversing elements of ArrayList object    
    while(itr.hasNext()){    
      Student st=(Student)itr.next();   
      if(st.age>22) 
      {
        System.out.println(st.rollno+" "+st.name+" "+st.age);   
      }
      
    }    
   }    
  }    