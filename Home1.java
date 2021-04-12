package Home;

public class Home1 {

    private static float calculate(int a, int b, int c, int d){
        return a*(b + ((float)c/d));
    }
    private static float calculate(float a, float b, float c, float d){
        return a*(b+(c/d));
    }
    private static  boolean range( int one, int two){
        int sum = one+ two;
        return sum > 9 && sum<21;
    }
    private  static  boolean isPositive(int varible){
        return varible >=0;
    }
    private static String sayHello(String name){
return "Привет,"+ name + "!";
    }

    public static  void  main(String[] agre){



        int myOne =5;
        int myTwo =9;
        int myFree =10;
        int myFour =6;

        Float fOne=5f;
        Float fTwo=9f;
        Float fTree=10f;
        Float fFour=6f;

        System.out.println ("Результат задания 1: "+ calculate(myOne, myTwo, myFree, myFour));
        System.out.println("Результат задания 1/1:" + calculate( fOne , fTwo, fTree ,fFour));
        System.out.println("Резутльта задания2:"+range(1 ,15));
        System.out.println("Результат задания 3:"+((isPositive(-7)? "Положительное": "Отрицательное"+ "!")));


        if (isPositive(-7)){
            System.out.println("Положительные");
        }else  {
            System.out.println("Отрицательное");
        }
        System.out.println("Результат задания 4:"+ sayHello("Мария"));
        }

}
