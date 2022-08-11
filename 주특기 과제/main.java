public class main {
    public static void main(String argv[]){
        Bus bus1 = new Bus(1);
        Bus bus2 = new Bus(2);

        System.out.println("1. 승객 2명 탑승");
        bus1.setPassenger(2);

        System.out.println("2. 출력 버스");
        System.out.printf("\t 탑승 승객 수 = %d \n",bus1.getPassenger());
        System.out.printf("\t 잔여 승객 수 = %d \n",bus1.getRemainingSeats());
        System.out.printf("\t 요금 확인 = %d \n",bus1.getFare());

        System.out.println("3. 주유량 50 감소");
        bus1.setFuelVolume(-50);

        System.out.println("4. 출력 버스");
        System.out.printf("\t 주유량 = %d \n",bus1.getFuelVolume());

        System.out.println("5. 상태 변경 - 차고지행");
        bus1.setState("차고지행");

        System.out.println("6. 주유량 10 증가");
        bus1.setFuelVolume(10);

        System.out.println("7. 출력 버스");
        System.out.printf("\t 상태 = %s \n",bus1.getState());
        System.out.printf("\t 주유량 = %d \n",bus1.getFuelVolume());

        System.out.println("8. 상태 변경 - 운행중");
        bus1.setState("운행중");

        System.out.println("9. 승객 45명 탑승");
        bus1.setPassenger(45);

        System.out.println("11. 승객 5명 탑승");
        bus1.setPassenger(5);

        System.out.println("12. 출력 버스");
        System.out.printf("\t 탑승 승객 수 = %d \n",bus1.getPassenger());
        System.out.printf("\t 잔여 승객 수 = %d \n",bus1.getRemainingSeats());
        System.out.printf("\t 요금 확인 = %d \n",bus1.getFare());

        System.out.println("13. 주유량 55 감소");
        bus1.setFuelVolume(-55);

        System.out.println("14. 출력 버스");
        System.out.printf("\t 주유량 = %d \n",bus1.getFuelVolume());
        System.out.printf("\t 상태 = %s \n",bus1.getState());

        Taxi taxi1 = new Taxi(1);
        Taxi taxi2 = new Taxi(2);

        System.out.println("승객 2명 추가");
        taxi1.setPassenger(2);
        System.out.println("목적지 서울역 추가");
        taxi1.setDestination("서울역");
        System.out.println("목적지까지 거리 추가");
        taxi1.setDestinationDistance(2);

        System.out.println("2. 출력 택시");
        System.out.printf("\t 탑승 승객 수 = %d \n",taxi1.getPassenger());
        System.out.printf("\t 잔여 승객 수 = %d \n",taxi1.getRemainingSeats());
        System.out.printf("\t 기본 요금 확인 = %d \n",taxi1.getMinimumFare());
        System.out.printf("\t 목적지 = %s \n",taxi1.getDefaultDistance());
        System.out.printf("\t 목적지까지 거리 = %dkm \n",taxi1.getDestinationDistance());
        System.out.printf("\t 지불할 요금 = %d \n",taxi1.getGetpaymentCost());
        System.out.printf("\t 상태 = %s \n",taxi1.getState());

        System.out.println("3. 주유량 80 감소");
        taxi1.setFuelVolume(-80);

        System.out.println("4. 택시 요금 결제");
        taxi1.setFare();

        System.out.println("5. 출력 택시");
        System.out.printf("\t 주유량 = %d \n",taxi1.getFuelVolume());
        System.out.printf("\t 누적요금 = %s \n",taxi1.getFare());

        System.out.println("6. 승객 5명 추가");
        taxi1.setPassenger(5);

        System.out.println("8. 승객 3명 추가");
        taxi1.setPassenger(3);
        System.out.println("목적지 구로디지털단지역 추가");
        taxi1.setDestination("구로디지털단지역");
        System.out.println("목적지까지 거리 추가");
        taxi1.setDestinationDistance(12);

        System.out.println("9. 출력 택시");
        System.out.printf("\t 탑승 승객 수 = %d \n",taxi1.getPassenger());
        System.out.printf("\t 잔여 승객 수 = %d \n",taxi1.getRemainingSeats());
        System.out.printf("\t 기본 요금 확인 = %d \n",taxi1.getMinimumFare());
        System.out.printf("\t 목적지 = %s \n",taxi1.getDefaultDistance());
        System.out.printf("\t 목적지까지 거리 = %dkm \n",taxi1.getDestinationDistance());
        System.out.printf("\t 지불할 요금 = %d \n",taxi1.getGetpaymentCost());

        System.out.println("10. 주유량 20 감소");
        taxi1.setFuelVolume(-20);

        System.out.println("11. 택시 요금 결제");
        taxi1.setFare();

        System.out.println("12. 출력 택시");
        System.out.printf("\t 주유량 = %d \n",taxi1.getFuelVolume());
        System.out.printf("\t 상태 = %s \n",taxi1.getState());
        System.out.printf("\t 누적요금 = %s \n",taxi1.getFare());
    }
}