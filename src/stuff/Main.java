package stuff;

public class Main {

    public static void main(String[] args) {
	    int a = 5;
	    int b = 10;
	    someShittyMethod(a, b);

	    Pokemon pikachu = new Pokemon("Pikachu", "Lightning");
	    String status = pikachu.throwAPokeballAt("Pikachu");
        System.out.println(status);
    }

    public static void someShittyMethod(int a, int b){
        System.out.println(a*b+b);
    }

    //method that takes an integer and prints 5 :)
    public static void thisIsACoolMethod(int a){
        System.out.println(5);
    }



}
