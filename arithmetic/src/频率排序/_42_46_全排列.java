package 频率排序;

import java.util.List;

/**
 * tip:
 *
 * @author zhumingcheng
 * createTime: 2022-01-25 19:55
 */
public class _42_46_全排列 {
    public static List<List<Integer>> permute(int[] nums) {
        return null;
    }

    public static void main(String[] args) {
        int[] arr=new int[]{1,5,6,0,7,4,9,3};
        int[] index=new int[]{0,1,2,3,4,0,5,1,2,6,7};
        String tel ="";
        for (int i : index) {
            tel += arr[i];
        }
        System.out.println("联系方式" + tel);
    }
}