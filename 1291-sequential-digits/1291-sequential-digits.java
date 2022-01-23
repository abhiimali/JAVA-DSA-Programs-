class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        
        String nums = "123456789";
         List<Integer> result = new ArrayList<>();
        int nl = String.valueOf(low).length(); //valueOf is for the conversion of int to string
         int nh = String.valueOf(high).length();
        for(int i=nl;i<=nh;i++){
            for(int j = 0; j < 10-i;j++){
                int num = Integer.parseInt(nums.substring(j,j+i));
                if(num >= low && num<= high )
                    result.add(num);
                
            }
        }
        return result;
    }
}