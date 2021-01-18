public class Manager extends Employee{

    private boolean hasStocks = true;

    public void setHasStocks(boolean hasStocks) {
        this.hasStocks = hasStocks;
    }
    public boolean getHasStocks() {
        return hasStocks;
    }
    public Manager() {
    }
    public Manager(String name, int age, double salary){
        super(name, age, salary);
    }
    public void writeProcedures(){
        //super.Work();
        System.out.print("Managers - awesome work.  " + " -WriteProcedures.  ---");
    }
}
