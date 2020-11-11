public class CEO extends Employee{
    private boolean hasCompanyCar;

    public CEO() {
    }
    public CEO(String name, int age, double salary){
        super(name, age, salary);
    }
    public boolean isHasCompanyCar() {
        return hasCompanyCar;
    }
    public void setHasCompanyCar(boolean hasCompanyCar) {
        this.hasCompanyCar = hasCompanyCar;
    }
    public void goPublic(){
       // super.Work();
        System.out.print("CEO everyday work" + " Work IPO");
    }
}
