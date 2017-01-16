package com.develogical.app;

public class QueryProcessor {
    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }

        else if (query.toLowerCase().contains("oxford")) {
            return "Oxford is a city in the South East region of England and the county town of Oxfordshire. With a population of 159,994!!";
        }
        //test

        return "";
    }
}
