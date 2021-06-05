package Countries;

import Money.China;
import Money.Currency;
import Money.Swiss;
import Money.US;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    ArrayList<Integer> removedId=new ArrayList<>();
    HashMap<Integer,Currency> hashMap=new HashMap<>();
    int areaID=0;
    public void addCountry(Currency country){
        if(!(country instanceof Swiss || country instanceof China || country instanceof US) ){
            System.out.println("Enter valid Countrysss");
        }else if(hashMap.containsValue(country)){
            System.out.println("Country already exists");
        }
        else {
            areaID++;
            hashMap.put(areaID, country);
            System.out.println(hashMap);
        }
    }
    public void removeCountry(int areaId){
        if(areaId<=0|| areaId>areaID){
            System.out.println("Enter properly");
        }else if(removedId.contains(areaId)){
            System.out.println("Area has already been removed");
        }else {
            hashMap.remove(areaId);
            removedId.add(areaId);
            System.out.println(hashMap);
        }
    }
    public Currency getCurrency (int areaId){
         if(removedId.contains(areaId)) {
            throw new IllegalArgumentException("The country has been removed");
        }
        else if(areaId<=0 || areaId>areaID){
            throw new IllegalArgumentException("Enter a valid Country");
        }
        return hashMap.get(areaId);
    }
    public void change(int areaID){
        Currency currency=getCurrency(areaID);
        if(currency instanceof China){
            System.out.println("Value in swissFranc is "+((currency).SwissFranc()));
            System.out.println("Value in Dollars is "+(( currency).Dollars()));
        }else if(currency instanceof Swiss){
            System.out.println("Value in Dollars is "+ (( currency).Dollars()));
            System.out.println("Value in YEN is "+ (( currency).Yen()));
        }else if(currency instanceof US){
            System.out.println("Value in YEN is "+(( currency).Yen()));
            System.out.println("Value in Swiss Franc is "+(( currency).SwissFranc()));
        }
    }

}
