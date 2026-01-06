class Demo{
    public String Add(int a, int b){
        if(a%2==0){
            return "even";
    }
    return "Odd";
    }
}
class Main {
    public static void main(String[] args) {
        
        Demo obj= new Demo();
        System.out.println(obj);
        String r=obj.Add(20,3);
        System.out.println(r);
        
    }
}
class Node{
    int data;
    Node Next;
    
    Node(int a){
        data=a;
        Next=null;
    }
    //getdata
    public void getData(){
        System.out.println(data);
    }
    public void getRef(){
        System.out.println(Next);
    }
    
}

class Main {
    public static void main(String[] args) {
        System.out.println("Dhanu");
        Node a= new Node(17);
        Node b= new Node(18);
        System.out.println(a);
        System.out.println(b);
        a.getData();
        a.getRef();
        b.getData();
        b.getRef();
        a.Next = b;
        a.getRef();
        
    }
}
