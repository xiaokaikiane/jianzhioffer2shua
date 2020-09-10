public class JZ9 {//变态跳台阶
    // 1,1,2,4,8,16,32
    public int JumpFloorII(int target) {
        int ret=1;
        for(int i=2;i<=target;i++){
            ret*=2;
        }
        return ret;
    }
}
