import java.util.Date;
public class vehicleStructure{

    private String manufacturer;
    private String model;
    public String engine;
    private int wheels;

    public vehicleStructure(String manufacturer, String model, String engine)
    {
        this.manufacturer = manufacturer;
        this.model = model;
        this.engine = engine;
        this.wheels = 4;

        if (manufacturer == "Suzuki" && model == "gsx")
        {
          wheels = 2;
        }
        else
        {
            wheels = 4;
        }
    }
    public vehicleStructure(String manufacturer, String model)
    {
        this.manufacturer = manufacturer;
        this.model = model;

        if (manufacturer == "Suzuki" && model == "gsx")
        {
            wheels = 2;
        }
        else
        {
            wheels = 4;
        }
    }
    public String getVehicleDescription()
    {
        return manufacturer + " " + model;
    }

    public String getFullVehicleDescription()
    {
        return "Manufacturer: " + manufacturer + " " +"Model:" + model + " " + "No. of wheels:" + wheels;
    }

    public String viewVehicleEngine()
    {
        return engine;
    }

    public String updateVehicleEngine()
    {
        Date date= new Date();
        return engine = "2.0 tdi" + " on " + date;

    }

}

