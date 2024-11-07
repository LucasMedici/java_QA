package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class anoBissextoTest {

    // Teste para ano não divisível por 4 (não bissexto)
    @Test
    public void testeAnoNaoDivisivelPor4() {
        assertFalse(anoBissexto.isBissexto(2019));
    }

    // Teste para ano divisível por 4, mas não por 100 (bissexto)
    @Test
    public void testeAnoDivisivelPor4NaoPor100() {
        assertTrue(anoBissexto.isBissexto(2020));
    }

    // Teste para ano divisível por 100, mas não por 400 (não bissexto)
    @Test
    public void testeAnoDivisivelPor100NaoPor400() {
        assertFalse(anoBissexto.isBissexto(1900));
    }

    // Teste para ano divisível por 400 (bissexto)
    @Test
    public void testeAnoDivisivelPor400() {
        assertTrue(anoBissexto.isBissexto(2000));
    }
}
