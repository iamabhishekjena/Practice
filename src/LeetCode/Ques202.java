package LeetCode;

public class Ques202 {
    public boolean isHappy(int n) {
        if(n==1){
            return true;
        }
        if(n<10){
            return false;
        }
        else{
            int sum =0;
            while(n>=10){
                int rem = n%10;
                sum += (rem*rem);
                n = n/10;
            }
            sum += (n*n);

            return isHappy(sum);
        }
    }
}
