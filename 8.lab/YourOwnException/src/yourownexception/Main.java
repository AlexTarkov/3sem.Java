package yourownexception;

// : c09:FullConstructors.java
// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.

class MyException extends Exception {
    public MyException() {
    }
    
    public MyException(String msg) {
        super(msg);
    }
}

public class Main {
    
    public static void f() throws MyException {
        System.out.println("Throwing MyException from f()");
        throw new MyException();
    }
    
    public static void g() throws MyException {
        System.out.println("Throwing MyException from g()");
        throw new MyException("Originated in g()");
    }
    
    public static void main(String[] args) {
        
        try {
            f();
        } catch (MyException e) {
            e.printStackTrace();
        }
        
        try {
            g();
        } catch (MyException e) {
            e.printStackTrace();
        }
        
    }
} ///:~