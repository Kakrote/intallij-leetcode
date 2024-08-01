public class MargeTwoSortedList {

    private Node head;

    public void insertFirst(int value){
        Node node=new Node(value);
        node.next=head;
        head=node;
    }

    public void insertEnd(int value){
        if(head==null){
            insertFirst(value);
            return;
        }
        Node temp=head;
        Node node =new Node(value);
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=node;
        // temp=node;
        // node.next=null;


    }

    public static MargeTwoSortedList margeNode(MargeTwoSortedList list1,MargeTwoSortedList list2){
        Node h1=list1.head;
        Node h2=list2.head;
        MargeTwoSortedList ans=new MargeTwoSortedList();
        while (h1!=null && h2!=null) {
            if(h1.value<h2.value){
                ans.insertEnd(h1.value);
                h1=h1.next;
            }
            else{

                ans.insertEnd(h2.value);
                h2=h2.next;
            }
            
        }
        while(h1!=null){
            ans.insertEnd(h1.value);
            h1=h1.next;

        }
        
        while(h2!=null){
            ans.insertEnd(h2.value);
            h2=h2.next;
        }
        
        return ans;
    }

    public  void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.println("End");

    }

    class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value=value;
        }
        public Node(int value,Node next){
            this.value=value;
            this.next=next;
        }
    }

    public static void main(String[] args) {
        MargeTwoSortedList l1=new MargeTwoSortedList();
        MargeTwoSortedList l2=new MargeTwoSortedList();
        l1.insertEnd(1);
        l1.insertEnd(3);
        l1.insertEnd(5);
        l2.insertEnd(2);
        l2.insertEnd(4);
        l2.insertEnd(9);
        l2.insertEnd(12);
        l2.insertEnd(15);
        MargeTwoSortedList mans=MargeTwoSortedList.margeNode(l1,l2);
        mans.display();
        
    }
}
