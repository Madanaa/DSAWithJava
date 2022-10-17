package assignment;

import java.util.*;
/*
filter list of city details on basis of states that is we
need to create hashmap key should state string value should city details class object
 */
public class Main {
    public static void main(String[] args) {
       // List<CityDetails> cityDetails = new ArrayList<>();
        //cityDetails.add(new CityDetails(1,"Bareilly","UP","India"));

        Map<String,CityDetails> map = new HashMap<>();
        map.put("Delhi",new CityDetails(1,"Delhi","Up","India"));
        map.put("UP",new CityDetails(2,"Bareilly","UP","India"));

        Set<Map.Entry<String, CityDetails>> set = map.entrySet();
        System.out.println(set);
        Set<String> set1 = map.keySet();
        System.out.println(set1);
        Collection<CityDetails> stringSet = map.values();
        System.out.println(stringSet);


//        map.forEach((integer, cityDetails) -> {
//            cityDetails.getCityNamebyState("Delhi");
//        }
//                );





//        Map<Integer,String> filters = new HashMap<>();
//        filters.put(1,"Bareilly");

//        List<CityDetails> details = cityDetails.stream()
//                .filter(element -> filters.entrySet().stream().allMatch(f -> Objects.equals(f.getValue(), element.getCityName()))).collect(Collectors.toList());
//        System.out.println(details);
    }
}
