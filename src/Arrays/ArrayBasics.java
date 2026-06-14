package Arrays;
public class ArrayBasics {
    public static void main (String[] args){
        int n=1634;
        int temp=n;
        int sum=0;
        while(n>0) {
            int id = n % 10;
            sum = sum+(id*id*id*id);
            n=n/10;
        }
        if(sum==temp){
            System.out.print("Armstrong");
        }
        else{
            System.out.print("Not a Armstrong");
        }
    }
}
