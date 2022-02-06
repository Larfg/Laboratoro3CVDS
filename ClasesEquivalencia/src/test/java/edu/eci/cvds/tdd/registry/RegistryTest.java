package edu.eci.cvds.tdd.registry;

import org.junit.Assert;
import org.junit.Test;

public class RegistryTest {

    private Registry registry = new Registry();

    @Test
    public void validateRegistryResult() {

        Person person = new Person();

        RegisterResult result = registry.registerVoter(person);

        Assert.assertTrue(RegisterResult.VALID != result);
    }

    @Test
    public void validatePersonCreation(){
        Person person = new Person("Luis",1000713816,22,Gender.MALE,true);
        Assert.assertEquals(person.toString(),"Person [name=Luis, id=1000713816, age=22, gender=MALE, alive=true]");
    }

    @Test
    public void validatePersonModification(){
        Person person = new Person("Luis",1000713816,22,Gender.MALE,true);
        person.setName("Andrea");
        person.setId(1011232400);
        person.setAge(21);
        person.setGender(Gender.FEMALE);
        person.setAlive(false);
        Assert.assertEquals(person.toString(),"Person [name=Andrea, id=1011232400, age=21, gender=FEMALE, alive=false]");
    }
    @Test 
    public void invalidateRegistry(){
        registry = new Registry();
        Person person1 = new Person("Luis",1000713816,22,Gender.MALE,true);
        Person person2 = new Person("Pablo",1000713816,22,Gender.MALE,true);
        Person person3 = new Person("Juan",1000713817,17,Gender.MALE,true);
        Person person4 = new Person("Yu",1000713818,0,Gender.FEMALE,true);
        Person person5 = new Person("Juana",1000713819,170,Gender.FEMALE,true);
        Person person6 = new Person("Pedro",1000713810,25,Gender.MALE,false);
        RegisterResult result1 = registry.registerVoter(person1);
        RegisterResult result2 = registry.registerVoter(person2);
        RegisterResult result3 = registry.registerVoter(person3);
        RegisterResult result4 = registry.registerVoter(person4);
        RegisterResult result5 = registry.registerVoter(person5);
        RegisterResult result6 = registry.registerVoter(person6);
        Assert.assertEquals(RegisterResult.DUPLICATED,result2);
        Assert.assertEquals(RegisterResult.UNDERAGE,result3);
        Assert.assertEquals(RegisterResult.INVALID_AGE,result4);
        Assert.assertEquals(RegisterResult.INVALID_AGE,result5);
        Assert.assertEquals(RegisterResult.DEAD,result6);
    }

    @Test 
    public void validateRegistry(){
        registry = new Registry();
        Person person1 = new Person("Luis",1000713816,22,Gender.MALE,true);
        Person person2 = new Person("Pablo",1000713817,27,Gender.MALE,true);
        Person person3 = new Person("Juan",1000713818,19,Gender.MALE,true);
        RegisterResult result1 = registry.registerVoter(person1);
        RegisterResult result2 = registry.registerVoter(person2);
        RegisterResult result3 = registry.registerVoter(person3);
        Assert.assertEquals(RegisterResult.VALID,result1);
        Assert.assertEquals(RegisterResult.VALID,result2);
        Assert.assertEquals(RegisterResult.VALID,result3);
    }

    @Test 
    public void validateRegistries(){
        registry = new Registry();
        Person person1 = new Person("Luis",1000713816,22,Gender.MALE,true);
        Person person2 = new Person("Pablo",1000713817,27,Gender.MALE,true);
        Person person3 = new Person("Juan",1000713818,19,Gender.MALE,true);
        registry.registerVoter(person2);
        registry.registerVoter(person1);
        registry.registerVoter(person3);
        Assert.assertEquals(registry.getVotersIds(),"1000713817 1000713816 1000713818");
    }

    /** CLASES DE EQUIVALENCIA:
     *  1. Creacion correcta de persona
     *  2. Modificación correcta de persona
     *  3. Persona INVALIDA es invalida
     *  4. Persona Valida es valida
     *  5. Se registro un grupo exitoso de personas
     */


    // TODO Complete with more test cases
}