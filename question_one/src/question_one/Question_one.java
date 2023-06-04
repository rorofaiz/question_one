
package question_one;


public abstract class Question_one {
    
    //تعريف المتغيرات
    protected String name;
    protected String position;
    protected double basicSalary;
    protected int experience;
    protected String educationalLevel;
    
    public Question_one(String name, String position, double basicSalary, int experience, String educationalLevel) {
        this.name = name;
        this.position = position;
        this.basicSalary = basicSalary;
        this.experience = experience;
        this.educationalLevel = educationalLevel;
    }
    
    //تعريف function
    public abstract double calculateSalary();
    public abstract double calculateBonus();
    
    //main
    public static void main(String[] args) {
        // TODO code application logic here
    }
   
    //class FullTimeEmployee
    public class FullTimeEmployee extends Question_one {
    public FullTimeEmployee(String name, String position, double basicSalary, int experience, String educationalLevel) {
        super(name, position, basicSalary, experience, educationalLevel);
    }
    //احتسابSalary FullTimeEmployee
    @Override
    public double calculateSalary() {
        double salary = basicSalary + (basicSalary * 0.05 * experience);
        if (educationalLevel.equalsIgnoreCase("Bachelor Degree")) {
            salary += 500;
        } else if (educationalLevel.equalsIgnoreCase("Diploma")) {
            salary += 250;
        }
        return salary;
    }
    //احتساب المكافئة(FullTimeEmployee)
    @Override
    public double calculateBonus() {
        return basicSalary * 0.03;
    }
}//end class FullTimeEmployee 
    
    
    //class PartTimeEmployee
    public class PartTimeEmployee extends Question_one {
    public PartTimeEmployee(String name, String position, double basicSalary, int experience, String educationalLevel) {
        super(name, position, basicSalary, experience, educationalLevel);
    }
    //احتسابSalary PartTimeEmployee
    @Override
    public double calculateSalary() {
        double salary = basicSalary + (basicSalary * 0.05 * experience);
        if (educationalLevel.equalsIgnoreCase("Bachelor Degree")) {
            salary += 500;
        } else if (educationalLevel.equalsIgnoreCase("Diploma")) {
            salary += 250;
        }
        return salary;
    }
    //احتساب المكافئة(PartTimeEmployee)
    @Override
    public double calculateBonus() {
        return basicSalary * 0.015;
    }
}//end class PartTimeEmployee
    
}//end class Question_one
    




