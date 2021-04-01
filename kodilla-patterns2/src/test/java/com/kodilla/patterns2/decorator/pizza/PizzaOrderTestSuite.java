package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void shouldAddCheese(){
        PizzaOrder  pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new CheesOrderDecorator(pizzaOrder);

        assertEquals(new BigDecimal(20), pizzaOrder.getCost());
        assertEquals("ciasto i sos pomidorowy z serem + dodatkowy ser", pizzaOrder.getDescription());
    }

    @Test
    public void shouldAddCheeseAndTomato(){
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new CheesOrderDecorator(pizzaOrder);
        pizzaOrder = new TomatoOrderDecorator(pizzaOrder);

        assertEquals(new BigDecimal(24), pizzaOrder.getCost());
        assertEquals("ciasto i sos pomidorowy z serem + dodatkowy ser + dodatkowe pomidory", pizzaOrder.getDescription());
    }

    @Test
    public void shouldAddOlivesAndCheese(){
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new OlivesOrderDecorator(pizzaOrder);
        pizzaOrder = new CheesOrderDecorator(pizzaOrder);

        assertEquals(new BigDecimal(26), pizzaOrder.getCost());
        assertEquals("ciasto i sos pomidorowy z serem + dodatkowe oliwki + dodatkowy ser", pizzaOrder.getDescription());
    }
}
