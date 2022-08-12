public class Taxi extends PublicTransport {
    int passenger = 0; //현재 승객 수
    String destination; //목적지
    int destinationDistance; //목적지까지 거리
    int defaultDistance = 1; //기본 거리
    int minimumFare = 3000; //기본 요금
    int streetCharge = 1000; //거리당 요금
    int fare = 0; //누적 요금

    Taxi(int number){
        System.out.printf("%d 택시 객체가 생성 되었습니다.\n",number);
        this.number = number;
        maxPassenger = 4;
        state = "일반";
    }

    public void setPassenger(int passenger){
        if(state.equals("일반")){
            if(passenger> maxPassenger) {
                System.out.println("최대 승객수 초과");
            }
            else {
                this.passenger = passenger;
                setState("운행중");
            }
        }
        else{
            System.out.println("탑승 불가");
        }

    }
    public int getPassenger(){
        return passenger;
    }

    public void setDestination(String destination){
        this.destination = destination;
    }
    public String getDefaultDistance(){
        return destination;
    }

    public void setDestinationDistance(int destinationDistance){
        this.destinationDistance = destinationDistance;
    }
    public int getDestinationDistance(){
        return destinationDistance;
    }

    public void setMinimumFare(int minimumFare){
        this.minimumFare = minimumFare;
    }
    public int getMinimumFare(){
        return minimumFare;
    }

    public int getRemainingSeats(){
        return maxPassenger - passenger;
    }

    public int getGetpaymentCost(){
        return minimumFare + (destinationDistance-defaultDistance) * streetCharge;
    }

    public void setFare() {
        this.fare += getGetpaymentCost();
        if(!getState().equals("운행불가")){
            setState("일반");
        }

    }

    public int getFare(){
        return fare;
    }

    public void setFuelVolume(int fuelVolume) {
        super.setFuelVolume(fuelVolume);
        if (this.fuelVolume < 10){
            System.out.println("주유가 필요합니다.");
            setState("운행불가");
        }
    }

}