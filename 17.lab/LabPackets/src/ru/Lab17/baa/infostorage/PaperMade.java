package ru.Lab17.baa.infostorage;


import ru.Lab17.baa.InfoStorage;

public class PaperMade extends InfoStorage {
    
    public void Save() {
        System.out.println(this.getClass().getSimpleName());
    }
    
}