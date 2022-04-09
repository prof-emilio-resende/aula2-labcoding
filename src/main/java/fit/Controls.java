package fit;

public class Controls {

    public static void testar() {
        int vlr = 1;

        switch(vlr) {
            case 1:
            case 2:
                System.out.println("valor 1 ou 2");
                break;
            default:
                System.out.println("valor default");
        }

        int num = switch("segunda-feira") {
            case "segunda-feira" -> 1;
            default -> 3;
        };

        System.out.println(num);
    }

}
