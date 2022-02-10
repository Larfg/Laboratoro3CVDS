package edu.eci.cvds.tdd.aerodescuentos;
import org.junit.Assert;
import org.junit.Test;

public class TarifasTest{
	
    @Test
    public void validateDiasAntelacion1(){
        double tarifaBase = 500000;
        int diasAntelacion = 19;
        int edad = 20;
        double result = CalculadorDescuentos.calculoTarifa(tarifaBase, diasAntelacion, edad);
		Assert.assertEquals(500000,result,0);
    }

    @Test
    public void validateDiasAntelacion2(){
        double tarifaBase = 500000;
        int diasAntelacion = 20;
        int edad = 20;
        double result = CalculadorDescuentos.calculoTarifa(tarifaBase, diasAntelacion, edad);
        Assert.assertEquals(425000,result,0);
    }

    @Test
    public void validateDiasAntelacion3(){
        double tarifaBase = 600000;
        int diasAntelacion = 21;
        int edad = 20;
        double result = CalculadorDescuentos.calculoTarifa(tarifaBase, diasAntelacion, edad);
        Assert.assertEquals(510000,result,0);
    }

    @Test
    public void validateEdadInferior1(){
        double tarifaBase = 500000;
        int diasAntelacion = 10;
        int edad = 17;
        double result = CalculadorDescuentos.calculoTarifa(tarifaBase, diasAntelacion, edad);
        Assert.assertEquals(475000,result,0);
    }

    @Test
    public void validateEdadInferior2(){
        double tarifaBase = 600000;
        int diasAntelacion = 12;
        int edad = 18;
        double result = CalculadorDescuentos.calculoTarifa(tarifaBase, diasAntelacion, edad);
        Assert.assertEquals(570000,result,0);
    }

    @Test
    public void validateEdadInferior3(){
        double tarifaBase = 700000;
        int diasAntelacion = 15;
        int edad = 19;
        double result = CalculadorDescuentos.calculoTarifa(tarifaBase, diasAntelacion, edad);
        Assert.assertEquals(700000,result,0);
    }

    @Test
    public void validateEdadSuperior1(){
        double tarifaBase = 500000;
        int diasAntelacion = 17;
        int edad = 64;
        double result = CalculadorDescuentos.calculoTarifa(tarifaBase, diasAntelacion, edad);
        Assert.assertEquals(500000,result,0);
    }

    @Test
    public void validateEdadSuperior2(){
        double tarifaBase = 600000;
        int diasAntelacion = 18;
        int edad = 65;
        double result = CalculadorDescuentos.calculoTarifa(tarifaBase, diasAntelacion, edad);
        Assert.assertEquals(552000,result,0);
    }

    @Test
    public void validateEdadSuperior3(){
        double tarifaBase = 700000;
        int diasAntelacion = 15;
        int edad = 66;
        double result = CalculadorDescuentos.calculoTarifa(tarifaBase, diasAntelacion, edad);
        Assert.assertEquals(644000,result,0);
    }
	
	@Test
    public void validateEdadyDiaAntelacion1(){
        double tarifaBase = 700000;
        int diasAntelacion = 22;
        int edad = 66;
        double result = CalculadorDescuentos.calculoTarifa(tarifaBase, diasAntelacion, edad);
        Assert.assertEquals(539000,result,0);
    }
	
	@Test
    public void validateEdadyDiaAntelacion1(){
        double tarifaBase = 700000;
        int diasAntelacion = 27;
        int edad = 12;
        double result = CalculadorDescuentos.calculoTarifa(tarifaBase, diasAntelacion, edad);
        Assert.assertEquals(560000,result,0);
    }
}
