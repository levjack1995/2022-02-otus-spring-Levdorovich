package ru.otus.testing.parsers;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class StringToIntegerNumberParser {

    public List<Integer> stringToListInteger(String numbers) {
        String[] strings = numbers.split(",");
        return Arrays.stream(strings).map(String::trim).filter(s -> !s.isEmpty())
                .map(Integer::parseInt).collect(Collectors.toList());
    }
}
