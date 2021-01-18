public class Main {
    public static void main(String[] args){
        Employee Maik = new Employee();
        Maik.setName(" Имя: - Maik");
        Maik.setSalary(10000);
        Maik.setAge(20);
        Maik.Work();

        System.out.println(Maik.getName());
        System.out.println(" ЗАРПЛАТА: ");
        System.out.println(Maik.getSalary());
        System.out.println(" ВОЗРАСТ: ");
        System.out.println(Maik.getAge());


        Specialist Carl = new Specialist();
        Carl.setName(" Имя: - Carl");
        Carl.setLevels(10);
        Carl.setSalary(25000);
        Carl.setAge(28);
        Carl.workWithClients();

        System.out.println(Carl.getName());
        System.out.println(" РАНГ СПЕЦИАЛИСТА: ");
        System.out.println(Carl.getLevels());
        System.out.println(" ЗАРПЛАТА: ");
        System.out.println(Carl.getSalary());
        System.out.println(" ВОЗРАСТ: ");
        System.out.println(Carl.getAge());

        Specialist Shown = new Specialist();
        Shown.setName(" Имя: - Shown");
        Shown.setLevels(10);
        Shown.setSalary(25000);
        Shown.setAge(29);
        Shown.workWithClients();

        System.out.println(Shown.getName());
        System.out.println(" РАНГ СПЕЦИАЛИСТА: ");
        System.out.println(Shown.getLevels());
        System.out.println(" ЗАРПЛАТА: ");
        System.out.println(Shown.getSalary());
        System.out.println(" ВОЗРАСТ: ");
        System.out.println(Shown.getAge());

        Specialist Kane = new Specialist();
        Kane.setName(" Имя: - Kane");
        Kane.setLevels(10);
        Kane.setSalary(25000);
        Kane.setAge(27);
        Kane.workWithClients();

        System.out.println(Kane.getName());
        System.out.println(" РАНГ СПЕЦИАЛИСТА: ");
        System.out.println(Kane.getLevels());
        System.out.println(" ЗАРПЛАТА: ");
        System.out.println(Kane.getSalary());
        System.out.println(" ВОЗРАСТ: ");
        System.out.println(Kane.getAge());


        Developer Casa = new Developer();
        Casa.setName(" Имя: - Casa");
        Casa.setGrades(" Middle ");
        Casa.setSalary(30000);
        Casa.setAge(23);
        Casa.writeCode();


        System.out.println(Casa.getName());
        System.out.println(" РАНГ РАЗРАБОТЧИКА: ");
        System.out.println(Casa.getGrades());
        System.out.println(" ЗАРПЛАТА");
        System.out.println(Casa.getSalary());
        System.out.println(" ВОЗРАСТ");
        System.out.println(Casa.getAge());

        Developer John = new Developer();
        John.setName(" - John");
        John.setGrades("High");
        John.setSalary(80000);
        John.setAge(29);
        John.writeCode();

        System.out.println(" РАНГ РАЗРАБОТЧИКА");
        System.out.println(John.getGrades());
        System.out.println(John.getName());
        System.out.println(" ЗАРПЛАТА");
        System.out.println(John.getSalary());
        System.out.println(" ВОЗРАСТ");
        System.out.println(John.getAge());

        Developer Margaret = new Developer();
        Margaret.setName(" Имя: - Margaret");
        Margaret.setGrades(" Middle ");
        Margaret.setSalary(30000);
        Margaret.setAge(23);
        Margaret.writeCode();

        System.out.println(Margaret.getName());
        System.out.println(" РАНГ РАЗРАБОТЧИКА: ");
        System.out.println(Margaret.getGrades());
        System.out.println(" ЗАРПЛАТА: ");
        System.out.println(Margaret.getSalary());
        System.out.println(" ВОЗРАСТ: ");
        System.out.println(Margaret.getAge());

        Developer Maddison = new Developer();
        Maddison.setName(" Имя: - Maddison ");
        Maddison.setGrades(" Middle ");
        Maddison.setSalary(30000);
        Maddison.setAge(24);
        Maddison.writeCode();

        System.out.println(Maddison.getName());
        System.out.println(" РАНГ РАЗРАБОТЧИКА: ");
        System.out.println(Maddison.getGrades());
        System.out.println(" ЗАРПЛАТА: ");
        System.out.println(Maddison.getSalary());
        System.out.println(" ВОЗРАСТ: ");
        System.out.println(Maddison.getAge());

        Manager Mark = new Manager();
        Mark.setName(" Имя: - Mark");
        Mark.setSalary(45000);
        Mark.setAge(32);
        Mark.setHasStocks(true);
        Mark.writeProcedures();

        System.out.println(Mark.getName());
        System.out.println(" ЗАРПЛАТА МЭНЭДЖЕРА: ");
        System.out.println(Mark.getSalary());
        System.out.println(" ВОЗРАСТ: ");
        System.out.println(Mark.getAge());
        System.out.println(Mark.getHasStocks());

        Manager Katcher = new Manager();
        Katcher.setName(" Имя: - Katcher");
        Katcher.setSalary(25000);
        Katcher.setAge(30);
        Mark.setHasStocks(true);
        Katcher.writeProcedures();

        System.out.println(Katcher.getName());
        System.out.println(" ЗАРПЛАТА МЭНЭДЖЕРА: ");
        System.out.println(Katcher.getSalary());
        System.out.println(" ВОЗРАСТ: ");
        System.out.println(Katcher.getAge());
        System.out.println(Mark.getHasStocks());

        CEO ceo1 = new CEO();
        ceo1.setHasCompanyCar(true);
        ceo1.setName(" Имя: - Bruce");
        ceo1.setSalary(30000);
        ceo1.setAge(35);
        ceo1.goPublic();

        System.out.println(ceo1.getName());
        System.out.println(" ЗАРПЛАТА ДИРЕКТОРА: ");
        System.out.println(ceo1.getSalary());
        System.out.println(" ВОЗРАСТ: ");
        System.out.println(ceo1.getAge());
        System.out.println(ceo1.isHasCompanyCar());
    }
}

