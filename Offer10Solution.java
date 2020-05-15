public class Offer10Solution {
    public int Fibonacci(int n) {
        if (n==0){
            return 0;
        }
        if (n==1||n==2){
            return 1;
        }
        int pre=1;
        int p=1;
        for (int i=2;i<n;i++){
            int temp=p;
            p=pre+p;
            pre=temp;
        }
        return p;
    }
}