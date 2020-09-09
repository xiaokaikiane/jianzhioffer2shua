public class JZ1 {//二维数组中的查找
    //暴力破解
    public boolean Find(int target, int [][] array) {
        for(int i=0;i<array.length;i++){
            for (int j=0;j<array[0].length;j++){
                if(array[i][j]==target){
                    return true;
                }
            }
        }
        return false;
    }
    //从左下角找,右边都大,上边都小
    public boolean Find1(int target, int [][] array) {
        int row=array.length;
        int col=array[0].length;
        if(row==0||col==0){
            return false;
        }
        int i=row-1;
        int j=0;
        while(i>0&&j<row){
            if(target==array[i][j]){
                return true;
            }else if(target<array[i][j]){
                i--;
            }else{
                j++;
            }
        }
        return false;
    }
}
