public class Main {
    public static void main(String[] args){
        Employee Maik = new Employee(" Имя: - Maik", 20, 10000);
        Maik.Work();

        System.out.println(Maik.getName());
        System.out.println(" ЗАРПЛАТА: " + Maik.getSalary());
        System.out.println(" ВОЗРАСТ: " + Maik.getAge());


        Specialist Carl = new Specialist(" Имя: - Carl", 28, 25000);
        Carl.setLevels(10);
        Carl.workWithClients();

        System.out.println(Carl.getName());
        System.out.println(" РАНГ СПЕЦИАЛИСТА: " + Carl.getLevels());
        System.out.println(" ЗАРПЛАТА: " + Carl.getSalary());
        System.out.println(" ВОЗРАСТ: " + Carl.getAge());

        Specialist Shown = new Specialist(" Имя: - Shown", 29, 25000);
        Shown.setLevels(10);
        Shown.workWithClients();

        System.out.println(Shown.getName());
        System.out.println(" РАНГ СПЕЦИАЛИСТА: " + Shown.getLevels());
        System.out.println(" ЗАРПЛАТА: " + Shown.getSalary());
        System.out.println(" ВОЗРАСТ: " + Shown.getAge());

        Specialist Kane = new Specialist(" Имя: - Kane", 27, 25000);
        Kane.setLevels(10);
        Kane.workWithClients();

        System.out.println(Kane.getName());
        System.out.println(" РАНГ СПЕЦИАЛИСТА: " + Kane.getLevels());
        System.out.println(" ЗАРПЛАТА: " + Kane.getSalary());
        System.out.println(" ВОЗРАСТ: " + Kane.getAge());


        Developer Casa = new Developer(" Имя: - Casa", 23, 30000);
        Casa.setGrades(" Middle ");
        Casa.writeCode();


        System.out.println(Casa.getName());
        System.out.println(" РАНГ РАЗРАБОТЧИКА: " + Casa.getGrades());
        System.out.println(" ЗАРПЛАТА: " + Casa.getSalary());
        System.out.println(" ВОЗРАСТ: " + Casa.getAge());

        Developer John = new Developer(" Имя: - John", 29, 80000);
        John.setGrades("High");
        John.writeCode();

        System.out.println(John.getName());
        System.out.println(" РАНГ РАЗРАБОТЧИКА: " + John.getGrades());
        System.out.println(" ЗАРПЛАТА: " + John.getSalary());
        System.out.println(" ВОЗРАСТ: " + John.getAge());

        Developer Margaret = new Developer(" Имя: - Margaret", 23, 30000);
        Margaret.setGrades(" Middle ");
        Margaret.writeCode();

        System.out.println(Margaret.getName());
        System.out.println(" РАНГ РАЗРАБОТЧИКА: " + Margaret.getGrades());
        System.out.println(" ЗАРПЛАТА: " + Margaret.getSalary());
        System.out.println(" ВОЗРАСТ: " + Margaret.getAge());

        Developer Maddison = new Developer(" Имя: - Maddison ", 24, 30000);
        Maddison.setGrades(" Middle ");
        Maddison.writeCode();

        System.out.println(Maddison.getName());
        System.out.println(" РАНГ РАЗРАБОТЧИКА: " + Maddison.getGrades());
        System.out.println(" ЗАРПЛАТА: " + Maddison.getSalary());
        System.out.println(" ВОЗРАСТ: " + Maddison.getAge());

        Manager Mark = new Manager(" Имя: - Mark", 32, 45000);
        Mark.setHasStocks(true);
        Mark.writeProcedures();

        System.out.println(Mark.getName());
        System.out.println(" ЗАРПЛАТА МЕНЕДЖЕРА: " + Mark.getSalary());
        System.out.println(" ВОЗРАСТ: " + Mark.getAge());
        System.out.println(" АКЦИИ ТЕСЛА : " + Mark.isHasStocks());

        Manager Katcher = new Manager(" Имя: - Katcher", 30, 25000);
        Mark.setHasStocks(true);
        Katcher.writeProcedures();

        System.out.println(Katcher.getName());
        System.out.println(" ЗАРПЛАТА МЕНЕДЖЕРА: " + Katcher.getSalary());
        System.out.println(" ВОЗРАСТ: " + Katcher.getAge());
        System.out.println(" АКЦИИ ТЕСЛА : " + Mark.isHasStocks());

        CEO ceo1 = new CEO(" Имя: - Bruce", 35, 30000);
        ceo1.setHasCompanyCar(true);
        ceo1.goPublic();

        System.out.println(" КОМПАНИЯ БМВ : " + ceo1.isHasCompanyCar());
        System.out.println(ceo1.getName());
        System.out.println(" ЗАРПЛАТА ДИРЕКТОРА: " + ceo1.getSalary());
        System.out.println(" ВОЗРАСТ: " + ceo1.getAge());

    }
}

