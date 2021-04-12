package homework.home4;

public class Home4 {
    public static void main(String []args){


        Employee a= new Employee("Авдеева", "Жанна", "Сергеевна",
                "8(499) 150-87-88","Sistem Admin", 75000,35);

        System.out.println("Plese weilcom "+ a.getSurname()+ " "+ a.getSecondName()+ " "+a.getName() +" "+a.getPosition()+ ".");

        Employee[] employees= {
                a,
                new Employee("Авдеев", "Виктор" , "Владимирович",
        "8 (495) 657-94-62","Doctor",90000, 46),
        new Employee( "Миляева","Нина","Влаимировна",
                "8(495)193-75-88", "Accountant", 100000, 76),
                new Employee("Лукьянова", "Ольга", "Викторовна",
                        "8(499)657-52-03", "Administrator", 45000,25),
                new Employee("Примаков", "Виктор","Игорьевич",
                        "8(499)937-00-73", "Head", 150000,30)
        };
        System.out.println("________________________");
        for (int i=0;i<employees.length;i++)
            if (employees[i].getAge()>40){
                System.out.println(employees[i].getFullInfo());
            }else {
                System.out.println("Сотрудники старше 40 лет");
            }
    }
}
