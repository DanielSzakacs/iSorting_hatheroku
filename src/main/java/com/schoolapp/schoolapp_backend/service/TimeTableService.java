package com.schoolapp.schoolapp_backend.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

import com.schoolapp.schoolapp_backend.module.Day;


/**
 * Not a real service. At the moment is used only to get random timeTable
 */
public class TimeTableService {
    // list of class what is evaliable in the school.
    private List<String> listOfClass = Arrays.asList("", "", "", "Astronomy", "Charms", "Dark Arts", "History of Magic", "Potions", "Transfiguration", 
    "Arithmancy", "Divination", "Muggle studies", "Ancient Runes", "Defence Against the Dark Arts", "Alchemy", "Apparition", "Art", 
    "Flying", "Ghoul Studies", "Magic Theory", "Muggle Art", "Muggle Music", "Xylomancy"); //TODO should be in the DB not in a random list.. 

    public Map<Day, List<String>>getRandomTimeTable(){
        List<Day> lisOfDays = Day.VALUES;
        SortedMap<Day, List<String>> timeTable = new TreeMap(); //Make sure its always SortedMap. Order is important
        for (Day day : lisOfDays) {
            if(day == Day.SATURDAY || day == Day.SUNDAY){
                timeTable.put(day, new ArrayList<>()); 
                continue;
            } 
            List<String> classOfOneDay = getRandomClass(7);
            timeTable.put(day, classOfOneDay);
        }
        return timeTable;
    }
    
    private List<String> getRandomClass(int numberOfRundomClass){
        int max = this.listOfClass.size();
        List<String> listOfRandomClass = new ArrayList<>();
        for (int i = 0; i < numberOfRundomClass; i++) {
            int randomNumber = (int) ((Math.random() * max));
            listOfRandomClass.add(listOfClass.get(randomNumber));
        }
        
        return listOfRandomClass;
    }
}
