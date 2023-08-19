package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.example.Utils.jsonToList;
import static org.example.Utils.listToJSON;
import static org.junit.jupiter.api.Assertions.assertEquals;

class UtilsTest {

    @Test
    void listToJSONTest() {
        List<Employee> list = List.of(new Employee(1, "Max", "Khrapatiy", "PL", 44));
        String json = "[{\"id\":1,\"firstName\":\"Max\",\"lastName\":\"Khrapatiy\",\"country\":\"PL\",\"age\":44}]";
        String result = listToJSON(list);
        assertEquals(result, json);
    }

    @Test
    void jsonToListTest() {
        String json = "[{\"id\":1,\"firstName\":\"Max\",\"lastName\":\"Khrapatiy\",\"country\":\"PL\",\"age\":44}]";
        List<Employee> list = List.of(new Employee(1, "Max", "Khrapatiy", "PL", 44));
        List<Employee> result = jsonToList(json);
        assertEquals(list, result);
    }
}