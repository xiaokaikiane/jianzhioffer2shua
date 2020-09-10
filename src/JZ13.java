public class JZ13 {//调整数组顺序是奇数位于偶数前面
    public void reOrderArray(int [] array) {
        int[] arr=new int[array.length];
        int k=0;
        for(int i=0;i<array.length;i++){
            if(array[i]%2==1){
                arr[k++]=array[i];
            }
        }
        for(int j=0;j<array.length;j++){
            if(array[j]%2==0){
                arr[k++]=array[j];
            }
        }
        for(int i=0;i<array.length;i++){
            array[i]=arr[i];
        }
    }
}
