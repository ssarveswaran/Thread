public class pattern1{
    public static void main(String[] args) {
        pattern(0,5);
    }
    public static void pattern(int r,int c){
        if(r==5){
            return;
        }
        else if(r<c){ 
           
            pattern(r,c-1);
            System.out.print("*");
            }
        
        else {
            
            pattern(r+1,5);
            System.out.println();
        }
      
}}
