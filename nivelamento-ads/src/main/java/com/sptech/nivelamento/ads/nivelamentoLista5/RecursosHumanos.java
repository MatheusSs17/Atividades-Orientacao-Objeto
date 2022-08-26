
package com.sptech.nivelamento.ads.nivelamentoLista5;


public class RecursosHumanos {
    private Integer totalDePromovidos;
    private Integer totalDeSalariosAjustados;

    public Integer getTotalDePromovidos() {
        return totalDePromovidos;
    }

    public RecursosHumanos() {
        this.totalDePromovidos = 0;
        this.totalDeSalariosAjustados = 0;
    }

    public void setTotalDePromovidos(Integer totalDePromovidos) {
        this.totalDePromovidos = totalDePromovidos;
    }

    public Integer getTotalDeSalariosAjustados() {
        return totalDeSalariosAjustados;
    }

    public void setTotalDeSalariosAjustados(Integer totalDeSalariosAjustados) {
        this.totalDeSalariosAjustados = totalDeSalariosAjustados;
    }
    
    void reajustarSalario(Colaborador colaborador, Double valorDoReajuste) {
        
        Double novoSalario = colaborador.getSalario() + valorDoReajuste;
        colaborador.setSalario(novoSalario);
        this.totalDeSalariosAjustados++;
    }
    
    void promoverColaborador(Colaborador colaborador, String novoCargo,
            Double novoSalario){
        
        
        System.out.println("\nTentando promover\n\n");
        if (colaborador.getSalario() < novoSalario) {
            colaborador.setCargo(novoCargo);
            colaborador.setSalario(novoSalario);
            this.totalDePromovidos++;
            System.out.println("\nPromovido\n\n");
        } else {
            System.out.println("\nNão promova pagando menos (‡▼益▼)\n\n");
        }
    }

    @Override
    public String toString() {
        String frase = String.format("\nRelatório do RH\n"
                + "Total de Promovidos: %d.\t"
                + "Total de Salários Reajustados: %d\n\n",
                this.totalDePromovidos, this.totalDeSalariosAjustados);
        return frase;
    }
}
