class MergeIntervals {

    // Naive Approach O(n^2) O(1)
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));
        int n = intervals.length;
        List<List<Integer>> answer = new ArrayList<>();
        for(int i = 0; i < n; i++){
            List<Integer> newInterval = new ArrayList<>();
            int start = intervals[i][0];
            int end = intervals[i][1];
            //We will check that the end of previous stored pair is grater than current start then we will
            // move on to next interations
            if(!answer.isEmpty() && answer.get(answer.size()-1).get(1) >= start){
                continue;
            }
            for(int j = i+1 ; j< n; j++){
                int nextStart = intervals[j][0];
                int nextEnd = intervals[j][1];
                // We will check current end with next start and current end with next end 
                //if condition satisfy we will update the current end with next end beacuse it is greater
                if(nextStart <= end && nextEnd >= end ){
                      end = nextEnd;
                  }
            }
            newInterval.add(start);
            newInterval.add(end);
            answer.add(newInterval);
        }
        
       int [][] result = new int [answer.size()][2];
        int k = 0;
        for(List<Integer> list : answer){
            result [k][0] = list.get(0);
            result [k][1] = list.get(1);
            k++;
        }
        return result;
    }

     public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));
        int n = intervals.length;
        List<List<Integer>> answer = new ArrayList<>();
        for(int i = 0; i < n; i++){
            List<Integer> newInterval = new ArrayList<>();
            int start = intervals[i][0];
            int end = intervals[i][1];
            //If answer is empty we will add first interval
            //if current start is greater than previous end we will add new pair in the list
            // if both conditions satisfied then we can say that there is no overlaping in the current and previous pair.
            if(answer.isEmpty() || start > answer.get(answer.size()-1).get(1)){
               newInterval.add(start);
               newInterval.add(end);
               answer.add(newInterval);  
            }
              //Interval is overlap if and only if current start is in between previous pair start and end.
            //If the previous end of the pair is less tha curreent end and interval is overlapping then we will update the end to the list
            else{
                end = Math.max(answer.get(answer.size()-1).get(1),end);
                answer.get(answer.size()-1).set(1,end);
            }
            
        }
        
       int [][] result = new int [answer.size()][2];
        int k = 0;
        for(List<Integer> list : answer){
            result [k][0] = list.get(0);
            result [k][1] = list.get(1);
            k++;
        }
        return result; 
    }
}