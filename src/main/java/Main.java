import ru.netology.sqr.Packages_Loops.SQRService.calcSqr.SQRService;

public class Main {
    public static void main(String[] args) {


        SQRService service = new SQRService();
        System.out.println(service.calcSqr(400));
        System.out.println(service.calcSqr(441));
        System.out.println(service.calcSqr(484));
    }
}

