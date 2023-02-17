package pooaula08luta;
// @author Mari (48) 99618-5728
public class PooAula08Luta {
    public static void main(String[] args) {
        // TODO code application logic here
       //Informar (nome, nascionalidade, idade, altura+f, peso+f, vitorias, derrotas, empates)
       LutadorClasse l[] = new LutadorClasse[6];
       l[0] = new LutadorClasse("Pretty Boy","França", 31, 1.77f, 68.9f, 11, 2, 1);
       l[1] = new LutadorClasse("Putscrip", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
       l[2] = new LutadorClasse("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
       l[3] = new LutadorClasse ("Dead Code", "Austrália", 28, 1.93f, 81.6f, 13, 0, 2);
       l[4] = new LutadorClasse ("Ufocobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
       l[5] = new LutadorClasse ("Nerdaard", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);
       
       LutaClasse UEC01 =new LutaClasse();
       UEC01.marcarLuta(l[2], l[3]);
       UEC01.lutar();
       
       l[2].apresentar();
       l[3].apresentar();           
    }
    
}
