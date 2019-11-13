package All;

import java.util.HashMap;

/**
 * 考点：数组、HashMap
 * 用一个HashMap存储建立入参数组nums中元素以及数组下标的映射关系
 * HashMap是基于哈希表实现的，每一个元素都是一个key-value对
 * 非线程安全，只适用于单线程环境
 * 支持序列化
 * 其实际上是一个"链表散列"的数据结构，即数组和链表的结合体，能在查询和修改方便继承了数组的线性查找和链表的寻址修改
 * HashMap的主结构类似于一个数组，添加值时通过key确定存储位置，每个位置是一个Entry的数据结构，该结构可组成链表
 * 当发生冲突时，相同hash值的键值对会组成链表
 * HashMap可以接受null键和值，而Hashtable则不能
 */

public class TwoSum {

    public int[] towSum (int[] nums, int target) {

        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            m.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int t = target - nums[i];
            if (m.containsKey(t) && m.get(t) != i) {
                res[0] = i;
                res[1] = t;
                break;
            }
        }
        return res;
    }

}
