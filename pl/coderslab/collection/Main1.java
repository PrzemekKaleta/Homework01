package pl.coderslab.collection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static java.util.stream.Collectors.toMap;

public class Main1 {
    public static void main(String[] args) {


        File file = new File("earnings.txt");
        List<String> employees = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                employees.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        ListIterator<String> listIterator1 = employees.listIterator();

        Map<String, Double> employeeMap = new HashMap<>();

        while (listIterator1.hasNext()) {
            String employee = listIterator1.next();

            Pattern surnameKovalsky = Pattern.compile("[Kk]owalsk[ia]");
            Matcher surnameMatcher = surnameKovalsky.matcher(employee);

            Pattern paymentEmployee = Pattern.compile("[\\d]+.[\\d]+");
            Matcher paymentMatcher = paymentEmployee.matcher(employee);

            while (!surnameMatcher.find() && paymentMatcher.find()) {
                employeeMap.put(employee, Double.parseDouble(paymentMatcher.group()));
            }
        }

        Map<String, Double> sortedMap = employeeMap
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(
                        toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e1,
                                LinkedHashMap::new));

        //number of person for wage reduction
        int shortList = 3;

        int i=0;

        Iterator it = sortedMap.entrySet().iterator();
        while(it.hasNext()&& i<shortList) {
            Map.Entry keyValue = (Map.Entry) it.next();
            System.out.println(keyValue.getKey());
            i++;
        }
    }
}
