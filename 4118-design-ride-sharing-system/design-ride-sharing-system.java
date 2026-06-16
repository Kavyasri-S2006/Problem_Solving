class RideSharingSystem {
    Queue<Integer> rider;
    Set<Integer> cancel;
    Queue<Integer> driver;
    public RideSharingSystem() {
        rider=new LinkedList<>();
        cancel=new HashSet<>();
        driver =new LinkedList<>();
    }
    
    public void addRider(int riderId) {
        rider.offer(riderId);
        cancel.add(riderId);
    }
    
    public void addDriver(int driverId) {
        driver.offer(driverId);
    }
    
    public int[] matchDriverWithRider() {
        while(!rider.isEmpty() && !cancel.contains(rider.peek())) rider.poll();
        int[] result=new int[2];
        if(rider.isEmpty() || driver.isEmpty()){
            result[0]=-1;
            result[1]=-1;
            return result;
        }
       else{
            result[0]=driver.poll();
            result[1]=rider.poll();
            //result={d,rider.poll()};
            return result;
        }
    }
    
    public void cancelRider(int riderId) {
        cancel.remove(riderId);
    }
}

/**
 * Your RideSharingSystem object will be instantiated and called as such:
 * RideSharingSystem obj = new RideSharingSystem();
 * obj.addRider(riderId);
 * obj.addDriver(driverId);
 * int[] param_3 = obj.matchDriverWithRider();
 * obj.cancelRider(riderId);
 */