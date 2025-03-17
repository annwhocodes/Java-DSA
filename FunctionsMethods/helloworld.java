package FunctionsMethods;
public class helloworld {
    public static int  PrintHelloWorld(){
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        return 3; // use a return statement when making an int function. It should return the number of times we should return a value.
    }
    public static void main(String args[]){
        PrintHelloWorld(); //Prints hello world 3 times irrespective of the number of function calls
    }
}
