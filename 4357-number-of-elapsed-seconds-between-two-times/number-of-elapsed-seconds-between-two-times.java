import java.time.LocalTime;
class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        LocalTime st=LocalTime.parse(startTime);
        LocalTime et=LocalTime.parse(endTime);
        int s_t=st.toSecondOfDay();
        int e_t=et.toSecondOfDay();
        int diff = s_t-e_t;
        return Math.abs(diff);
        
    }
}