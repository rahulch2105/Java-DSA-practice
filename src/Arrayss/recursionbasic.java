package Arrayss;

public class recursionbasic {
    int n=3;
void recursion(String  m){

    if(n==0){
        return ;
    }
    System.out.println(n);
    System.out.println(m);
    n--;
    recursion("rahul");
}
    public static void main(String[] args) {

        recursionbasic r=new recursionbasic();
        r.recursion("rahul");
    }
}
