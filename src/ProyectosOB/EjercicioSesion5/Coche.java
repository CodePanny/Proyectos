package tema5;

public class Coche {

    //1. Atributos

String manufacturerName;
String modelName;
int horsepower;
int doors;
double price;
boolean inStock;

    //2. Constructores

    public Coche(){}

    public Coche(String manufacturerName, String modelName, int horsepower, int doors, double price, boolean inStock) {
        this.manufacturerName = manufacturerName;
        this.modelName = modelName;
        this.horsepower = horsepower;
        this.doors = doors;
        this.price = price;
        this.inStock = inStock;
    }

    //3. Métodos


    @Override
    public String toString() {
        return "Coche{" +
                "manufacturerName='" + manufacturerName + '\'' +
                ", modelName='" + modelName + '\'' +
                ", horsepower=" + horsepower +
                ", doors=" + doors +
                ", price=" + price +
                ", inStock=" + inStock +
                '}';
    }
}
