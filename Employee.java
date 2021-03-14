package homework.home4;

public class Employee {
    private static final int Home=2021 ;

    private String surname;
    private String name;
    private String secondName;
    private String phone;
    private float salary;
    private String position;
    private int age;


    Employee(String surname, String name ,String secondName, String phone, String position,float salary, int age){
        this.age=age;
        this.name=name;
        this.surname=surname;
        this.secondName=secondName;
        this.position=position;
        this.salary=salary;
        this.phone=phone;
    }

    String getSurname(){ return surname;}
    String getName(){return  name;}
    String getSecondName(){return secondName;}
    String getPhone(){return phone;}
    String getPosition(){return position;}
    int getAge(){return age;}

String getFullInfo(){
        return this.surname+" "+ this.name+ " "+this.secondName+ " "+ this.position+ " "+ this.age + " years old, "+ this.phone+ " Phone number: "+ this.salary + "RU";
}
}
