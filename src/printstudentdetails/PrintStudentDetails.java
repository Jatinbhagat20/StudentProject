/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package printstudentdetails;

/**
 *store and print student details
 * view class = user interaction
 * @author jatin
 */
public class PrintStudentDetails {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // store and  students 3 details
        Student[] list = new Student[3];
        Student s1=new Student();//object created
        Student s2=new Student();
        Student s3=new Student();
        s1.setName("John");
        s1.setSid(25);
        
        s2.setName("Rahul");
        s2.setSid(45);
        
        s3.setName("Kartik");
        s3.setSid(34);
        //store object in a array 
        list[0]=s1;
         list[1]=s2;
          list[2]=s3;
        int i;
          
          for(i=0;i<3;i++)
          {
          System.out.println(list[i].getName() + " " + list[i].getSid());
          }
    }
    
}
