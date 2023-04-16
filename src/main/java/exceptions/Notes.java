package exceptions;

public class Notes {
    /*
    *
    * Exception - an error that occurs during runtime (not compile time)
    *
    * Examples:
    * Programming errors
    * Divide by zero error, Accessing the elements of an array outside its range
    *
    * Normal programming errors
    * invalid input
    * opening a non-existent file
    *
    * System errors
    * Heap memory exhausted
    *
    *
    * A method with try-catch block is called method with exception handlers which can catch and handle exceptions
    *
    *
    *SYNTAX: TRY-CATCH METHOD WITH EXCEPTION HANDLER
    *   access returnType methodThatHadExceptionError(){
    *       try{
    *           original method
    *       } catch (ExceptionType e) {
    *           whatever you want to happen instead of exception error
    *       }
    *   }
    *
    *
    *
    * SYNTAX: TRY-CATCH METHOD WITHOUT EXCEPTION HANDLER - Default exception handler and JVM will "handle" the error message
    * access returnType methodThatHadExceptionError() throws ExceptionErrorType {
    *
    *       original method
    * }
    *
    *
    *
    * SYNTAX: TRY-FINALLY METHOD IS USED FOR CLEANING UP AFTER A TRY CATCH (BLOCK OF CODE IS ALWAYS EXECUTED)
    *       try{
    *           original method
    *       } catch (ExceptionType <ObjName> {
    *           <handler if exception occurs>
            } finally {
                <code to be executed before the try block ends>
            }
    *
    *
    *
    * Benefits of Exception Handling:
    * #1 Separation of Error-Handling code from "regular" business logic code
    *       -Cleaner code
    * #2 Whoever best suited to handle the error will handle the error
    *       -
    * #3 Grouping and differentiating errors based on their types
    *
    *
    *
    *
    * Throwing exceptions : throw Keyword is NOT THE SAME as throws.
    *   throw --> generate exceptions myself
    *         SYNTAX:  throw <exception object>;
    *           ex: throw new ArithmeticException("testing...")
    *
    *   throws --> exception is handled through call chain i.e. default exception handler using JVM
    *          Syntax: access returnType methodName() throws ExceptionErrorType {
    *                   }
    *
    *
    * Checked exceptions (CompileTime Exceptions) --> JVM/Someone is dealing with it. Must be handled with a try/catch or throws clause.
    *                                                Typically used for handling errors that happen outside the program such as file I/O errors,
    *                                                network connectivity, or database connectivity issues. You want these handled!
    *  Ex:  --> SQLException
    *       --> InvocationTargetException
    *       --> ClassNotFoundException
    *       --> FileNotFound
    *
    * Unchecked exceptions (Runtime Exceptions) --> Doesn't need to be handled or declared. Programmable compile. Typically used for handling errors that happened due
    *                                               to programming, such as null pointer or array out of bounds. You may or may not want these handled!
    *   Ex: -->NullPointerException
    *       -->ArrayIndexOutOfBound
    *       -->IllegalArgumentException
    *       -->IllegalStateException
    *       -->NumberFormatException
    *       -->ArithmeticException
    *
    * Rules of exceptions:
    *   Either a method has to "catch and handle" the exception or "pass them along the chain"
    *               --> Except for Error or RuntimeException, or their subclasses(unChecked exceptions)
    *   Pass the exceptions along the chain is specified by throws<exceptionList>
    * */
}
