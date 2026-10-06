
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;

    }
}
class linkedlist{
Node head;
public linkedlist(){
    head=null;
}}

public void addBegin(int data){
    Node new_node=new Node(data);
    new_node.next=head;
    head=new_node;

}
public void traverse(){
    if (head==null){
        System.out.println("LL empty");

    }
    else{
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
    }

    
}

public class Linkedlist{
    public static void main(String[] args) {
        Linkedlist ll=new Linkedlist();
        ll.addBegin(10);
        ll.addBegin(20);
        ll.traverse(30);
    }
}
