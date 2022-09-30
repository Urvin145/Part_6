//Urvin Thummar_21ce145

class abc extends Thread{
    public void run(){
        for(int i=1;i<=15;i++)
        {
            System.out.println(i);
            try{
                sleep(1000);
            }catch (Exception e){
            }
        }
    }
}

public class P6_3 {
    public static void main(String[] args) {
        abc obj=new abc();
        obj.start();

    }

}
