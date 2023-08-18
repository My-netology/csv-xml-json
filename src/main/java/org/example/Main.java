package org.example;

import java.util.List;

import static org.example.Utils.*;

public class Main {
    public static void main(String[] args) {
        // CSV -> JSON
        String[] columnMapping = {"id", "firstName", "lastName", "country", "age"};
        String fileName = "data.csv";
        List<Employee> listFromCSV = parseCSV(columnMapping, fileName);
        if (listFromCSV != null) {
            String jsonFromCSV = listToJSON(listFromCSV);
            writeString("data1.json", jsonFromCSV);
        }
        // XML -> JSON
        fileName = "data.xml";
        List<Employee> listFromXML = parseXML(fileName);
        if (listFromXML != null) {
            String jsonFromXML = listToJSON(listFromXML);
            writeString("data2.json", jsonFromXML);
        }
        // JSON -> Object
        fileName = "data.json";
        String json = readString(fileName);
        if (!json.equals("")) {
            List<Employee> listFromJSON = jsonToList(json);
            if (listFromJSON != null) {
                for (Employee employee : listFromJSON) {
                    System.out.println(employee.toString());
                }
            }
        }
    }
}