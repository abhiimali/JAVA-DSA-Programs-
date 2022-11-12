class MedianFinder {


        ArrayList<Integer> al;
    PriorityQueue<Integer> g;
    PriorityQueue<Integer> s;
    public MedianFinder() {
        al = new ArrayList<>();
        g=new PriorityQueue<Integer>();
        s=new PriorityQueue<Integer>(Collections.reverseOrder());
        
    }
    
    public void addNum(int num) {
        al.add(num);
        if(s.size()>g.size())
            {
                if(s.peek()>num){
                    g.add(s.poll());
                    s.add(num);
                }else g.add(num);
            }else{
                if(s.peek()!=null && num<=s.peek()){
                    s.add(num);
                }else{
                    g.add(num);
                    s.add(g.poll());
                }
            }
    }
    
    public double findMedian() {
         int n = al.size();
        if(n==1)
            return al.get(0);
        if(n%2==0)
                    return ((double)(s.peek()+g.peek())/2);
        return s.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */