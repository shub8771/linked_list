class ll{
    Node head;
    private int size;
    ll(){
        size=0;
    }
    class Node{
        String data;
        Node next;
        Node (String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
//add 
    // first
    //last
    public void addfirst(String data){
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addLast(String data){
        Node newNode=new Node(data);
        if(head==null)
        {
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
            System.out.println("list is empty");
            return;
        }
        while(currNode!=null)
        {
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }
        System.out.println("Null");
        // currNode.next=newNode;
    }
    public void deletefirst(){
        if(head==null){
            System.out.println("no list is there");
            return;
        }
        head=head.next;
        size--;
    }
    public void deleteLast(){
        if(head==null)
        {
            System.out.println("list is empty");
            return;
        }
        size--;
        if(head.next==null)
        {
            head=null;
            return; 
        }
        Node secNode=head;
        Node currNode=head.next;
        while(currNode.next!=null)
        {
            secNode=secNode.next;
            currNode=currNode.next;
        }
        secNode.next=null;
    }
    public int getSize(){
        return size;
    }
    public static void main(String[] args) {
        ll list=new ll();
        list.addfirst("a");
        list.addfirst("is");
        list.print();
        list.addLast("list");
        list.print();
        list.addfirst("this");
        list.print();
        list.deleteLast();
        list.deletefirst();
       /*  list.deletefirst();
        list.deletefirst(); */
        list.deleteLast();
        list.deleteLast();
        list.print();
        list.addfirst("hel");
        System.out.println(list.getSize());
    }
}