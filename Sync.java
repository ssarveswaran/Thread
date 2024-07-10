//here the sync is used when there are two thread call at the sametime there may loss some 
//data using sync we handle thread one my one
class A{
    int inc;
    public synchronized void incr(){
      inc++;
    }
    
}
public class Sync {
    public static void main(String[] args) throws InterruptedException {
        A at=new A();


    Runnable obj1=new Runnable() {
        public void run(){
            for(int i=0;i<100000;i++){
              at.incr();
            }
         }
      };
      Runnable obj2=()->{
            for(int i=0;i<100000;i++){
              at.incr();
            }
         };
         Thread t1=new Thread(obj1);
         Thread t2=new Thread(obj2);
       t1.start();
       t2.start();
    //    t1.join();
    //    t2.join();this is used foir holding when the thread comes it will go to next part
           t1.join();
       t2.join();
       System.out.println(at.inc);
    }
    
}
