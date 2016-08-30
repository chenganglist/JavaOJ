import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            // 1、输入数组元素，并排序
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }
            Arrays.sort(nums);
             
            // 2、寻找差的绝对值的最小值，同时统计最小值、最大值的个数
            int c1 = 0;
            int c2 = 1;
            int min = Integer.MAX_VALUE;
            HashMap<Integer, Integer> dif = new HashMap<Integer, Integer>();
            for (int i = 0; i < nums.length - 1; i++) {
                min = Math.min(min, nums[i + 1] - nums[i]);
                if (nums[i] == nums[0])
                    c1++;
                if (nums[i] == nums[nums.length - 1])
                    c2++;
                if (dif.get(nums[i + 1] - nums[i]) != null) {
                    dif.put(nums[i + 1] - nums[i], dif.get(nums[i + 1] - nums[i]) + 1);
                } else {
                    dif.put(nums[i + 1] - nums[i], 1);
                }
            }
 
            // 3、计算差的绝对值最小的对数
            int minCount = 0;
            if (min == 0) { // 数组中有等值段
                int label = nums[0];
                int count = 1;
                for (int i = 1; i < nums.length; i++) {
                    if (nums[i] == label) {
                        count++;
                    } else {
                        label = nums[i];
                        minCount += (count * (count - 1)) / 2;
                        count = 1;
                    }
                }
                minCount += (count * (count - 1)) / 2;
            } else { // 数组中没有等值段
                minCount = dif.get(min);
            }
 
            // 4、计算差的绝对值最大的对数
            int maxCount = 0;
            if (nums[nums.length - 1] - nums[0] == 0) // 等值数组
                maxCount = n * (n - 1) / 2;
            else
                maxCount = c1 * c2;
             
            // 5、输出结果
            System.out.println(minCount + " " + maxCount);
        }
    }
}