package ru.ifmo.se.pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Pokemon;

public class Confide extends StatusMove{
    public Confide(){
        super(Type.NORMAL, 0, 0);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.SPECIAL_ATTACK, -1);
    }

    @Override
    protected String describe(){
        return "использует Confide";
    }
}