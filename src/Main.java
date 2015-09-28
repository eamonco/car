public class Main {

    public static void main(String[] args) {

       vehicleStructure car = new vehicleStructure("VW", "Polo", "Petrol - 1.2");
       vehicleStructure car2 = new vehicleStructure("Suzuki", "gsx" , "i don't know");
       vehicleStructure car3 = new vehicleStructure("Audi", "A3", "loud");

       System.out.println("1." + car.getFullVehicleDescription());
       System.out.println();

       System.out.println("2." + car2.getFullVehicleDescription());
       System.out.println();

        System.out.println("3." + car3.getFullVehicleDescription());
        System.out.println();

        System.out.println(car.getVehicleDescription() + "s" + " engine has been updated to: " + car.updateVehicleEngine());

        engineStructure engine1 = new engineStructure("audi", )

        System.out.println(car.getEngineStructure);
    }
}
