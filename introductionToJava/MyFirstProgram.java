package example;

public class MyFirstProgram  {
    public static void message(String mystring, int myInt){
        System.out.println("This is my string: "+ mystring);
        System.out.println("and this is my int: "+ myInt);
    }

    public void main(String[] args){
        message("hellod world!", 4);
    }
}