package stuff;

public class Main {

    public static void main(String[] args) {
	    int a = 5;
	    int b = 10;
	    someShittyMethod(a, b);

	    CoolStuff coolBanana = new CoolStuff("Banana");
	    CoolStuff coolTable = new CoolStuff("Table");

	    coolBanana.doSomethingCool();
	    coolTable.doSomethingCool();

    }

    public static void someShittyMethod(int a, int b){
        System.out.println(a*b+b);
    }

    //method that takes an integer and prints 5 :)
    public static void thisIsACoolMethod(int a){
        System.out.println(5);
    }

}
