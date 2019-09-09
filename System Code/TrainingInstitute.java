import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class TrainingInstitute implements ActionListener
{
    
    ArrayList <Course>ar=new ArrayList<Course>();
    
    JFrame Frame;
    
    JSeparator Seperate;
    
    JLabel lblprofessional,
    lblpcoursename,
    lblpinstructorsname,
    lblpcourseduration,
    lblpcoursefee,
    lblpdailyhour,
    lblpdownpayment, 
    lblpcoursenumber, 
    lblpstudentname,
    lblpenrolldate,
    lblproomnumber;
    
    JSeparator S;
    JLabel 
    lblcertification,
    lblccoursename,
    lblccoursenumber,
    lblccourseduration,
    lblccoursefee,
    lblcdailyhour,
    lblcInstructorsname,
    lblcStudentsname, 
    lblcexamcentre,
    lblcexamdate,
    lblcstartdate,
    lblcawardedby,
    lblcvalidduration;
    
    JTextField txtpcoursename,
    txtpInstructorsname,
    txtpcourseduration,
    txtpcoursefee,
    txtpdailyhour,
    txtpdownpayment,
    txtpcoursenumber,
    txtpstudentname,
    txtpenrolldate,
    txtproomnumber;
    
    JTextField txtccoursename,
    txtccoursenumber,
    txtccourseduration,
    txtccoursefee,
    txtcdailyhour,
    txtcInstructorsname,
    txtcStudentsname,
    txtcexamcentre,
    txtcexamdate,
    txtcstartdate,
    txtcawardedby,
    txtcvalidduration;
    
    JButton btnpadd,
    btncadd,
    btnpenroll,
    btncenroll,
    btncomplete,
    btndisplay,
    btnclear;
    
    public void setItems()
    {
        Frame = new JFrame("Training Institute");
        
        lblprofessional=new JLabel("Professional Course");
        lblprofessional.setBounds(10,10,200,20);
        Frame.add(lblprofessional);
        
        Seperate =new JSeparator();
        Seperate.setBounds(10,30,600,20);
        Frame.add(Seperate);
        
        lblpcoursename=new JLabel("Description:");
        lblpcoursename.setBounds(10,60,100,20);
        Frame.add(lblpcoursename);
        
        txtpcoursename=new JTextField();
        txtpcoursename.setBounds(120,60,500,20);
        Frame.add(txtpcoursename);
        
        lblpinstructorsname=new JLabel("Instructor:");
        lblpinstructorsname.setBounds(10,85,100,20);
        Frame.add(lblpinstructorsname);
        
        txtpInstructorsname=new JTextField();
        txtpInstructorsname.setBounds(120,85,500,20);
        Frame.add(txtpInstructorsname);
        
        lblpcourseduration=new JLabel("Course Duration:");
        lblpcourseduration.setBounds(10,110,100,20);
        Frame.add(lblpcourseduration);
        
        txtpcourseduration=new JTextField();
        txtpcourseduration.setBounds(120,110,170,20);
        Frame.add(txtpcourseduration);
        
        lblpcoursefee=new JLabel("Course Fee:");
        lblpcoursefee.setBounds(10,135,100,20);
        Frame.add(lblpcoursefee);
        
        txtpcoursefee=new JTextField();
        txtpcoursefee.setBounds(120,135,170,20);
        Frame.add(txtpcoursefee);
        
        lblpdailyhour=new JLabel("Daily Hour:");
        lblpdailyhour.setBounds(350,110,100,20);
        Frame.add(lblpdailyhour);
        
        txtpdailyhour=new JTextField();
        txtpdailyhour.setBounds(450,110,170,20);
        Frame.add(txtpdailyhour);
        
        btnpadd=new JButton("Add");
        btnpadd.setBounds(549,135,70,20);
        Frame.add(btnpadd);
        btnpadd.addActionListener(this);
        
        
        
        lblpcoursenumber=new JLabel("Course Number:");
        lblpcoursenumber.setBounds(10,180,100,20);
        Frame.add(lblpcoursenumber);
        
        txtpcoursenumber=new JTextField();
        txtpcoursenumber.setBounds(120,180,500,20);
        Frame.add(txtpcoursenumber);
        
        lblpstudentname=new JLabel("Student Name:");
        lblpstudentname.setBounds(10,205,100,20);
        Frame.add(lblpstudentname);
        
        txtpstudentname=new JTextField();
        txtpstudentname.setBounds(120,205,500,20);
        Frame.add(txtpstudentname);
        
        lblpenrolldate=new JLabel("Enroll Date:");
        lblpenrolldate.setBounds(10,230,100,20);
        Frame.add(lblpenrolldate);
        
        txtpenrolldate=new JTextField();
        txtpenrolldate.setBounds(120,230,170,20);
        Frame.add(txtpenrolldate);
        
        
        lblproomnumber=new JLabel("Room No:");
        lblproomnumber.setBounds(350,230,130,20);
        Frame.add(lblproomnumber);
        
        
        txtproomnumber=new JTextField();
        txtproomnumber.setBounds(450,230,170,20);
        Frame.add(txtproomnumber);
        
        lblpdownpayment=new JLabel("Down Payment:");
        lblpdownpayment.setBounds(10,255,100,20);
        Frame.add(lblpdownpayment);
        
        txtpdownpayment=new JTextField();
        txtpdownpayment.setBounds(120,255,170,20);
        Frame.add(txtpdownpayment);
        
        btncomplete=new JButton("Complete");
        btncomplete.setBounds(350,255,100,20);
        Frame.add(btncomplete);
        btncomplete.addActionListener(this);
        
        btnpenroll=new JButton("Enroll");
        btnpenroll.setBounds(519,255,100,20);
        Frame.add(btnpenroll);
        btnpenroll.addActionListener(this);
        
        
        lblcertification=new JLabel("Certification Course");
        lblcertification.setBounds(10,310,200,20);
        Frame.add(lblcertification);
        
        
        S=new JSeparator();
        S.setBounds(10,330,600,20);
        Frame.add(S);
        
        lblccoursename=new JLabel("Description:");
        lblccoursename.setBounds(10,360,100,20);
        Frame.add(lblccoursename);
        
        txtccoursename=new JTextField();
        txtccoursename.setBounds(120,360,500,20);
        Frame.add(txtccoursename);
        
        lblcInstructorsname=new JLabel("Instructor:");
        lblcInstructorsname.setBounds(10,385,100,20);
        Frame.add(lblcInstructorsname);
        
        txtcInstructorsname=new JTextField();
        txtcInstructorsname.setBounds(120,385,500,20);
        Frame.add(txtcInstructorsname);
        
        lblccourseduration=new JLabel("Course Duration:");
        lblccourseduration.setBounds(10,410,100,20);
        Frame.add(lblccourseduration);
        
        txtccourseduration=new JTextField();
        txtccourseduration.setBounds(120,410,170,20);
        Frame.add(txtccourseduration);
        
        lblccoursefee=new JLabel("Course Fee:");
        lblccoursefee.setBounds(10,435,170,20);
        Frame.add(lblccoursefee);
        
        txtccoursefee=new JTextField();
        txtccoursefee.setBounds(120,435,170,20);
        Frame.add(txtccoursefee);
        
        lblcawardedby=new JLabel ("Awarded By:");
        lblcawardedby.setBounds(10,460,170,20);
        Frame.add(lblcawardedby);
        
        txtcawardedby=new JTextField();
        txtcawardedby.setBounds(120,460,170,20);
        Frame.add(txtcawardedby);
        
         
        lblcdailyhour=new JLabel("Daily Hour:");
        lblcdailyhour.setBounds(350,460,170,20);
        Frame.add(lblcdailyhour);
        
        txtcdailyhour=new JTextField();
        txtcdailyhour.setBounds(450,460,170,20);
        Frame.add(txtcdailyhour);
        
        
        lblcvalidduration=new JLabel("Valid Duration:");
        lblcvalidduration.setBounds(350,435,170,20);
        Frame.add(lblcvalidduration);
        
        txtcvalidduration=new JTextField();
        txtcvalidduration.setBounds(450,435,170,20);
        Frame.add(txtcvalidduration);
        
         

        
        btncadd=new JButton("Add");
        btncadd.setBounds(549,485,70,20);
        Frame.add(btncadd);
        btncadd.addActionListener(this);
        
        
        
        lblccoursenumber=new JLabel("Course No:");
        lblccoursenumber.setBounds(10,550,100,20);
        Frame.add(lblccoursenumber);
        
        txtccoursenumber=new JTextField();
        txtccoursenumber.setBounds(120,550,500,20);
        Frame.add(txtccoursenumber);
        
        
        lblcStudentsname=new JLabel("Student name:");
        lblcStudentsname.setBounds(10,575,100,20);
        Frame.add(lblcStudentsname);
        
        txtcStudentsname=new JTextField();
        txtcStudentsname.setBounds(120,575,500,20);
        Frame.add(txtcStudentsname);
        
          
        lblcexamcentre=new JLabel("Exam Centre");
        lblcexamcentre.setBounds(10,600,100,20);
        Frame.add(lblcexamcentre);
        
        txtcexamcentre=new JTextField();
        txtcexamcentre.setBounds(120,600,500,20);
        Frame.add(txtcexamcentre);
        
        lblcstartdate=new JLabel("Start Date:");
        lblcstartdate.setBounds(10,625,170,20);
        Frame.add(lblcstartdate);
        
        txtcstartdate=new JTextField ();
        txtcstartdate.setBounds(120,625,170,20);
        Frame.add(txtcstartdate);
        
        
        
        lblcexamdate=new JLabel("Exam Date:");
        lblcexamdate.setBounds(350,625,170,20);
        Frame.add(lblcexamdate);
        
        txtcexamdate=new JTextField ();
        txtcexamdate.setBounds(450,625,170,20);
        Frame.add(txtcexamdate);
        
        
        btnclear=new JButton("Clear");
        btnclear.setBounds(150,660,100,20);
        Frame.add(btnclear);
        btnclear.addActionListener(this);
        
        btncenroll=new JButton("Enroll Student");
        btncenroll.setBounds(310,660,150,20);
        Frame.add(btncenroll);
        btncenroll.addActionListener(this);
        
        btndisplay=new JButton("Display");
        btndisplay.setBounds(520,660,100,20);
        Frame.add(btndisplay);
        btndisplay.addActionListener(this);
         
        Frame.setLayout(null);
        Frame.setSize(1000,1000);
        Frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent eve)
    {
        if(eve.getSource()==btnclear)
        {
            txtpcoursename.setText("");
            txtpInstructorsname.setText("");
            txtpcourseduration.setText("");
            txtpcoursefee.setText("");
            txtpdailyhour.setText("");
            txtpdownpayment.setText("");
            txtpcoursenumber.setText("");
            txtpstudentname.setText("");
            txtpenrolldate.setText("");
            txtproomnumber.setText("");
            txtccoursename.setText("");
            txtccoursenumber.setText("");
            txtccourseduration.setText("");
            txtccoursefee.setText("");
            txtcdailyhour.setText("");
            txtcInstructorsname.setText("");
            txtcStudentsname.setText("");
            txtcexamcentre.setText("");
            txtcexamdate.setText("");
            txtcstartdate.setText("");
            txtcawardedby.setText("");
            txtcvalidduration.setText("");
        }
        else if(eve.getSource()==btnpadd)
        {
            try
            {
                if(txtpcoursename.getText().equals("")||txtpInstructorsname.getText().equals("")||txtpcourseduration.getText().equals("")||txtpcoursefee.getText().equals("")||txtpdailyhour.getText().equals(""))
                {
                  JOptionPane.showMessageDialog(Frame,"Fill the Empty Boxes");  
                    
               }
               else
               {
                   String CourseName=txtpcoursename.getText();
                   String InstructorsName=txtpInstructorsname.getText();
                   int Coursefee=Integer.parseInt(txtpcoursefee.getText());
                   int TotalHours=Integer.parseInt(txtpcourseduration.getText());
                   int dailyHour=Integer.parseInt(txtpdailyhour.getText());
                   Professional pr=new Professional(CourseName,InstructorsName,Coursefee,TotalHours,dailyHour);
                   ar.add(pr);
                   JOptionPane.showMessageDialog(Frame,"The addition is successfull");
                }
            }        
            catch(NumberFormatException jp)
            {
                JOptionPane.showMessageDialog(Frame,"Input Invalid");
            }
            catch(NullPointerException jp)
            {
                JOptionPane.showMessageDialog(Frame,"Null Pointer Error");
            }
            catch(Exception jp)
            {
                JOptionPane.showMessageDialog(Frame,"Error");
            }
        }
        else if(eve.getSource()==btnpenroll)
        {
            try
            {
                if(txtpstudentname.getText().equals("")||txtpenrolldate.getText().equals("")||txtproomnumber.getText().equals("")||txtpcoursenumber.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(Frame,"The Field Is Empty");
                }
                else
                {
                  int coursenumber=Integer.parseInt(txtpcoursenumber.getText());
                  String StudentsName=txtpstudentname.getText();
                  String enrollDate=txtpenrolldate.getText();
                  String roomNo=txtproomnumber.getText();
                  int downPayment=Integer.parseInt(txtpdownpayment.getText());
                  if(ar.size()>coursenumber && coursenumber>=0)
                  {
                      Course a=ar.get(coursenumber);
                      if(a instanceof Professional)
                      {
                          Professional p=(Professional)a;
                          p.studentEnroll(StudentsName,enrollDate,downPayment,roomNo);
                          JOptionPane.showMessageDialog(Frame,"Successfully enrolled");
                      }
                  }
                  else{
                      JOptionPane.showMessageDialog(Frame,"Course is not available");
                    }
                }
            }
            catch(NumberFormatException jp)
            {
                JOptionPane.showMessageDialog(Frame,"Input Invalid");
            }
            catch(NullPointerException jp)
            {
                JOptionPane.showMessageDialog(Frame,"Null Pointer Error");
            }
            catch(Exception jp)
            {
                JOptionPane.showMessageDialog(Frame,"Error","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        else if(eve.getSource()==btncenroll)
        {
            try
            {
                if(txtcStudentsname.getText().equals("")||txtcstartdate.getText().equals("")||txtcexamdate.getText().equals("")||txtccoursenumber.getText().equals("")||txtcexamcentre.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(Frame,"The Field Is Empty");
                }
                else
                {
                  int coursenumber=Integer.parseInt(txtccoursenumber.getText());
                  String StudentsName=txtcStudentsname.getText();
                  String startDate=txtcstartdate.getText();
                  String examDate=txtcexamdate.getText();
                  String examCenter=txtcexamcentre.getText();
                  if(ar.size()>coursenumber && coursenumber>=0)
                  {
                      Course b=ar.get(coursenumber);
                      if(b instanceof Certification)
                      {
                          Certification c=(Certification) b;
                          c.enrolling(StudentsName,startDate,examDate,examCenter);
                          JOptionPane.showMessageDialog(Frame,"Successfully enrolled");
                      }
                  }
                  else{
                      JOptionPane.showMessageDialog(Frame,"Course is not available");
                    }
                }
            }
            catch(NumberFormatException jp)
            {
                JOptionPane.showMessageDialog(Frame,"Input Invalid");
            }
            catch(NullPointerException jp)
            {
                JOptionPane.showMessageDialog(Frame,"Null Pointer Error");
            }
            catch(Exception jp)
            {
                JOptionPane.showMessageDialog(Frame,"Error");
            }
        }
        else if(eve.getSource()==btncadd)
        {
            try
            {
               if(txtccoursename.getText().equals("")||txtcInstructorsname.getText().equals("")||txtccourseduration.getText().equals("")||txtccoursefee.getText().equals("")||txtcawardedby.getText().equals("")||txtccourseduration.getText().equals("")||txtcvalidduration.getText().equals(""))
                {
                  JOptionPane.showMessageDialog(Frame,"Fill the Empty Boxes");  
                    
               }
               else
               {
                   String CourseName=txtccoursename.getText();
                   String InstructorsName=txtcInstructorsname.getText();
                   int courseFee=Integer.parseInt(txtccoursefee.getText());
                   int TotalHours=Integer.parseInt(txtccourseduration.getText());
                   String certificateAwardedBy=txtcawardedby.getText();
                   String validTill=txtcvalidduration.getText();
                   int dailyHour=Integer.parseInt(txtcdailyhour.getText());
                   Certification cr=new Certification(CourseName,InstructorsName,TotalHours,courseFee,certificateAwardedBy,validTill);
                   ar.add(cr);
                   JOptionPane.showMessageDialog(Frame,"The addition is successfull");
                }
            }        
            catch(NumberFormatException jp)
            {
                JOptionPane.showMessageDialog(Frame,"Input Invalid");
            }
            catch(NullPointerException jp)
            {
                JOptionPane.showMessageDialog(Frame,"Null Pointer Error");
            }
            catch(Exception jp)
            {
                JOptionPane.showMessageDialog(Frame,"Error");
            }
        }
        else if(eve.getSource()==btndisplay)
        {
            for(Course pList:ar)
            {
                if(pList instanceof Professional)
                {
                    Professional pCast=(Professional) pList;
                    pCast.display();
                }
            }
            for(Course cList:ar)
            {
                if(cList instanceof Certification)
                {
                    Certification cCast=(Certification) cList;
                    cCast.display();
                }
            }
        }
        else if(eve.getSource()==btncomplete)
        {
            try
            {
                int coursenumber=Integer.parseInt(txtpcoursenumber.getText());
                if(coursenumber>=0||coursenumber<ar.size())
                {
                    Course com=ar.get(coursenumber);
                    {
                        if(com instanceof Professional)
                        {
                            Professional cpro=(Professional) com;
                            cpro.completion();
                            JOptionPane.showMessageDialog(Frame,"Completed");
                        }
                    }
                }       
            }
            catch(NumberFormatException jp)
            {
                JOptionPane.showMessageDialog(Frame,"Input Invalid");
            }
            catch(NullPointerException jp)
            {
                JOptionPane.showMessageDialog(Frame,"Null Pointer Error");
            }
            catch(Exception jp)
            {
                JOptionPane.showMessageDialog(Frame,"Error");
            }
        }
    }
    public static void main(String[]args)
    {
       new TrainingInstitute().setItems();
    }
}  
