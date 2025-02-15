package CustomExceptionHandler;

public class TestException {
    public static void main(String args[]){
        TestException testException = new TestException();
        System.out.println(testException.method1());
    }

    private int method1(){
        try{
            method2();
            return 3;
        }
        catch (MyCustomExceptionHandler myCustomExceptionHandler){

        }
        catch (Exception exceptionHandler){
            System.out.println(exceptionHandler.getMessage());
        }
        finally {
          System.out.println("213213");
        }
        return 2;
    }


    private void method2() throws MyCustomExceptionHandler {
        throw new MyCustomExceptionHandler("THERE WAS SOME ISSUE");
    }
}
