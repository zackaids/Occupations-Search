/*
* Occupation.java
* Class that contains methods to manipulate properties of an Occupation.
* This class also contains a toString method that will return a String with a
* line of information about occupation.
* last edited 6 2 23 by Zack A
*/

public class Occupation {
    private String cos;  // Standard Occupational Classification
    private String title;  // official Department of Labor title for the occupation code
    private int employed;  // number of people currently employed in the occupation
    private int salary;  // average salary for people employed in the US in this occupation

    public Occupation() {
        cos = "";
        title = "";
        employed = 0;
        salary = 0;
    }

    public Occupation(String cos, String title, int employed, int salary) {
        this.cos = cos;
        this.title = title;
        this.employed = employed;
        this.salary = salary;
    } // end Occupation(String cos, String title, int employed, int salary)

    public String getCos() {
        return cos;
    } // end getCos()

    public void setCos(String cos) { this.cos = cos; } // end setCos


    public String getTitle() {
        return title;
    } // end getTitle()

    public void setTitle(String title) {
        this.title = title;
    } // end setTitle()

    public int getEmployed() {
        return employed;
    } // end getEmployed()

    public void setEmployed(int employed) {
        this.employed = employed;
    } // end setEmployed()


    public int getSalary() {
        return salary;
    } // end getSalary()

    public void setSalary(int salary) {
        this.salary = salary;
    } // end setSalary()

    public String toString()
    {
        String info;
        info = ("The following is the information for the COS you entered: \n"+ "COS: "+cos+"\nTitle: "+title+
                "\nNumber of Employed: "+employed+"\nAnnual Salary: $"+salary);
        // info = (cos +", "+title+", "+employed+", "+salary);
        return info;
    }
} // end class Occupation

