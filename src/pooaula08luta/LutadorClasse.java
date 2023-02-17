
package pooaula08luta;
// @author Mari (48) 99618-5728

public class LutadorClasse implements InterfaceLutador {
    //Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias, derrotas, empates;

    //Método construtor
    public LutadorClasse(String nome, String nacionalidade, int idade, float altura, float peso,
                            int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        //this.categoria = categoria;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    //Métodos Públicos
    @Override
    public void apresentar() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        //System.out.println("  ");
        System.out.println("_______________________"+this.getNome()+"_______________________");
        System.out.println("Com vocês o lutador "+this.getNome()+", nascido no(a) "+this.getNacionalidade()+".");
        System.out.println("Possui "+this.getVitorias()+" vitórias, "+this.getDerrotas()+" derrotas e "+this.getEmpates()+" empates. E irá lutar ");
        System.out.println("na categoria "+this.getCategoria()+".");
        //System.out.println("_______________________________________________________");
        System.out.println("  ");
    }

    @Override
    public void status() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        System.out.println("--------------"+this.getNome()+"--------------");
        System.out.println("Idade: "+this.getIdade()+" | Altura: "+this.getAltura()+" | Peso: "+this.getPeso());
        System.out.println("   ");
    }

    @Override
    public void ganharLuta() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        this.setVitorias(this.getVitorias()+1);
    }

    @Override
    public void perderLuta() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        this.setDerrotas(this.getDerrotas()+1);
    }

    @Override
    public void empatarLuta() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        this.setEmpates(this.getEmpates()+1);
    }
    
    //Métodos Especiais
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public void setCategoria() {
        //this.categoria = categoria;
        if (this.peso < 52.2){
            this.categoria="Invalido";
        } else if (this.peso<=70.3){
            this.categoria="Leve";
        } else if (this.peso<=83.9){
            this.categoria="Medio";
        }else if (this.peso<=120.2){
            this.categoria="Pesado";
        }else{
            this.categoria="Invalido";
        }
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public String getNome() {
        return nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public float getAltura() {
        return altura;
    }

    public float getPeso() {
        return peso;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getVitorias() {
        return vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    void apresentar(String _desafiado_) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
