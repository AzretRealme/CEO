public class Developer extends Employee{

    String grades;
    public Developer(String name, int age, double salary) {
        super(name, age, salary);
    }

    public String getGrades() {
        return grades;
    }

    public void setGrades(String grades) {
        this.grades = grades;
    }

    public void writeCode(){
       // super.Work();
        System.out.print("Developers - good made games.  " + " -WriteCode.  ---");
    }
}
