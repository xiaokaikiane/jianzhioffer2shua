import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class JZ27 {//字符串的排列
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> list=new ArrayList<>();
        if(str.length()==0||str==null){
            return list;
        }
        Set<String> set=new HashSet<>();
        char[] arr=str.toCharArray();
        func(0,set,arr);
        for(String s:set){
            list.add(s);
        }
        Collections.sort(list);
        return list;
    }
    public void func(int start,Set<String> set,char[] arr){
        if(start+1==arr.length){
            String s="";
            for(int i=0;i<arr.length;i++){
                s+=arr[i];
            }
            set.add(s);
            return;
        }
        for(int i=start;i<arr.length;i++){
            char temp=arr[start];
            arr[start]=arr[i];
            arr[i]=temp;
            func(start+1,set,arr);
            char temp1=arr[start];
            arr[start]=arr[i];
            arr[i]=temp1;
        }
    }
}
