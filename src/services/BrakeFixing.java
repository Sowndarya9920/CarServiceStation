package services;
import type.CarType;
import interfaces.IService;

import java.util.HashMap;
public class BrakeFixing implements IService{
    CarType carType;
    static HashMap<CarType,Integer> priceMap = new HashMap<>();
    static {
        priceMap.put(CarType.HatchBack,2000);
        priceMap.put(CarType.Sedan,4000);
        priceMap.put(CarType.Suv,5000);
    }
    BrakeFixing(CarType carType){
        System.out.println("Charges for Brake Fixing – ₹ "+priceMap.get(carType));
        this.carType = carType;
    }

    @Override
    public Integer getPrice() {
        return priceMap.get(carType);
    }
}
