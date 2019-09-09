
/**
 * Write a description of class Course here.
 * @ID-NP01CP4A170163
 * @author (Ashwin Chandra Bhandary)
 *  (2018/01/19)
 */

public class Course   //Course is a class
{
    public String CourseName;  //declaring CourseName as String type
    public String InstructorsName;  //declaring InstructorsName as String type
    public int TotalHours;  //declaring TotalHours as integer type
    public String StudentsName;     //declaring StudentsName as String type
    
    public Course(String CourseName, String InstructorsName,int TotalHours)     //declaring constructor and passing parameters
    {
        this.CourseName=CourseName;
        this.InstructorsName=InstructorsName;
        this.TotalHours=TotalHours;
        StudentsName="";        //initializing students name as empty
    }
    
    public String getCourseName()   //creating method for coursename
    {
        return CourseName;
    }
    
    public String getInstructorsName()      //creating method for instructorsname
    {
        return InstructorsName;
    }
    
    public int getTotalHours()      //creating method for totalhours
    {
        return TotalHours;
    }
    
    public String getStudentsName()     //creating method for studentsname
    {
        return StudentsName;
    }
    
    public void setStudentsName(String StudentsName)        //creating new value for studentsname
    {
        this.StudentsName=(StudentsName);
    }
    
    public void display()       //Printing 
    {
        if (StudentsName=="")       //if condition if students name is empty
        {
            System.out.println("Course Name :" +CourseName);        //displays coursename
            System.out.println("Total Hours :" +TotalHours);        //displays totalhours
            System.out.println("Instructors Name :" +InstructorsName);      //displays instructorsname
        }
        
        else        //else condition if students name is given
        {
            System.out.println("Course Name :" +getCourseName());        //displays coursename
            System.out.println("Total Hours :" +getTotalHours());        //displays totalhours
            System.out.println("Instructors Name :" +getInstructorsName());      //displays instructorsname
            System.out.println("Students Name :" +getStudentsName());        //displays studentsname
        }
    }
}
