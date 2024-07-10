
class Lamdathread{
   public static void main(String args[]){
  Runnable obj1=new Runnable() {
    public void run(){
        for(int i=0;i<50;i++){
          System.out.println("Sankar");
        }
     }
  };
  Runnable obj2=()->{
        for(int i=0;i<50;i++){
          System.out.println("Sarvesh");
        }
     };
     Thread t1=new Thread(obj1);
     Thread t2=new Thread(obj2);
   t1.start();
   t2.start();
   }
}