package fit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Collections {

    public static void testar() {
        String[] names = new String[] { "Emilio", "Resende" };

        System.out.println("Imprimindo a lista completa...");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        for (var name : names) {
            System.out.println(name);
        }

        System.out.println("Imprimindo a lista nameList completa...");
        List<String> nameList = new ArrayList<String>();
        nameList.add("Emilio");
        nameList.add("Resende");
        for (String name : nameList) {
            System.out.println(name);
        }

        System.out.println("Imprimindo a lista nameListInline completa...");
        List<String> nameListInline = new ArrayList<String>() {
            {
                add("Emilio");
                add("Resende");
            }
        };
        for (String name : nameListInline) {
            System.out.println(name);
        }

        System.out.println("Imprimindo a lista nameListExtended completa...");
        List<String> nameListExtended = new ArrayList<String>();
        {
            {
                nameListExtended.add("Emilio");
                nameListExtended.add("Resende");
            }
        }
        ;
        for (String name : nameListExtended) {
            System.out.println(name);
        }

        System.out.println("Imprimindo o mapa1");
        Map<String, String> mapa1 = new HashMap<>();
        mapa1.put("chave1", "valor1");
        mapa1.put("chave2", "valor2");
        for (var key : mapa1.keySet()) {
            System.out.println(key);
            System.out.println(mapa1.get(key));
        }
        // algoritmo de hashing
        // "chave2" -> 42
        // "chave1" -> 41
        // [(42)-> "valor2", (41) -> "valor1"]
        for (var value : mapa1.values()) {
            System.out.println(value);
        }
        for (var keyValuePair : mapa1.entrySet()) {
            //{
            // "chave2": "valor2",
            // "chave1": "valor1"
            //}
            //[Entry("chave2", "valor2"),Entry("chave1", "valor1")] --> f5t43
            System.out.println(keyValuePair.getKey());
            System.out.println(keyValuePair.getValue());
        }

        Map<String, String> mapaInline = new HashMap<>() {
            {
                put("chave1", "valor1");
                put("chave2", "valor2");
            }
        };
        System.out.println(mapaInline);
    }

    public static void testarHashing() {
        var pedro = new Student("ra123");
        var maria = new Student("ra125");
        var einstein = new Nerd("ra123");
        
        System.out.println("areas de memoria...");
        System.out.println(pedro);
        System.out.println(maria);
        System.out.println(einstein);

        System.out.println("hashings...");
        System.out.println(pedro.hashCode());
        System.out.println(maria.hashCode());
        System.out.println(einstein.hashCode());
        
        var resultado = pedro.equals(maria);
        System.out.println("pedro == maria?");
        System.out.println(resultado);

        var resultado2 = pedro.equals(einstein);
        System.out.println("pedro == einstein?");
        System.out.println(resultado2);
    }
}
