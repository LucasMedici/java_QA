package com.example;

public class ProductAvailability {
    
    public static String verificarDisponibilidade(String regiao, String metodoPagamento, String statusUsuario) {
        if (regiao.equals("América do Norte") && metodoPagamento.equals("Cartão de Crédito") && statusUsuario.equals("Membro")) {
            return "Produto disponível";
        } else if (regiao.equals("América do Norte") && metodoPagamento.equals("PayPal") && statusUsuario.equals("Não-membro")) {
            return "Produto disponível com restrições";
        } else if (regiao.equals("Europa") && metodoPagamento.equals("Cartão de Crédito") && statusUsuario.equals("Não-membro")) {
            return "Produto não disponível";
        } else if (regiao.equals("Europa") && metodoPagamento.equals("PayPal") && statusUsuario.equals("Membro")) {
            return "Produto disponível com vantagens para membros";
        } else {
            return "Condição não testada";
        }
    }
}
