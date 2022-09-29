class Solution {
    public List<Integer> findClosestElements(int[] a, int k, int x) {
        List<Integer> nm=new ArrayList<>();
        int i=0,j=a.length-1;
        while(j-i+1>k)
        {
            if(Math.abs(x-a[i])>Math.abs(x-a[j]))
            {
                i++;
            }
            else if(Math.abs(x-a[i])<=Math.abs(x-a[j]))
            {
                j--;
            }
        }
        for(int p=i;p<=j;p++)
        {
            nm.add(a[p]);
        }
        return nm;
    }
}