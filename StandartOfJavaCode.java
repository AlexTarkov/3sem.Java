class StandartOfJavaCode extends Object {
    int ivar1;
    int ivar2;

    public StandartOfJavaCode(int ivar1, int ivar2) {
        this.ivar1 = ivar1;
        this.ivar2 = ivar2;
    }
    
   void emptyMethod() {}
   
   void showStandart() {
       
       final int N = 10;
       
       boolean condition, condition1, condition2, condition3, 
               condition4, condition5, condition6;
       
       condition = condition1 = condition2 = condition3 
               = condition4 = condition5 = condition6 = true;
       
       if (condition) {
           doSomethingAboutIt();
       }
       
       if (condition) {
           doSomethingAboutIt();
       } else if (condition) {
           doSomethingAboutIt();
       } else {
           doSomethingAboutIt();
       }
       
       
       if ((condition1 && condition2) 
               || (condition3 && condition4) 
               ||!(condition5 && condition6)) {
           doSomethingAboutIt();
       }
       
       for (int i = 0; i < N; i++) {
           doSomethingAboutIt();
       }
       
       while (condition) {
           doSomethingAboutIt();
       }
       
       do {
           doSomethingAboutIt();
       } while (condition);
       
       switch (ivar1) {             //на sun.com написано иначе.
           case 1:
               doSomethingAboutIt();
               break;
           case 2:
               doSomethingAboutIt();
               break;
           default:
               doSomethingAboutIt();
               break;
       }
       
       try {
           doSomethingAboutIt();
       } catch (Exception e) {
           doSomethingAboutIt();
       } finally {
           doSomethingAboutIt();
       }
       
       
   }
    
   public static void doSomethingAboutIt(){}

}

/* [+] package java.net.SocketOutputStream;
 * 
 *    private void socketWrite(byte b[], int off, int len) throws IOException {

        if (len <= 0 || off < 0 || off + len > b.length) {  //!!!!
            if (len == 0) {
                return;
            }
            throw new ArrayIndexOutOfBoundsException();
        }

        FileDescriptor fd = impl.acquireFD(); 
      ...
        if (socket != null) {
            if (!socket.isClosed())
                socket.close();
        } else                                              //!!!!
            impl.close();
        closing = false;      
 *  
 */


