public class JZ12 {
    public double Power1(double base,int exponent){
        return Math.pow(base,exponent);
    }
    public double Power(double base, int exponent) {
        double ret=1;
        for(int i=0;i<Math.abs(exponent);i++){
            ret*=base;
        }
        if(exponent<0){
            ret=1/ret;
        }
        return ret;
    }
}
