public class Stack
{
    public Node top;


    public Stack(){
        top=null;
    }
    public boolean isEmpty()
    {
        return top==null;

    }
    public void push(int data)
    {
        Node n1 = new Node(data);
        if (isEmpty())
        {
            top=n1;
        }
        else {

            n1.next=top;
            top=n1;
        }
        System.out.println(data+" inserted to the front");

    }
    public void pop(){

        if (isEmpty())
        {
            System.out.println("Stack Empty/ underflow!");
            return;

        }

        System.out.println(top.data+" -> Last data");
        Node temp=top.next;
        top.next=null;
        top=temp;

    }
}
