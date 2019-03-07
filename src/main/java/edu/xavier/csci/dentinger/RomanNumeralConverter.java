package edu.xavier.csci.dentinger;

import java.util.*;
import java.util.AbstractMap.SimpleEntry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RomanNumeralConverter {

    private Map<String, String> mappings;

    public RomanNumeralConverter() {

        mappings = Stream.of(
                new SimpleEntry<>("I", "1"),
                new SimpleEntry<>("V", "5"),
                new SimpleEntry<>("X", "10"),
                new SimpleEntry<>("L", "50"),
                new SimpleEntry<>("C", "100"),
                new SimpleEntry<>("D", "500"),
                new SimpleEntry<>("M", "1000"))
                .collect(Collectors.toMap(SimpleEntry::getKey, SimpleEntry::getValue));

    }
    public Integer decode(String romanNumeral) {
        String[] charList =romanNumeral.split("");
        List<String> characters = Arrays.asList(charList);
        Collections.reverse(characters);
        List<Integer> results = new ArrayList<>();
        results.add(0);
        results.add(0);

        characters.stream().map( val ->  Integer.valueOf(mappings.get(((String)val).toUpperCase())))
        .forEach(val -> {
            results.set(0, Math.max(results.get(0),val));
            if(val >= results.get(0) ) {
                int runningTotal = results.get(1) + val;
                results.set(1, runningTotal);
            }
            else {
                int runningTotal = results.get(1) - val;
                results.set(1, runningTotal);
            }

        });


        return results.get(1);
    }
}
