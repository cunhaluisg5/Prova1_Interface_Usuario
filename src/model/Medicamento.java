
package model;

import excecao.Excecao;

/**
 *
 * @author Luis Gustavo
 */
public class Medicamento {
    private String codigoBarra;
    private String nome;
    private String laboratorio;
    private double valorUnitario;
    private String composicao;
    private String tipo;
    private int quantidadeEstoque;
    private String localizacao;

    public Medicamento() {
    }

    public Medicamento(String codigoBarra, String nome, String laboratorio, double valorUnitario, String composicao, String tipo, int quantidadeEstoque, String localizacao) {
        this.codigoBarra = codigoBarra;
        this.nome = nome;
        this.laboratorio = laboratorio;
        this.valorUnitario = valorUnitario;
        this.composicao = composicao;
        this.tipo = tipo;
        this.quantidadeEstoque = quantidadeEstoque;
        this.localizacao = localizacao;
    }

    public String getCodigoBarra() {
        return codigoBarra;
    }

    public void setCodigoBarra(String codigoBarra) {
        this.codigoBarra = codigoBarra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public String getComposicao() {
        return composicao;
    }

    public void setComposicao(String composicao) {
        this.composicao = composicao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    
    public void locar(int quantidade) throws Excecao{
        
        if (quantidade <= quantidadeEstoque) {
            int qtd = quantidadeEstoque - quantidade;
            if((qtd > 0) && (qtd < quantidadeEstoque)){
                quantidadeEstoque = qtd;
            }else{
                throw new Excecao("A quantidade em estoque não pode ser zerada!");
            }                        
        }else{
            throw new Excecao("A quantidade não pode ser maior que o estoque!");
        }        
    }
    
    public double calcularVatorTotalVenda(int quantidade){
        return quantidade * valorUnitario;
    }
}
