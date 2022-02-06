package edu.eci.cvds.tdd.registry;

import java.util.*;

public class Registry {

    Set<Integer> registeredVotersIds = new HashSet<>();

    /**
     * Registration to votation, with the revision of the correct validations,
     * it returns the validation of the person.
     * 
     * @param p the person that wants to be registered
     * 
     * @return the validation of the person
     */

    public RegisterResult registerVoter(Person p) {
        RegisterResult valid = RegisterResult.VALID;
        if (registeredVotersIds.contains(p.getId())){
            valid = RegisterResult.DUPLICATED;
        }
        else if (p.getAge() == 0 || p.getAge() > 150){
            valid = RegisterResult.INVALID_AGE;
        }
        else if (p.getAge() < 18){
            valid = RegisterResult.UNDERAGE;
        }
        else if (!p.isAlive()){
            valid = RegisterResult.DEAD;
        }
        else{
            registeredVotersIds.add(p.getId());
        }
        return valid;
    }

    public String getVotersIds(){
        String voterIds = "";
        for (Integer id:registeredVotersIds){
            voterIds += id + " ";
        }
        return voterIds.strip();
    }
}