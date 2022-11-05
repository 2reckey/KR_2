//Реализуйте класс Garage, который в себе будет хранить экземпляры автомобилей. Атрибуты – максимальная вместимость, какие автомобили и в каком количестве хранятся в гараже.
// Реализуйте методы, которые выводят на консоль построчно автомобили и их количество, отсортированных по количеству в гараже, отсортированных по цене автомобиля (если они есть в наличии)
public class Garage {
    private Car[] cars = new Car[0];
    private int amount_cars = 0;
    private int capacity;

    public Garage(int capacity) {
        setCapacity(capacity);
    }

    public Car[] getCars() {
        return cars;
    }

    private void setCars(Car[] cars) {
        this.cars = cars;
    }

    public void AppendCar(Car car) {
        if (getAmount_cars() + 1 <= getCapacity()) {
            setAmount_cars(getAmount_cars() + 1);
            Car[] new_cars = new Car[getAmount_cars()];
            for (int i = 0; i < getAmount_cars() - 1; ++i) {
                new_cars[i] = getCars()[i];
            }
            new_cars[getAmount_cars() - 1] = car;
            setCars(new_cars);
        }
    }

    public void ShowGarage() {
        for (Car car : cars) {
            System.out.println(car.getModel());
        }
    }

    public void SortByCost() {
        Car[] sorted_cars = new Car[getAmount_cars()];
        for (int i = 0; i < getAmount_cars(); ++i) {
            sorted_cars[i] = getCars()[i];
        }
        for (int i = 0; i < getAmount_cars(); ++i) {
            for (int j = 1; j < getAmount_cars(); ++j) {
                if (sorted_cars[j].getCost() < sorted_cars[j - 1].getCost()) {
                    Car temp = sorted_cars[j];
                    sorted_cars[j] = sorted_cars[j - 1];
                    sorted_cars[j - 1] = temp;
                }
            }
        }
        setCars(sorted_cars);
    }

    public int getCapacity() {
        return capacity;
    }

    private void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getAmount_cars() {
        return amount_cars;
    }

    private void setAmount_cars(int amount_cars) {
        this.amount_cars = amount_cars;
    }
}
