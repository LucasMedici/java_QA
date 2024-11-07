// ProductAvailabilityTest.java
package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductAvailabilityTest {

    @Test
    public void testNorthAmericaCreditMember() {
        String resultado = ProductAvailability.verificarDisponibilidade("América do Norte", "Cartão de Crédito", "Membro");
        assertEquals("Produto disponível", resultado);
    }

    @Test
    public void testNorthAmericaPaypalNonMember() {
        String resultado = ProductAvailability.verificarDisponibilidade("América do Norte", "PayPal", "Não-membro");
        assertEquals("Produto disponível com restrições", resultado);
    }

    @Test
    public void testEuropeCreditNonMember() {
        String resultado = ProductAvailability.verificarDisponibilidade("Europa", "Cartão de Crédito", "Não-membro");
        assertEquals("Produto não disponível", resultado);
    }

    @Test
    public void testEuropePaypalMember() {
        String resultado = ProductAvailability.verificarDisponibilidade("Europa", "PayPal", "Membro");
        assertEquals("Produto disponível com vantagens para membros", resultado);
    }
}
