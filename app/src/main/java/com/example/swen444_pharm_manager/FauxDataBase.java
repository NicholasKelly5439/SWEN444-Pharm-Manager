package com.example.swen444_pharm_manager;

public class FauxDataBase {

    private static final FauxDataBase INSTANCE = new FauxDataBase();

    private FauxDataBase(){}

    public static FauxDataBase getInstance(){
        return INSTANCE;
    }

    
}
