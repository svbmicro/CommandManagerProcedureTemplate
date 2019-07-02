import java.io.IOException;

public class Main {

    public static void main(String args[]) throws IOException {


      // You procedure code. If you want to use any class use full path for class. Example

    }


    protected static void printOut(String outString) {

        System.out.println(outString);
    }

    protected static void printOut(IOException outString) {

        System.out.println(outString.toString());

    }

    protected static void printErr(IOException outString) {

        System.out.println(outString.toString());

    }

    protected static void printErr(String outString) {

        System.out.println(outString.toString());

    }

    protected static ResultSet executeCapture(String str) {

        ResultSet RS = new ResultSet();

        return RS;
    }

    protected  ResultSet execute(String str) {

        ResultSet RS = new ResultSet();

        return RS;
    }


}
