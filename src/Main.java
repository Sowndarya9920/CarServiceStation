import services.ServiceStation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ServiceStation.showServicesTypes();
        String carType = sc.next();
        List<String> services = new ArrayList<>();
        System.out.println("Enter total number of services that you want: ");
        int n = sc.nextInt();
        System.out.println("Enter Service codes");
        while(n --> 0){
            services.add(sc.next());
        }

        ServiceStation serviceStation = new ServiceStation(carType,services);
        int totalPrice = serviceStation.getTotalPrice();
        System.out.println("Total price : "+totalPrice);
        if(totalPrice > 10000){
            System.out.println("You have got the complimentary cleaning services.");
        }
    }
}

