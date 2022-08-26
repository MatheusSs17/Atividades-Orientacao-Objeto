
package com.sptech.nivelamento.ads.nivelamentoLista6;


public class Planejamento {
    private String atividade;
    private String responsavel;
    private Integer diasEstimados;
    private Integer diasUsados;

    public String getAtividade() {
        return atividade;
    }

    public void setAtividade(String atividade) {
        this.atividade = atividade;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public Integer getDiasEstimados() {
        return diasEstimados;
    }

    public void setDiasEstimados(Integer diasEstimados) {
        this.diasEstimados = diasEstimados;
    }

    public Integer getDiasUsados() {
        return diasUsados;
    }

    public void setDiasUsados(Integer diasUsados) {
        this.diasUsados = diasUsados;
    }

    public Planejamento(String atividade, String responsavel, Integer diasEstimados) {
        this.atividade = atividade;
        this.responsavel = responsavel;
        this.diasEstimados = diasEstimados;
        this.diasUsados = 0;
    }
    
    public void terminarAtividade(Integer diasUsados) {
        this.diasUsados += diasUsados;
    }
    
    public String calcularTempo() {
        String frase = null;
        if (diasUsados > diasEstimados) {
            frase = String.format
            ("Você estimou %d dias, mas a tarefa foi feita em %d "
            + "dias (%d dias a mais que o estimado).\n"
            + "Melhore a estimativa", diasEstimados, diasUsados, 
            diasUsados - diasEstimados);
        } else if (diasEstimados > diasUsados){
            frase = String.format
            ("Você estimou %d dias, e a tarefa foi feita em %d "
            + "dias (%d dias a menos que o estimado).\n"
            + "Parabéns!", diasEstimados, diasUsados, 
            diasEstimados - diasUsados);
        } else {
            frase = String.format
            ("Você estimou %d dias, e a tarefa foi feita em %d "
            +"dias, atendendo a estimativa com precissão."
            ,diasEstimados, diasUsados);
        }
        return frase;
    }

    @Override
    public String toString() {
        String frase = String.format("Planejamento:\n"
                + "Atividade: %s\t"
                + "Responsável: %s\n"
                + "Dias estimados: %d\t"
                + "Dias Usados: %d", 
                atividade, responsavel, diasEstimados, diasUsados);
        return frase;
    }
    
    
}
