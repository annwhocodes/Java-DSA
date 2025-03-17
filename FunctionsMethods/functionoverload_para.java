package FunctionsMethods;
public class functionoverload_para {
    public static int sum (int a, int b){
        return a+b;
    }
    public static int sum (int a,int b,int c){
        return a+b+c;//Method overloading, as we have changed the number of parameters, we can also change the type of parameters but if we change the return type it will produce an error(saying duplicate method with error in compilation)
    }
    public static void main (String args[]){
        System.out.println(sum(3,4));
        System.out.println(sum(3,2,2));
    } 
}
