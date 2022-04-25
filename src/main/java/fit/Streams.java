package fit;

import java.util.List;
import java.util.stream.Collectors;

public class Streams {

    public static void testar() {
        System.out.println("nao funcional...");
        var ls = List.of("Emilio", "Murta", "Resende");
        for(var s : ls) {
            var sGrande = s.toUpperCase();
            System.out.println(sGrande);
        }

        System.out.println("funcional...");
        
        System.out.println("sem collector");
        List.of("Emilio", "Murta", "Resende")
            .stream()
            .map(x -> {
                System.out.println("toUpper");
                return x.toUpperCase();
            })
            .forEach(System.out::println);

        System.out.println("com collector");
        List.of("Emilio", "Murta", "Resende")
            .stream()
            .map(x -> {
                System.out.println("toUpper");
                return x.toUpperCase();
            })
            .collect(Collectors.toList())
            .forEach(System.out::println);

    }

}
