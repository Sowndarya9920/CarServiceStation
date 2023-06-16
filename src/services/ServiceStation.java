package services;
import type.CarType;
import interfaces.IServiceProvider;

import java.util.ArrayList;
import java.util.List;

public class ServiceStation implements IServiceProvider{
    CarType carType;

    List<String> services = new ArrayList<>();
    public ServiceStation(String carType, List<String> services){
        this.carType = getCarType(carType);
        this.services= services;
    }
    public static void showServicesTypes() {
        System.out.println("Welcome to Car Servicing Station");
    }
    public CarType getCarType(String carType){
        if(carType.equals("Suv")){
            return CarType.Suv;
        }else  if(carType.equals("Sedan")){
            return CarType.Sedan;
        }else
            return CarType.HatchBack;
    }
    Integer totalPrice = 0;
    @Override
    public Integer getTotalPrice() {
        for (String servicing : services) {
            if(servicing.equals("BS01")){
                BasicServicing bs = new BasicServicing(this.carType);
                totalPrice += bs.getPrice();
            }else if(servicing.equals("EF01")){
                EngineFixing bs = new EngineFixing(this.carType);
                totalPrice += bs.getPrice();
            }else if(servicing.equals("GF01")){
                GearFixing bs = new GearFixing(this.carType);
                totalPrice += bs.getPrice();
            }else if(servicing.equals("BF01")){
                BrakeFixing bs = new BrakeFixing(this.carType);
                totalPrice += bs.getPrice();
            }else if(servicing.equals("CF01")){
                ClutchFixing bs = new ClutchFixing(this.carType);
                totalPrice += bs.getPrice();
            }
        }
        return totalPrice;

    }


}
