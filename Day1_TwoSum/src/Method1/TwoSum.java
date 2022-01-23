package Method1;
// 求取数组中两数之和

// 采用暴力法求解
public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {12, 45, 1, 7, 9};
        int[] ints = TwoSum.test1(arr, 8);
        for (int data : ints) {
            System.out.print(data + "\t");
        }

    }


    public static int[] test1(int[] myArray, int target) {
        // 首先判断数组是否为空；
        if (myArray.length == 0) {
            return null;
        }
        // 判断数组中元素是否等于两数之和
        // 时间复杂度为o(N*N)
        for (int i = 0; i < myArray.length - 1; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[i] + myArray[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        // 如果没有找到，直接抛出异常
        throw new IllegalArgumentException("如果没有找到");
    }
}
