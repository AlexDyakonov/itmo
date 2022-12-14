package ru.ifmo.se.lab2.objects;

public abstract class Madeable{
    private String material;

    public Madeable(Mineable m){
        this.material = m.toString();    
    }

    public String getMaterial(){
        return " из" + this.material;
    }

    public String canBeMadeOutOf(){
        return " можно сделать" + toString();
    }

    @Override
    public int hashCode(){
        String stringToHash = this.getClass().getSimpleName() + this.material;
        return stringToHash.hashCode()
    }

    @Override 
    public boolean equals(Madeable m){
        return hashCode() == m.hashCode()
    }
} 