//Реализовать класс Car и дочерние классы отдельных моделей автомобиля. Все классы должны содержать атрибуты цвет, максимальная скорость, тип коробки передач, текущая скорость, цена;
// методы start(), stop(), accelerate(int speed). Продумать атрибуты и/или методы для отдельных моделей автомобилей.
//
//Защитить классы от изменения данных извне.
public class Car {
    private String color;
    private int max_speed;
    private String gearbox_type;
    private int cost;
    private int current_speed;
    private boolean move = false;
    private int base_speed;

    public Car(String color, int max_speed, String gearbox_type, int base_speed, int cost) {
        setColor(color);
        setMax_speed(max_speed);
        setGearbox_type(gearbox_type);
        setCost(cost);
        setBase_speed(base_speed);
    }

    public void Start() {
        if (isMove()) {
            System.out.println("Машина уже заведена");
        } else {
            setMove(true);
            Accelerate(getBase_speed());
        }
    }

    public void Stop() {
        if (isMove()) {
            setMove(false);
            Accelerate(0);
        } else {
            System.out.println("Машина не заведена");
        }
    }

    public void Accelerate(int speed) {
        if (isMove()) {
            setCurrent_speed(speed);
        } else {
            System.out.println("Машина не заведена");
        }
    }


    public String getColor() {
        return color;
    }

    private void setColor(String color) {
        this.color = color;
    }

    public int getMax_speed() {
        return max_speed;
    }

    private void setMax_speed(int max_speed) {
        this.max_speed = max_speed;
    }

    public String getGearbox_type() {
        return gearbox_type;
    }

    private void setGearbox_type(String gearbox_type) {
        this.gearbox_type = gearbox_type;
    }

    public int getCost() {
        return cost;
    }

    private void setCost(int cost) {
        this.cost = cost;
    }

    public int getCurrent_speed() {
        return current_speed;
    }

    private void setCurrent_speed(int current_speed) {
        this.current_speed = current_speed;
    }

    public boolean isMove() {
        return move;
    }

    private void setMove(boolean move) {
        this.move = move;
    }

    private void setBase_speed(int base_speed) {
        this.base_speed = base_speed;
    }

    public int getBase_speed() {
        return base_speed;
    }

    public String getModel() {
        return null;
    }
}
