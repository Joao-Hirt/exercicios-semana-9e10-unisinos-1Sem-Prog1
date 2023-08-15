public class Programador extends Pessoa {
    private String linguagemDeProgramacaoFavorita;

    public Programador (String nome, int idade, String linguagemDeProgramacaoFavorita){
        super(nome, idade);
        this.linguagemDeProgramacaoFavorita = linguagemDeProgramacaoFavorita;
    }

    public String getLinguagemDeProgramacaoFavorita(){
        return linguagemDeProgramacaoFavorita;
    }
    public void setLinguagemDeProgramacaoFavorita(String linguagemDeProgramacaoFavorita){
        this.linguagemDeProgramacaoFavorita = linguagemDeProgramacaoFavorita;
    }

    @Override
    public void imprimeDados(){
        System.out.println("Nome: "+getNome());
        System.out.println("Idade: "+getIdade());
        System.out.println("Linguagem de Programação Favorita: "+linguagemDeProgramacaoFavorita);
    }
}
