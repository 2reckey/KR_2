public class Main {

    public static void main(String[] args) {
        BMW_X5 bmw=new BMW_X5("black",320000);
        Mercedes_Benz_W176 mercedes= new Mercedes_Benz_W176("gray", 1200000);
        Garage garage=new Garage(2);
        garage.AppendCar(mercedes);
        garage.AppendCar(bmw);
        garage.ShowGarage();
        System.out.println("------------Sorted---------");
        garage.SortByCost();
        garage.ShowGarage();
    }
}
