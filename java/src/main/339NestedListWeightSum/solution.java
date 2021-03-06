/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return null if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
public class Solution {
    // time complexity, O(N), N is the nubmer of nested element [[[[1]]],2] should be 5
    // space complexity, the deepest nested ele
    public int depthSum(List<NestedInteger> nestedList) {
        if(nestedList == null){
            return 0;
        }
        return depthSumHelper(nestedList, 1);
        
    }
    
    private int depthSumHelper(List<NestedInteger> input, int weight){
        int sum = 0;
        for(NestedInteger i: input){
            if(i.isInteger()){
                sum += i.getInteger() * weight;
            }else{
                sum += depthSumHelper(i.getList(), (weight+1));
            }
        }
        return sum;
    }
}
