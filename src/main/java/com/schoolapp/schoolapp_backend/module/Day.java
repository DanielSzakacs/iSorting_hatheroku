package com.schoolapp.schoolapp_backend.module;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum Day {    
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    public static final List<Day> VALUES = Collections.unmodifiableList(Arrays.asList(values()));

}
