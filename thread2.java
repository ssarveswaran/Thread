//Uing interface thread when we are going to use the multiple inheritance in the same class that we are going to use this thing
class A implements Runnable{
    public void run(){
       for(int i=0;i<1000;i++){
         System.out.println("Sarvesh");
       }
    }
}
class B implements Runnable{
   public void run(){
       for(int i=0;i<1000;i++){
         System.out.println("sankar");
       }
    }
}
class thread2{
   public static void main(String args[]){
       A a=new A();
       B b=new B();
       Thread t1=new Thread(a);
       Thread t2=new Thread(b);
       t1.start();
       t2.start();

   }
}