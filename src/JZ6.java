public class JZ6 {//旋转数组的最小数字
    public int minNumberInRotateArray(int [] array) {
        int min=array[0];
        for (int i=1;i<array.length;i++){
            if(array[i]<min){
                min=array[i];
            }
        }
        return min;
    }
    public int minNumberInRotateArray2(int [] array) {
        //前面的一部分总是大于后面的一部分
        int left=0;
        int right=array.length-1;
        int mid=0;
        while(array[left]>=array[right]){
            if(right-left==1){
                mid=right;
                break;//终止
            }
            mid=left+(right-left)/2;
            if(array[left]<=array[mid]){
                left=mid;
            }
            if(array[right]>=array[mid]){
                right=mid;
            }
        }
        return array[mid];
    }
}
