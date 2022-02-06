package edu.eci.cvds.tdd.registry;

import org.junit.Assert;
import org.junit.Test;

public class RegistryTest {

    private Registry registry = new Registry();

    @Test
    public void validateRegistryResult() {

        Person person = new Person();

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.VALID, result);
    }

    /** CLASES DE EQUIVALENCIA:
     *  1. Creacion correcta de persona
     *  2. Modificación correcta de persona
     *  3. Persona INVALIDA es invalida
     *  4. Persona Valida es valida
     *  5. Solo se permite una inscripción por numero de documento
     */
    

    // TODO Complete with more test cases
}