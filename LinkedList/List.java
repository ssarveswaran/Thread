

class Node {
    int val;
    Node next;
    public Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }
    public Node(int val){
        this.val=val;
    }
    
}
class List{
    Node head;
    Node tail;
    int size;
    public void insertStart(int val){
       Node node=new Node(val);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size++;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+"------------------>");
            temp=temp.next;
        }
        System.out.println(size);
    }
    public void insertEnd(int val){
        if(tail==null){
            insertStart(val);
            return;
        }
        Node node=new Node(val);
        tail.next=node;
       tail=node;
    }
    public void insertpos(int val,int index){
        Node node=new Node(val);
        Node temp=head;
        for(int i=0;i<=index-2;i++){
            temp=temp.next;
        }
        node.next=temp.next;
        temp.next=node;
        

    }
}
