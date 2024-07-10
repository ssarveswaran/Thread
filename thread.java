//USING CLASS IMPLEMENTATION JUST EXTENDS THREAD TO CRATE THE MULTITHREAD 
class A extends Thread{
     public void run(){
        for(int i=0;i<1000;i++){
          System.out.println("Sarvesh");
        }
     }
}
class B extends Thread{
    public void run(){
        for(int i=0;i<1000;i++){
          System.out.println("sankar");
        }
     }
}
class thread{
    public static void main(String args[]){
        A a=new A();
        B b=new B();
        a.start();
        b.start();

    }
}