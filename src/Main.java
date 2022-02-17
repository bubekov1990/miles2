public class Main {
    public static void main(String[] args) {

        BonusService service = new BonusService();
        int result = service.calculate(10_000);
        System.out.println(result + " миль");

        int result2 = service.calculate(3_000);
        System.out.println(result2 + " миль");

        int result3 = service.calculate(7_000);
        System.out.println(result3 + " миль");


    }
}
