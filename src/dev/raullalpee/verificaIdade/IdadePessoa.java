package dev.raullalpee.verificaIdade;

public class IdadePessoa {
    private String nomePessoa;
    private int idade;
    private String tipoDeConta;
    public int escolha;

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public String getTipoDeConta() {
        return tipoDeConta;
    }

    public void setTipoDeConta(String tipoDeConta) {
        this.tipoDeConta = tipoDeConta;
    }

    public void verificarIdade() {
        if (idade >= 18) {
            System.out.println("Verificando Idade...");
            System.out.println("Idade Verificada. Acesso Liberado");
        } else {
            System.out.println("Acesso Negado");
        }
    }
}