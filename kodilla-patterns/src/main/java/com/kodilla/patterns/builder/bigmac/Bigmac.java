package com.kodilla.patterns.builder.bigmac;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bigmac {
    private int burgers;
    private String roll;
    private String bun;
    private String sauce;
    private List<String> ingredients;

    private Bigmac(int burgers, String roll, String bun, String sauce, List<String> ingredients) {
        this.burgers = burgers;
        this.roll = roll;
        this.bun = bun;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getRoll() {
        return roll;
    }

    public String getBun() {
        return bun;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    static class BigmacBuilder {
        private int burgers;
        private String roll;
        private String bun;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder burgers(int number) {
            burgers = number;
            return this;
        }

        public BigmacBuilder bun() {
            bun = "bun";
            return this;
        }

        public BigmacBuilder roll(String sezam) {
            roll = sezam;
            return this;
        }

        public BigmacBuilder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigmacBuilder ingredients(String ingredient) {
            List<String> ingredientsList = Arrays.asList("sałata", "cebula", "bekon", "ogórek", "papryczki", "chilli",
                    "pieczarki", "krewetki", "ser");
            if (!ingredientsList.contains(ingredient)) {
                throw new IllegalStateException("allowed ingredients: " + ingredientsList.toString());
            }
            this.ingredients.add(ingredient);
            return this;
        }

        public Bigmac build() {
            List<String> rollList = Arrays.asList("with sezam", "without sezam");
            List<String> sauseList = Arrays.asList("standard", "1000 wysp", "barbecue");

            if (burgers == 0) {
                throw new IllegalStateException("too less burgers");
            }
            if ((roll != null && bun != null) || (roll == null && bun == null)) {
                throw new IllegalStateException("cannot be both roll and bun");
            }
            if (roll != null) {
                if (!rollList.contains(roll)) {
                    throw new IllegalStateException("Roll only with " + rollList.toString());
                }
            } if (ingredients.size()==0){
                throw new IllegalStateException("Not provided ingredients");
            }
            if (!sauseList.contains(sauce)) {
                throw new IllegalStateException("only allowed sauses: " + sauseList.toString());
            }
            return new Bigmac(burgers, this.roll, this.bun, this.sauce, this.ingredients);
        }

    }

}

