class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        return subsetDup(nums);
    }
    
    List<List<Integer>> subsetDup(int[] arr)
    {
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        int s = 0 ;
        int e = 0 ;
        // For Every Number Is Array Take Size Of Array N
        for (int i = 0 ; i < arr.length ; i++ ) {


            s = 0 ;

            if (i > 0 && arr[i] == arr[i-1])
            {
                s= e + 1 ;

            }
            e = outer.size() - 1 ;
            int n = outer.size();

            for (int j = s; j < n ; j++) {


                List<Integer> inner = new ArrayList<>(outer.get(j));
                // Get Copy Of Outer Array element
                // Add element into It

                inner.add(arr[i]);
                // Now Add Inner List Into Outer
                outer.add(inner);

            }


        }

        return  outer ;
    }
}