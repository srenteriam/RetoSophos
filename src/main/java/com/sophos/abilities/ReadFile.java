package com.sophos.abilities;


import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Ability;
import net.serenitybdd.screenplay.Actor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class ReadFile implements Ability {
    public static ReadFile as(Actor actor) {
        return actor.abilityTo(ReadFile.class);
    }

    private DataTable dt;

    public static String[] getData() throws IOException {
        String fileTXT = "";
        try {
            BufferedReader bf = new BufferedReader(new FileReader("src/credenciales.txt"));
            String temp = "";
            String bfRead;
            while ((bfRead = bf.readLine()) != null) {
                temp = temp + bfRead;
            }
            fileTXT = temp;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String[] data = fileTXT.split(",");
        return data;
    }
}

