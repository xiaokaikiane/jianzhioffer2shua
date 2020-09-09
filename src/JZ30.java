public class JZ30 {
    public int FindGreatestSumOfSubArray(int[] array) {//连续子数组最大和
        int max=array[0];//初始状态
        int num=array[0];
        for(int i=1;i<array.length;i++){
            num=Math.max(num+array[i],array[i]);
            if(num>max){
                max=num;
            }
        }
        return max;
    }
}
