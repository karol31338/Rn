
/**
 * This class stores information about a course
 * that enrolled students may want to complete
 *
 * @author Karolina Berdyszak
 * @version 26/10/2020
 */
public class Course
{
    // instance variables - replace the example below with your own
    private String codeNo;
    private String title;

    private Module module1;
    private Module module2;
    private Module module3;
    private Module module4;
    
    private int finalMark;
        
    private Grades finalGrade;
        
    /**
     * Constructor for objects of class Course
     */
    public Course(String codeNo, String title)
    {
        // initialise instance variables
        this.codeNo = codeNo;
        this.title = title;
        
        module1 = new Module("Programming Concepts", "CO452");
        //todo add the others
    }

    public void addMark(int mark, int moduleNo)
    {
        if(moduleNo == 1)
        {
            module1.awardMark(mark);
        }
    }
    
    /**
     * Add Module to Course
     */
    public void addModule (Module module)
    {
        this.module1 = module1;
        this.module2 = module2;
        this.module3 = module3;
        this.module4 = module4;
    }
    
    /**
     * Prints out the details of a course
     */
    public void print()
    {
        // put your code here
        System.out.println("Course " + codeNo + " - " + title);
    }
    
    public Grades convertToGrade(int mark)
    {
        if((mark >= 0) && (mark < 40))
        {
            return Grades.F;
        }
        else if((mark >= 40) && (mark < 50))
        {
            return Grades.D;
        }
        else if ((mark >= 50) && (mark < 60))
        {
            return Grades.C;
        }
        else if ((mark >= 60) && (mark < 70))
        {
            return Grades.B;
        }
        else if ((mark >= 70) && (mark <100))
        {
            return Grades.A;
        }
        
        return Grades.X;
    }
}