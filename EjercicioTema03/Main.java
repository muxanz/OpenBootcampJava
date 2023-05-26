public class Main {
    public static void main(String[] args) {
        int result = sum(10, 20, 30);
        System.out.println(result);

        Car myCar = new Car();
        myCar.AddDoors();
        System.out.println("Cantidad de puertas: " + myCar.doors);
    }
    public static int sum(int a, int b, int c){
        return a + b + c;
    }
}

