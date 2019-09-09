
/**
 * Write a description of class Professional here.
 * @ID-NP01CP4A170163
 * @author (Ashwin Chandra Bhandary)
 * @version (2018/01/19)
 */
public class Professional extends Course        //professional is sub class of course class
{
    public int courseFee;       //declaring coursefee as integer
    public String enrollDate;       //declaring enrollDate as String
    public String roomNo;       //declaring roomNo as String
    public int dailyHour;       //declaring dailyHour as int
    public int downPayment;     //declaring downpayment as int
    public boolean started;     //declaring started as boolean
    public boolean completed;   //declaring completed as boolean

    public Professional(String CourseName,String InstructorsName, int courseFee, int TotalHours, int dailyHour)     //declaring constructor and passing parameters
    {
        super(CourseName,InstructorsName,TotalHours);       
        this.courseFee=courseFee;
        this.dailyHour=dailyHour;
        enrollDate="";      //initializing enroll date as empty 
        roomNo="";          //initializing roomNo as empty
        downPayment=0;      //initializing downpayment as 0 
        completed=false;    //initializing completed as false
        started=false;      //initializing started as false
    }
    
    public int getcourseFee()       //creating method for courseFee
    {
        return courseFee;
    }
    
    public String getenrollDate()       //creating method for enrollDate 
    {
        return enrollDate;
    }
    
    public String getroomNo()       //creating method for roomNo
    {
        return roomNo;
    }
    
    public int getdailyHour()       //creating method for dailyHour
    {
        return dailyHour;
    }
    
    public int getdownPayment()     //creating method for downPayment
    {
        return downPayment;
    }
    
    public boolean getstarted()     //creating method for started
    {
        return started;
    }
    
    public boolean getcompleted()       //creating method for completed
    {
        return completed;
    }
    
    public void setcourseFee(int courseFee)     //creating new value for coursefee
    {
        this.courseFee=courseFee;
    }
    
    public void setdailyhour(int dailyHour)     //creating new value for dailyHour
    {
        this.dailyHour=dailyHour;
    }
    
    public void studentEnroll(String StudentsName,String enrollDate,int downPayment,String roomNo)      //creating new value for studdent enroll and passing parameters
    {
        if (started==true)
        {
            super.getInstructorsName();     //calling instructors name form parents class
            System.out.println("Sorry! The class has already started.");        //displaying message
            System.out.println("The class is being taken by " +InstructorsName);        //displaying instructors name
            System.out.println("The class is running in room no " +roomNo);     //displaying roomNo
        }
        else
        {
            super.setStudentsName(StudentsName);
            this.enrollDate=enrollDate;
            this.roomNo=roomNo;
            this.downPayment=downPayment;
            started = true;
            completed = false;
        }
    }
    
    public void completion()        //creating new value for completion of course
    {
        if (completed == true)
        {
            System.out.println("The course has already been completed.");       //displaying message
        }
        else
        {
            super.setStudentsName("");
            enrollDate="";      //initializing enroll date as empty
            downPayment=0;      //initializing downpayment as 0
            started=false;      //initializing started as false
            completed=true;     //initializing completed as true
        }
    }
    
    public void print(String CourseName,String InstructorsName,int courseFee)       //
    {
        System.out.println("Course Name: " +CourseName);
        System.out.println("Instructors Name: " +InstructorsName);
        System.out.println("Course Fee: " +courseFee);
    }
    
    public void display()
    {
        super.display();
        if (started == true)
        {
            System.out.println("Date of Enroll: " +enrollDate);
            System.out.println("Down Payment: " +downPayment);
            
        }
    }
}
