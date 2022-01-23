package Method2;

import Method1.TwoSum;

import java.util.HashMap;

// 采用哈希表
public class TwoSum2 {
    public static void main(String[] args) {
        int[] arr = {12, 45, 1, 7, 9};
        int[] ints = TwoSum.test1(arr, 16);
        for (int data : ints) {
            System.out.print(data + "\t");
        }

    }


    public int[] test1(int[] myArray, int target) {
        // 创建一个指定hashMap长度的hash表
        HashMap<Integer, Integer> objectObjectHashMap = new HashMap<>(myArray.length - 1);

        // 将数组的首元素存入到hashMap中
        objectObjectHashMap.put(myArray[0], 0);

        // 遍历数组
        for (int i = 1; i < myArray.length; i++) {
            // 判断目标值-数组中的元素 == HashMap中的元素
            int i1 = target - myArray[i];
            if (objectObjectHashMap.containsKey(i1)) {
                return new int[]{objectObjectHashMap.get(i), i1};
            }
            // 如果不存在就直接存入haspMap中
            objectObjectHashMap.put(myArray[i], i);
        }
        throw new IllegalArgumentException("没有找到元素！");

    }
}
