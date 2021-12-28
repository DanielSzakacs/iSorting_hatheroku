package com.schoolapp.schoolapp_backend.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONArray;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.schoolapp.schoolapp_backend.module.Groupe;
import com.schoolapp.schoolapp_backend.module.Student;
import com.schoolapp.schoolapp_backend.module.Teacher;
import com.schoolapp.schoolapp_backend.module.MagicWand;


@Service
public class SetupService {
    
    @Autowired
    private StudentService studentService;

    @Autowired
    private TeacherService teacherService;

    public void setUpDatabase() {
        saveTeachers();
        saveStudents();
    }

    /**
     * Save defolut teachers to our local DB.
     * This method is used only once, in the very beginning
     */
    private void saveTeachers(){
        //Teachers
        List<Teacher> teachers = Arrays.asList(
            new Teacher("Albus Dumbledore", "Headmaster", "The Headmaster of Hogwarts since a few decades before the creation of The Order of the Phoenix. He was awarded many titles, most of which were removed by Minister for Magic Cornelius Fudge after he accused Dumbledore of conspiring to take over the Ministry.", 
                "https://images.ctfassets.net/usf1vwtuqyxm/1dmmUJzpRcWaUmMOCu8QwO/7e013145694566076d47fd004fd604c2/AlbusDumbledore_WB_F6_DumbledoreSittingInChair_Promo_080615_Port.jpg?w=1200&fit=fill&f=top"),
            new Teacher("Alastor Moody", "Defence Against the Dark Arts", "Alastor \"Mad-Eye\" Moody is a former Auror. His profession has apparently been rather hard on him, as he has a wooden leg, a magical artificial eye, and a large chunk taken out of his nose. ... His nickname is derived from his magical eye, which is forever swiveling, totally independently of his real eye.", 
            "https://moly.hu/system/node_items/494/image_normal.jpg?1343942965"),
            new Teacher("Argus Filch", "Caretaker", "Argus Filch was a Squib and the caretaker of Hogwarts School of Witchcraft and Wizardry since around 1973. Filch usually wandered around the school corridors with his cat Mrs Norris, trying to catch students breaking the school rules and complaining about Peeves the Poltergeist.",
            "https://static.wixstatic.com/media/5ce9a0_4fe057dcf67041bba875d5a70e2d6ea9~mv2_d_1200_1706_s_2.jpg/v1/fill/w_320,h_476,al_c,q_80,usm_0.66_1.00_0.01/WB_F4_ArgusFilch_FilchStoodInCorridor_C3.webp"),
            new Teacher("Aurora Sinistra", "Astronomy", "", "https://www.hp-lexicon.org/wp-content/uploads/2015/08/aurora_sinistra_by_la_petit_marianna-d9b5o5h.jpg"),
            new Teacher("Dolores Umbridge", "Defence Against the Dark Arts", "Madam Dolores Jane Umbridge (b. 26 August, 1961 or earlier) was a half-blood witch and a British Ministry of Magic bureaucrat who served as Senior Undersecretary to the Minister for Magic under Ministers Cornelius Fudge, Rufus Scrimgeour, and Pius Thicknesse.",
            "https://moly.hu/system/node_items/339/image_normal.jpg?1343681907"),
            new Teacher("Filius Flitwick", "Charms", "Filius Flitwick is the Charms professor at Hogwarts School of Witchcraft and Wizardry. He is also Head of Ravenclaw House. He is described as a tiny little wizard who had to stand on a pile of books to see over his desk",
            "https://hu.garynevillegasm.com/images/iskusstvo-i-razvlecheniya/kto-takoj-filius-flitvik_2.jpg"),
            new Teacher("Firenze", "Divination", "Firenze was a centaur, part of the Forbidden Forest Centaur colony, and one of two Divination teachers at Hogwarts School of Witchcraft and Wizardry from 1996 to 1998.", 
            "https://www.hp-lexicon.org/wp-content/uploads/2016/05/firenze.jpg"),
            new Teacher("Gilderoy Lockhart", "Defence Against the Dark Arts", "He loses his own memory when a spell backfires on him and is subsequently hospitalised for long-term care.", 
            "https://img.wattpad.com/2d791022238afe7876c047fbdca6e89699cc7532/68747470733a2f2f73332e616d617a6f6e6177732e636f6d2f776174747061642d6d656469612d736572766963652f53746f7279496d6167652f4934523473755679782d4e6267413d3d2d3132332e313538363937633862633162343862643236333034343037383630302e6a7067?s=fit&w=720&h=720"),
            new Teacher("Minerva McGonagall", "Transfiguration teacher and Deputy Headmistress", "Minerva McGonagall is the deputy headmistress, head of Gryffindor house and Transfiguration professor at Hogwarts School of Witchcraft and Wizardry. A tall, stern-looking witch with black hair usually drawn into a tight bun, few students dare cross her; she is an imposing figure who can quickly spot trouble. Professor McGonagall can also transform at will into a tabby cat, distinguishable by spectacle markings around the eyes.", 
            "https://qph.fs.quoracdn.net/main-qimg-ebd537732598290fe1df93d9c634a468"),
            new Teacher("Pomona Sprout", "Herbology", "Professor Pomona Sprout (b. 15 May) was a witch who worked as Head of Hufflepuff House and Head of the Herbology department at Hogwarts School of Witchcraft and Wizardry. She attended the school in her youth, where she was Sorted into Hufflepuff and excelled at Herbology.",
            "http://images6.fanpop.com/image/photos/34800000/Professor-Sprout-pomona-sprout-34821694-250-250.jpg"),
            new Teacher("Poppy Pomfrey", "Matron", "Madam Poppy Pomfrey was a British witch and the matron at Hogwarts School of Witchcraft and Wizardry.", 
            "https://pbs.twimg.com/profile_images/1825386024/Poppy_Pomfrey_400x400.jpg"),
            new Teacher("Rubeus Hagrid", "Care of Magical Creatures / Grounds Keeper", "Gatekeeper and Professor of Care of Magical Creatures.",
            "https://moly.hu/system/node_items/140/image_normal.jpg?1343507064")
            );
        this.teacherService.saveAllTeacher(teachers);
    }

    /**
     * Save defolut student from the api to our local DB.
     * This method is used only once, in the very beginning
     */
    private void saveStudents(){
        String studentJson = getPostsPlainJSON("http://hp-api.herokuapp.com/api/characters/students"); //teachers api
        try {
            List<Student> listOfStudents = new ArrayList<>(); // list for all student whose profile is reade to save in to the DB
            JSONArray jsonArray = new JSONArray(studentJson);
            for (int index = 0; index < jsonArray.length(); index++) {
                try{
                    Student student = new Student();

                    student.setName(jsonArray.getJSONObject(index).get("name").toString());

                    // Date of born
                    String dateOfBorn = jsonArray.getJSONObject(index).get("dateOfBirth").toString();
                    student.setDateOfBorn(dateOfBorn.isEmpty() ? "N/A" : dateOfBorn);
                    student.setYearOfBorn(jsonArray.getJSONObject(index).get("yearOfBirth").toString());

                    //Image
                    String imagePath = jsonArray.getJSONObject(index).get("image").toString();
                    if(!imagePath.isEmpty()){
                        student.setImage(imagePath);
                    }else{
                        continue; // Keep this else part. If there is not usePhone then we dont want this user to our DB
                    }
                
                    //House
                    String houseName = jsonArray.getJSONObject(index).get("house").toString();
                    if(!houseName.isEmpty()){
                        Groupe house = Groupe.findHouseByName(houseName); //use this method bc there are typos in the api result
                        if(house != null){
                            student.setGroupe(house);
                        }
                    }
                    //Magic wand
                    student.setMagicWand(MagicWand.randomWand());

                    //Ancestry
                    String ancestry = jsonArray.getJSONObject(index).get("ancestry").toString();
                    student.setAncestry(ancestry.isEmpty() ? "Unknown" : ancestry);

                    listOfStudents.add(student);
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
            this.studentService.saveAllNewStudent(listOfStudents); //save all the students in onces .
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }


    private final RestTemplate restTemplate;

    public SetupService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public String getPostsPlainJSON(String url) {
        return this.restTemplate.getForObject(url, String.class);
    }
}
