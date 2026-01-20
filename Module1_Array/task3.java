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

