package pooaula08luta;

import java.util.Random;
//@author Mari (48) 99618-5728
public class LutaClasse implements InterfaceLuta{
    //Atributos
    private LutadorClasse desafiado;
    private LutadorClasse desafiante;
    private int rounds;
    private boolean aprovado;
    //Métodos Públicos
    //@Override
    public void marcarLuta(LutadorClasse l1, LutadorClasse l2) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        if ((l1.getCategoria()==l2.getCategoria()) && (l1 != l2)){
            this.setAprovado(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
        } else {
            this.setAprovado(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }
    //@Override
    public void marcarLuta() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    //@Override
    public void lutar() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        if (this.aprovado){
            this.desafiado.apresentar(); //("*** DESAFIADO ***"); 
            this.desafiante.apresentar(); //("*** DESAFIANTE ***");
            //int vencedor = (int) (1 + Math.random()*(2-0));
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); //0 1 2
            System.out.println("*** Resultado da luta ***");
            switch (vencedor){
                case 0 -> {
                    //Empate
                    System.out.println("Empatou!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                }
                case 1 -> {
                    //Desafiado vence
                    System.out.println(this.desafiado.getNome()+" venceu a luta!");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                }
                case 2 -> {
                    //Desafiante vence
                    System.out.println(this.desafiante.getNome()+" venceu a luta!");
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                }
            }
            System.out.println("*************************");
        } else {
            System.out.println("*********************************************************");
            System.out.println("A luta não foi aprovadapode, portanto não pode acontecer.");
            System.out.println("*********************************************************");
        }
    }
    //Metodos Especiais
    public LutadorClasse getDesafiado() {
        return desafiado;
    }
    public LutadorClasse getDesafiante() {
        return desafiante;
    }
    public int getRounds() {
        return rounds;
    }
    public boolean getAprovado() {
        return aprovado;
    }
    
    public void setDesafiado(LutadorClasse desafiado) {
        this.desafiado = desafiado;
    }
    public void setDesafiante(LutadorClasse desafiante) {
        this.desafiante = desafiante;
    }
    public void setRounds(int rounds) {
        this.rounds = rounds;
    }
    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
}
