package com.schoolapp.schoolapp_backend.module;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum Groupe{ //Houses
    Hufflepuff("Hufflepuff", "Hufflepuff was one of the four Houses of Hogwarts School of Witchcraft and Wizardry. Its founder was the medieval witch Helga Hufflepuff. Hufflepuff was the most inclusive among the four houses, valuing hard work, dedication, patience, loyalty, and fair play rather than a particular aptitude in its members.", 
    "/assets/img/logo4.png"),
    Ravenclaw("Ravenclaw", "Rowena Ravenclaw, 'from glen', was the most brilliant witch of her time, but her story is one of tragedy. Known for her wit and love of learning, she wore a diadem that was said to grant wisdom to the wearer. ... After Helena was tragically killed, legend tells us that Rowena Ravenclaw died of a broken heart",
    "/assets/img/logo3.png"),
    Slytherin("Slytherin", "According to ancient legend, as told by History of Magic Professor Cuthbert Binns, Salazar Slytherin was responsible for the construction of the Chamber of Secrets beneath Hogwarts dungeons. It was specifically created for the purpose of purging the school of all Muggle-born students.",
    "/assets/img/logo1.png"), 
    Gryffindor("Gryffindor", "Gryffindor was one of the four Houses of Hogwarts School of Witchcraft and Wizardry and was founded by Godric Gryffindor. Gryffindor instructed the Sorting Hat to choose students possessing characteristics he most valued, such as courage, chivalry, and determination, to be sorted into his house.",
    "/assets/img/logo2.png");

    public String name;
    public String info; //description or historical information about the house
    public String image; //logo of the house

    private Groupe(String name, String info, String image){
        this.name = name;
        this.info = info;
        this.image = image;
    }
    
    public static final List<Groupe> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    /**
     * This method finds your house according the first letter of your parameter.
     * We need this method becouse the are TYPOS in the result of the API
     * @param name
     * @return
     */
    public static Groupe findHouseByName(String name){
        for (Groupe groupe : VALUES) {
            if(groupe.name.charAt(0) == name.toUpperCase().charAt(0)){
                return groupe;
            }
        }
        return null;
    }

    /**
     * Get a random house
     * @return
     */
    public static Groupe randomGroupe()  { // this method is not used yet.
        return VALUES.get(RANDOM.nextInt(SIZE));
    }
}