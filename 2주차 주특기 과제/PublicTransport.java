public class PublicTransport {
    int number; //번호
    int fuelVolume; //주유량
    int speed = 0; //현재 속도
    int maxPassenger; //최대 승객 수
    String state; //상태

    PublicTransport(){
        this.fuelVolume = 100;
        this.speed = 0;
    }

    public void setFuelVolume(int fuelVolume) { this.fuelVolume += fuelVolume; }
    public int getFuelVolume() { return fuelVolume; }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int getSpeed() {
        return speed;
    }

    public void setState(String state){
        this.state = state;
    }
    public String getState(){
        return state;
    }


}