package com.schoolapp.schoolapp_backend.module;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum MagicWand{
    DragonHeartstring("Dragon heartstring", "Dragon heartstring was a material from a dragon that could be used in the core of a wand. It is unknown from which varieties of dragon the heartstrings were collected, and what effect this difference made on the attributes of the wand, if any. Since the heart was a vital organ in all creatures, it can be assumed that the material was taken after the dragon had either died of natural causes or been killed. It is also unknown what quantity of heartstrings could be collected from each dragon's heart."),
    PhoenixFeather("Phoenix feather", "Phoenix feathers were feathers shed by phoenixes, primarily gathered and used in wandmaking. Phoenix feather was one of the three supreme core types. It was one of the rarest cores, with the greatest power range and whose allegiance is hard won"),
    UnicornHair("Unicorn hair", "Unicorn hair was a powerful magical substance with a variety of uses, originating on the body of a unicorn. It could be used as the core of wands. It was frequently shed from the creature."),
    VeelaHair("Veela hair", "Veela hair was a material from the head of a Veela that could be used to comprise the core of a wand."),
    TrollWhisker("Troll whisker", "Troll whiskers were the facial hairs of trolls. A magical substance, they could be used as wand cores, though in modern times it was considered an inferior substance to Garrick Ollivander's three Supreme Cores. The wand of Sir Cadogan was rumoured to have contained a troll whisker core."),
    HornedSerpentHorn("Horned Serpent horn", "This core was exceptionally powerful, sensitive to Parseltongue and vibrated when Parseltounge was being spoken, and could warn their owners of danger by emitting a low musical tone.");

    public String name;
    public String description; //Basic description of the magic wand

    private MagicWand(String name, String description){
        this.name = name;
        this.description = description;
    }

    private static final List<MagicWand> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    /**
     * Get a random magic wand
     * @return
     */
    public static MagicWand randomWand()  {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }
    
}