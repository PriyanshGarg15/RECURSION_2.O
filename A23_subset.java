// import java.util.*;

// public class A23_subset {
//     public static void main(String[] args) {
//         int[] nums = {1, 2, 3, 4}; // Example set
//         List<Integer> currentSubset = new ArrayList<>();
//         List<List<Integer>> allSubsets = new ArrayList<>();
//         generateSubsets(nums, 0, currentSubset, allSubsets);
//         System.out.println(allSubsets);
//     }

//     public static void generateSubsets(int[] nums, int start, List<Integer> currentSubset, List<List<Integer>> allSubsets) {
//         allSubsets.add(new ArrayList<>(currentSubset)); // Add current subset to the list of all subsets
//         for (int i = start; i < nums.length; i++) {
//             currentSubset.add(nums[i]);
//             generateSubsets(nums, i + 1, currentSubset, allSubsets);
//             currentSubset.remove(currentSubset.size() - 1); // Remove last element from current subset
//         }
//     }
// }


import java.util.*;

public class A23_subset {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4}; // Example set
        List<Integer> curr=new ArrayList<Integer>();
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        subsets(nums,0,curr,ans);
        System.out.println(ans);

   }
   public static void subsets(int[] arr,int i,List<Integer> curr,List<List<Integer>> ans)
   {
      if(i==arr.length)
      {
         ans.add(new ArrayList<Integer>(curr));
         return;
      }
      curr.add(arr[i]);
      subsets(arr,i+1,curr,ans);
      curr.remove(curr.size()-1);
      subsets(arr,i+1,curr,ans);
   }
}