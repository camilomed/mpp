package labPatterLvl2lab2;

import java.io.*;                 // for I/O
import java.lang.Integer;  
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


/**
 * This is a skeleton class that you can use for guidance in starting the lab.
 *
 * You should update any comments,
 * variable names, etc to follow the class coding conventions.
 */

public class DepartmentApplication
   {
   public static void main(String[] args) throws IOException
      {
      Department dept = new Department("ComputerScience");
      
      //  The following commented out code will help you 
      //  create the objects that you need.


      //  CHANGE the code below so that instead of addFaculty, 
      //  addStudent, and  addStaff, we have ONLY ONE method, 
      //  addPerson (this replaces the other three methods).

      
      
		// Create faculty objects
		Person frankMoore = new Faculty("Frank Moore","472-5921",43,10000);	
		Person samHoward = new Faculty("Sam Howard","472-7222",55,9500);
		Person johnDoodle = new Faculty("John Doodle","472-6190",39,8600);

		dept.addPerson (frankMoore);
		dept.addPerson(samHoward);
		dept.addPerson(johnDoodle);


		// Create student objects
		Person johnDoe = new Student("John Doe","472-1121",22,4.0);
		Person maryJones = new Student("Mary Jones","472-7322",32,3.80);
		Person leeJohnson = new Student("Lee Johnson","472-6009",19,3.65);

		dept.addPerson (johnDoe);
		dept.addPerson(maryJones);
		dept.addPerson(leeJohnson);
		

		// Create staff objects
		Person frankGore = new Staff("Frank Gore","472-3321",33,4050);
		Person adamDavis = new Staff("Adam Davis","472-7552",50,5500);
		Person davidHeck = new Staff("David Heck","472-8890",29,3600);
		dept.addPerson (frankGore);
		dept.addPerson(adamDavis);
		dept.addPerson(davidHeck);
		
		Person james = new StaffStudents("James","472-3321",33,3.5, 4000);
		Person andres = new StaffStudents("andres","472-3321",23,4.5, 3000);
		dept.addPerson(james);
		dept.addPerson(andres);

		// Create course objects

/* The below is giving a faculty reference as the last argument.  This is a Mistake since it is one directional.  The  ‘1’  next to the Faculty class in the class diagram is Not implemented in the Course class.  It is there only to show us that a course is taught by only one faculty.
However, this mistake below does show us How we could implement the code IF it was two-directional!  */
	
		Course cs201 = new Course("cs201","programming",4, johnDoodle);
		Course cs360 = new Course("cs360","database",3, samHoward);
		Course cs404 = new Course("cs404","compiler",4, johnDoodle);
		Course cs240 = new Course("cs240","datastructure",2, johnDoodle);
		Course cs301 = new Course("cs301","Software engg",3, samHoward);
		Course cs450 = new Course("cs450","Advanced architecture",5,frankMoore);
		
		  ((Faculty) johnDoodle).addCourse(cs201);
		  ((Faculty) samHoward).addCourse(cs360);
		  ((Faculty) johnDoodle).addCourse(cs404);
		  ((Faculty) johnDoodle).addCourse(cs240);
		  ((Faculty) samHoward).addCourse(cs301);
		  ((Faculty) frankMoore).addCourse(cs450);
		  
		  
		 ((Student) johnDoe).addCourse(cs450);
		 ((Student) johnDoe).addCourse(cs201);
		 ((Student) maryJones).addCourse(cs450);
//		 ((Student) leeJohnson).addCourse(cs450);
		 ((Student) leeJohnson).addCourse(cs240);
		/*
		 * 
		 * The above course objects will go inside either
		 * a faculty object, or a student object.  Not all of the course
		 *  objects go into the same object.
		 * 
		 *  You would have code that looks something like :
		 * 
		 *  The addCourse method would have to be written in
		 *  the faculty class.  Something similar would be done 
		 *  for students.
		 */
      
      /********************************************************/
      
      
      double totsalary = 0;

      while(true)
         {
         putText("Enter first letter of ");
         putText("getTotalSalary, showAllMembers, unitsPerFaculty,filter Students list by Faculty f,  printByType p or quit : ");
         int choice = getChar();
         switch(choice)
            {
            case 'g':
               totsalary=dept.getTotalSalary();
               putText("Total sum of all salaries is:");
               putText(String.valueOf(totsalary)+"\n");              
               break;
            case 's':
               dept.showAllMembers();
               break;
            case 'u':
               dept.unitsPerFaculty();
               break;
            case 'f':
            	putText("Enter first letter of ");
                String facultyName = getString();
              Person faculty = dept.SearchByName(facultyName);
              
//            	ListEstudentsFilterByFaculty(facultyName);
            	break;
            case 'p':
            	
            	dept.printByType();
            	break;
            case 'q': return;
            default:
               putText("Invalid entry\n");
            }  // end switch
         }  // end while
      }  // end main()
// -------------------------------------------------------------
   
   

	public static void ListEstudentsFilterByFaculty(String facultyName) {
		
		
		// TODO Auto-generated method stub
		
	}
   public static void putText(String s) //writes string s to the screen
      {
      System.out.println(s);
      }
// -------------------------------------------------------------
   public static String getString() throws IOException  //reads a string from the keyboard input
      {
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);
      String s = br.readLine();
      return s;
      }
// -------------------------------------------------------------
   public static char getChar() throws IOException //reads a character from the keyboard input
      {
      String s = getString();
      return s.charAt(0);
      }

//-------------------------------------------------------------
   public static int getInt() throws IOException // reads an integers from the keyboard input
      {
      String s = getString();
      return Integer.parseInt(s);
      }
// -------------------------------------------------------------
   }  // end class 

