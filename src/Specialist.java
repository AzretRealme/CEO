public class Specialist extends Employee{

    int levels;

    public Specialist(String name, int age, double salary) {
        super(name, age, salary);
    }

    public int getLevels() {
        return levels;
    }

    public void setLevels(int levels) {
        this.levels = levels;
    }

    public void workWithClients(){
        //super.Work();
        System.out.print("Specialist - awesome speak English. " + " -workWithClients. ---");
    }
}

