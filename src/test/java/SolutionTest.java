import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1(){
        int[] nums = {10,5,2,6};
        int k = 100;
        int expected = 8;
        int actual = new Solution().numSubarrayProductLessThanK(nums, k);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test2(){
        int[] nums = {1,2,3};
        int k = 0;
        int expected = 0;
        int actual = new Solution().numSubarrayProductLessThanK(nums, k);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test3(){
        int[] nums = {1,1,1};
        int k = 1;
        int expected = 0;
        int actual = new Solution().numSubarrayProductLessThanK(nums, k);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test4(){
        int[] nums = {10,9,10,4,3,8,3,3,6,2,10,10,9,3};
        int k = 19;
        int expected = 18;
        int actual = new Solution().numSubarrayProductLessThanK(nums, k);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test5(){
        int[] nums = {57,44,92,28,66,60,37,33,52,38,29,76,8,75,22};
        int k = 18;
        int expected = 1;
        int actual = new Solution().numSubarrayProductLessThanK(nums, k);

        Assert.assertEquals(expected, actual);
    }

}

