public class first1 {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    void addFirst(int data){
        Node node=new Node(data);
        if(head==null){
            head=node;
        }
        // Node curr=head;
        node.next=head;
        head=node;
    }
    void display()
    {
        Node curr=head;
        if(head==null)
        {
            System.out.println("no items");
            return;
        }
        else{
            while(curr!=null){
                System.out.print(curr.data+"->");
                curr=curr.next;
            }
            System.out.print("null");
        }
    }
    public static void main(String[] args) {
        // Node node=new Node();
        first1 m=new first1();
        m.addFirst(12);
        // m.display();
        m.addFirst(13);
        m.addFirst(17);
        m.addFirst(16);
        m.display();
    }
}
