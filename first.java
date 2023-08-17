public class first {
    private int size;
    Node head;
    first()
    {
        size=0;
    }
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
    public void addfirst(int data){
        Node newNode=new Node(data);
        if(head==null)
        {
            // System.out.println("no item");
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addLast(int data)
    {
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        } 
        Node currNode=head;
        while(currNode.next!=null)
        {
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }
    public void print(){
        Node currNode=head;
        if(head==null)
        {
            System.out.println("no list");
            return;
        }
        while(currNode!=null)
        {
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }
        System.out.println("null");
    }
    public int getSize()
    {
        return size;
    }
    public void deletefirst()
    {
        if(head==null){
            System.out.println("no element");
            return;
        }
        head=head.next;
        size--;
    }
    public void deleteLast()
    {
        if(head==null)
        {
            System.out.println("no element");
            return;
        }
        size--;
        if(head.next==null)
        {
            head=null;
            return;
        }
        Node currNode=head.next;
        Node secNode=head;
        while(currNode.next!=null){
            secNode=secNode.next;
            currNode=currNode.next;
        }
        secNode.next=null;
    }
    public void addBetween(int data,int i)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            // System.out.println("list is em");
            head=newNode;
            return;
        }
        int j=0;
        Node currNode=head;
        Node secNode=head.next;
        while(j!=i-1)
        {
            if(j>i)
            {
                return;
            }
            secNode=secNode.next;
            currNode=currNode.next;
            j++;
        }
        currNode.next=newNode;
        newNode.next=secNode;

    }

    public static void main(String[] args) {
        first m=new first();
        m.addfirst(2);
        m.addLast(3);
        m.addfirst(1);
        m.print();
        System.out.println(m.getSize());
        /* m.deletefirst();
        m.deletefirst();
        m.deletefirst();
        m.deletefirst(); */
        m.addBetween(5, 1);
        m.print();
    }
}
