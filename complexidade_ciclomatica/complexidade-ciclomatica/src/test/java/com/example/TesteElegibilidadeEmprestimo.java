package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TesteElegibilidadeEmprestimo {

    @Test
    public void testeMenorDeIdade() {
        assertEquals("Ineligível: Menor de idade", ElegibilidadeEmprestimo.avaliarElegibilidade(16, 30000, true));
    }

    @Test
    public void testeRendaBaixa() {
        assertEquals("Ineligível: Renda insuficiente", ElegibilidadeEmprestimo.avaliarElegibilidade(25, 15000, true));
    }

    @Test
    public void testeCreditoRuim() {
        assertEquals("Ineligível: Histórico de crédito ruim", ElegibilidadeEmprestimo.avaliarElegibilidade(25, 30000, false));
    }

    @Test
    public void testeElegivel() {
        assertEquals("Elegível", ElegibilidadeEmprestimo.avaliarElegibilidade(25, 30000, true));
    }
}
