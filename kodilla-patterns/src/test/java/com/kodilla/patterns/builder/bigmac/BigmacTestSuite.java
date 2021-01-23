package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacBuilder(){
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .burgers(2)
                .sauce("standard")
                .ingredients("sałata")
                .ingredients("cebula")
                .roll("with sezam")
                .build();

        Assertions.assertEquals(2,bigmac.getBurgers());
        Assertions.assertEquals(2,bigmac.getIngredients().size());
        Assertions.assertEquals("with sezam",bigmac.getRoll());
        Assertions.assertEquals("standard",bigmac.getSauce());
    }

    @Test
    public void testBigmacBuilderThrowsExceptionSauce(){
        Assertions.assertThrows(IllegalStateException.class,()->new Bigmac.BigmacBuilder()
                .burgers(2)
                .sauce("st")
                .bun()
                .build());
    }

    @Test
    public void testBigmacBuilderSauce(){
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .burgers(2)
                .sauce("standard")
                .ingredients("sałata")
                .bun()
                .build();

        Assertions.assertEquals("standard", bigmac.getSauce());
    }

    @Test
    public void testBigmacBuilderThrowsExceptionIngredients(){
        Assertions.assertThrows(IllegalStateException.class,()->new Bigmac.BigmacBuilder()
                .burgers(2)
                .ingredients("sałat")
                .bun()
                .build());
    }

    @Test
    public void testBigmacBuilderIngredient(){
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .burgers(2)
                .sauce("standard")
                .ingredients("cebula")
                .bun()
                .build();

        Assertions.assertEquals("cebula", bigmac.getIngredients().get(0));
    }

    @Test
    public void testBigmacBuilderThrowsExceptionRoll(){
        Assertions.assertThrows(IllegalStateException.class,()->new Bigmac.BigmacBuilder()
                .burgers(2)
                .roll("with")
                .bun()
                .build());
    }

    @Test
    public void testBigmacBuilderRoll(){
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .burgers(2)
                .roll("with sezam")
                .sauce("standard")
                .ingredients("sałata")
                .build();

        Assertions.assertEquals("with sezam", bigmac.getRoll());
    }

    @Test
    public void testBigmacBuilderThrowsExceptionBurgers(){
        Assertions.assertThrows(IllegalStateException.class,()->new Bigmac.BigmacBuilder()
                .burgers(0)
                .roll("with sezam")
                .sauce("standard")
                .ingredients("sałata")
                .build());
    }

    @Test
    public void testBigmacBuilderThrowsExceptionRollBun(){
        Assertions.assertThrows(IllegalStateException.class,()->new Bigmac.BigmacBuilder()
                .burgers(2)
                .sauce("standard")
                .ingredients("sałata")
                .build());
    }

    @Test
    public void testBigmacBuilderThrowsExceptionRollBunBothExist(){
        Assertions.assertThrows(IllegalStateException.class,()->new Bigmac.BigmacBuilder()
                .burgers(2)
                .bun()
                .roll("with sezam")
                .sauce("standard")
                .ingredients("sałata")
                .build());
    }

    @Test
    public void testBigmacBuilderThrowsExceptionIngredientNull(){
        Assertions.assertThrows(IllegalStateException.class,()->new Bigmac.BigmacBuilder()
                .burgers(2)
                .roll("with sezam")
                .sauce("standard")
                .build());
    }
}
