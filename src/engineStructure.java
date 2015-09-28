public class engineStructure {

    public String brand;
    public String fuelType;
    public float Capacity;
    public float width;
    public float height;

    public engineStructure(String brand, String fuelType, float capacity, float width, float height)
    {
        this.brand = brand;
        this.Capacity = capacity;
        this.fuelType = fuelType;
        this.height = height;
        this.width = width;
    }

    public String getEngineStructure()
    {
      return (brand + " " + fuelType + " " + Capacity + " " + width + " " + height) ;
    }
}
