public class JZ7 {
    public int Fibonacci(int n) {//斐波那锲数列
        if(n==0){
            return 0;
        }
        if(n==1||n==2){
            return 1;
        }
        return Fibonacci(n-1)+Fibonacci(n-2);
    }
    public static String func(String val){
        if(val.charAt(0)=='0'){
            return "error";
        }
        if(Integer.parseInt(val)<0||Integer.parseInt(val)>Integer.MAX_VALUE){
            return "error";
        }
        int left=0;
        int right=val.length()-1;

        while(left<=right){
            if(val.charAt(left)!=val.charAt(right)){
                return "false";
            }
            left++;
            right--;
        }
        return "true";
    }

    public static void main(String[] args) {
        System.out.println(func("hdjfkf"));
    }
}
