import org.w3c.dom.Node;

public class ll {
    node head;
    class node{
        String data;
         node next ;
         node(String data){
            this.data =data;
            this.next=null;
         }

    }
    public void addFirst(String data){
        node newNode =new node(data);
        if(head == null){
            head =newNode;
            return;
        }
        newNode.next=head;
        head =newNode;
    }
    public void addlast(String data){
        node newNode=new Node(data);
        if (head==null) {
            head =newNode;
            return;
             }
             node currrNode =head;
             while(currrNode.next !=null){
                currrNode=currrNode.next;
             }
              currrNode.next=newNode;
    }
    public void printlist(){ 
            if (head == null) {
                System.out.println("list is empty");
                return;
                
            }
             node currrNode =head;
             while(currrNode !=null){
                System.out.print(currrNode.data + "->");
                currrNode=currrNode.next;
             }
              System.out.println("NULL");
    }

    }
    public static void main(String[] args) {
        ll list=new ll(); 
        list.addFirst("a");
        list.addFirst("is");
        list.printlist();
    }
    

