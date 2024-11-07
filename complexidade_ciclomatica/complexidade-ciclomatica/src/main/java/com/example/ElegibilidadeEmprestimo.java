package com.example;

public class ElegibilidadeEmprestimo {

    public static String avaliarElegibilidade(int idade, double renda, boolean temCreditoBom) {
        if (idade < 18) {
            return "Ineligível: Menor de idade";
        } else if (renda < 20000) {
            return "Ineligível: Renda insuficiente";
        } else if (!temCreditoBom) {
            return "Ineligível: Histórico de crédito ruim";
        } else {
            return "Elegível";
        }
    }
}
