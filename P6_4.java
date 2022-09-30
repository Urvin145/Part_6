//Urvin Thummar_21ce145

import java.lang.*;
public class P6_4  extends Thread {

        public void run()
        {
            System.out.println("Currently Executing The Thread : " + Thread.currentThread().getName());
        }


        public static void main(String argvs[])
        {

            P6_4 FIRST = new P6_4();
            P6_4 SECOND = new P6_4();
            P6_4 THIRD = new P6_4();

            FIRST.setPriority(3);
            SECOND.setPriority(5);
            THIRD.setPriority(7);


            System.out.println("Priority of the thread FIRST is : " + FIRST.getPriority());
            System.out.println("Priority of the thread SECOND is : " + SECOND.getPriority());
            System.out.println("Priority of the thread THIRD is : " + THIRD.getPriority());

        }
    }
