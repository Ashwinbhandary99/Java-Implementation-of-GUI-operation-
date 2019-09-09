
/**
 * Write a description of class Certification here.
 * @ID-NP01CP4A170163
 * @author (Ashwin Chandra Bhandary)
 * @version (2018/01/19)
 */
public class Certification extends Course
{
    public int courseFee;
    public String startDate;
    public String examDate;
    public String examCenter;
    public String certificateAwardedBy;
    public String validTill;
    public boolean started;
    
    public Certification(String CourseName,String InstructorsName,int TotalHours,int courseFee,String certificateAwardedBy,String validTill)
    {
        super(CourseName,InstructorsName,TotalHours);
        this.courseFee=courseFee;
        this.certificateAwardedBy=certificateAwardedBy;
        this.validTill=validTill;
        startDate="";
        examDate="";
        examCenter="";
        started=false;
    }
    
    public int getcourseFee()
    {
        return courseFee;
    }
    
    public String getstartDate()
    {
        return startDate;
   }
   
   public String getexamDate()
   {
        return examDate;
   }
   
   public String getexamCenter()
   {
       return examCenter;
   }
   
   public String getcertificateAwardedBy()
   {
       return certificateAwardedBy;
   }
   
   public String validTill()
   {
       return validTill;
   }
   
   public boolean getstarted()
   {
       return started;
   }
   
   public void setcourseFee(int courseFee)
   {
       if (started==false)
       {
           this.courseFee=courseFee;
       }
       else
       {
           System.out.println("Sorry the course has already started so setting new course fee is not possible!");
       }
   }
   
   public void enrolling(String StudentsName,String startDate,String examDate,String examCenter)
   {
       this.startDate=startDate;
       this.examDate=examDate;
       this.examCenter=examCenter;
       if (started==false)
       {
           super.setStudentsName(StudentsName);
           started=true;
       }
       else
       {
           System.out.println("Sorry, the course has already started from" +startDate);
       }
   }
   
   public void display()
   {
       super.display();
       if(started==true)
       {
           System.out.println("Start Date: "+startDate);
           System.out.println("Exam Date: "+examDate);
           System.out.println("Exam Center: "+examCenter);
           System.out.println("Certificate Awarded By: "+certificateAwardedBy);
           System.out.println("Certification Validity: "+validTill);
       }
   }
}
