package stuff;

public class Main {

    public static void main(String[] args) {
	    int a = 5;
	    int b = 10;
	    someShittyMethod(a, b);

	    CoolStuff coolBanana = new CoolStuff("Banana");

	    coolBanana.doSomethingCool();

	    BakisChecker bakfull = new BakisChecker();
	    IO io = new IO();

	    String answer = io.bakisCheck();
	    bakfull.areYouBakis(answer);
        

    }

    public static void someShittyMethod(int a, int b){
        System.out.println(a*b+b);
    }

    //method that takes an integer and prints 5 :)
    public static void thisIsACoolMethod(int a){
        System.out.println(5);
    }

}
