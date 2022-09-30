public class P6_1a  extends Thread {

        public void run(){
            System.out.println("HELLO WORD");
        }
        public static void main(String args[]){
            P6_1a  t1 = new  P6_1a();

            t1.start();
        }
    }



