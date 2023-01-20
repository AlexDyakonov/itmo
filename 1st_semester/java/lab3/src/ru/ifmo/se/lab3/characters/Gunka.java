package ru.ifmo.se.lab3.characters;

public class Gunka extends PersonWithEmotions{
    @Override
    public String toString(){
        return " Гунька";
    }

    public String playPrigalki(Person p, int amountOfPlayers){
        return toString() + " играть в прыгалки с " + Integer.toString(amountOfPlayers) + p.toString();
    }
}