//Urvin Thummar_21ce145

class hello {
    public synchronized void display(String name){
        for (int i=0;i<3;i++){
            System.out.print("hi,it's ");
            try{
                Thread.sleep(2000);
            }catch (Exception e){}
            System.out.println(name);
        }
    }
}
class Mythred extends Thread{
    hello obj=new hello();
    String name;
    Mythred(hello obj,String name){
        this.obj=obj;
        this.name=name;
    }
    public void run(){
        obj.display(name);
    }
}

public class P6_5 {
    public static void main(String[] args) {
        hello obj1=new hello();
        Mythred obj2=new Mythred(obj1,"my name is Urvin");
        Mythred obj3=new Mythred(obj1,"21CE145");
        obj2.start();
        obj3.start();

    }

}
