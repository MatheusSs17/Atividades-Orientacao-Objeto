
package com.sptech.nivelamento.ads.nivelamentoLista4;

public class Termometro {
    
    Double temperaturaAtual;
    Double temperaturaMax;
    Double temperaturaMin;
    
    public Termometro(Double temperaturaAtual, Double temperaturaMax, Double temperaturaMin) {
        this.temperaturaAtual = temperaturaAtual;
        this.temperaturaMax = temperaturaMax;
        this.temperaturaMin = temperaturaMin;
    }
    
    void aumentaTemperatura(Double temperaturaParaAumentar){
        
        temperaturaAtual += temperaturaParaAumentar;
        
        if (temperaturaAtual > temperaturaMax) {
            temperaturaMax = temperaturaAtual;
        }
    }
    
    void diminuiTemperatura(Double temperaturaParaDiminuir){
        
        temperaturaAtual -= temperaturaParaDiminuir;
        
        if (temperaturaAtual < temperaturaMin) {
            temperaturaMin = temperaturaAtual;
        }
    }
    
    void exibeFahreinheit(Double temperaturaAtual){
        Double fahreinheit =  (temperaturaAtual * 9 / 5) + 32;
        String frase = String.format("Em celsius a temperatura é: "
                + "%.1f °C \nEm Fahreinheit a temperatura é: %.1f °F",
                temperaturaAtual, fahreinheit);
        System.out.println(frase);
    }

    @Override
    public String toString() {
        return "Termometro{" + "temperaturaAtual=" + temperaturaAtual + ", temperaturaMax=" + temperaturaMax + ", temperaturaMin=" + temperaturaMin + '}';
    }
    
    
}
