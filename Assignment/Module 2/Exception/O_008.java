package Exception;

/*
 * • W.A.J.P to create a class Student with attributes roll no, name, age and course. Initialize values 
 * through parameterized constructor. If age of student is not in between 15 and 21 then generate user 
 * defined exception "AgeNotWithinRangeException". If name contains numbers or special symbolsraise exception
 *  "NameNotValidException". Define the two exception classes.
 */

//Custom exception for age validation
class AgeNotWithinRangeException extends Exception 
{
	
	public AgeNotWithinRangeException(String message) 
	{
     super(message);
     
 
	}
}

class NameNotValidException extends Exception
{
	
    public NameNotValidException(String message) 
    {
    	
     super(message);
    }
}

//Student class
class Student
{
     private int rollNo;
     private String name;
     private int age;
     private String course;

 // Parameterized constructor
 public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
    
	 this.rollNo = rollNo;
     setName(name);
     setAge(age);
     this.course = course;
 }

 // Set name with validation
 public void setName(String name) throws NameNotValidException {
     if (!name.matches("[a-zA-Z ]+")) { // Only letters and spaces allowed
         throw new NameNotValidException("Name contains invalid characters: " + name);
     }
     this.name = name;
 }

 // Set age with validation
 public void setAge(int age) throws AgeNotWithinRangeException {
     if (age < 15 || age > 21) {
         throw new AgeNotWithinRangeException("Age not within range (15-21): " + age);
     }
     this.age = age;
 }

 // Method to display student details
 public void displayStudentInfo() {
     System.out.println("Roll No: " + rollNo);
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
     System.out.println("Course: " + course);
 }
}

public class O_008  {
 public static void main(String[] args) {
     try {
         Student student1 = new Student(1, "John Doe", 20, "Computer Science");
         student1.displayStudentInfo();
         System.out.println();

         Student student2 = new Student(2, "Jane Smith", 22, "Mathematics");
         student2.displayStudentInfo();
     } catch (AgeNotWithinRangeException | NameNotValidException e) {
         System.out.println("Exception: " + e.getMessage());
     }

     try {
         Student student3 = new Student(3, "Invalid123", 19, "Physics");
         student3.displayStudentInfo();
     } catch (AgeNotWithinRangeException | NameNotValidException e) {
         System.out.println("Exception: " + e.getMessage());
     }
 }
}

	   
	   