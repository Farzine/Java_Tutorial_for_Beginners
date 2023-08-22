package Objcet_Oriented_programing;

/*
The finally block in java is used to put important
codes such as clean up code e.g. closing the file or
closing the connection. The finally block executes
whether exception rise or not and whether exception
handled or not. A finally contains all the crucial
statements regardless of the exception occurs or not.
if the program throws an exception but not handled by
catch so finally block execute after the try block and
after the execution of finally block program terminate
abnormally, But finally block execute fine.
 */
public class finally_block {
    public static void main(String[] args) {
        try{
            int a = 5;
            int b = 0;
            int c = a/b;
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("This ios end of the program"); // execute at any cost
        }
    }

}
