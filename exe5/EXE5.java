package exe5;

/**
 *
 * @author ronei
 */
public class EXE5 {

    
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6]; 
                
        l[0] = new Lutador("Pretty Boy", "França", 31, 1.75, 68.9, 11, 2, 1);
        l[1] = new Lutador("Putscript", "Brasil", 29, 1.68, 57.8, 14, 2, 3);
        l[2] = new Lutador("Snapshadow", "EUA", 35, 1.65, 80.9, 12, 2, 1);
        l[3] = new Lutador("Dead Code", "Australia", 28, 1.93, 81.6, 13, 0, 2);
        l[4] = new Lutador("UFOCobol", "Brasil", 37, 1.70, 119.3, 5, 4, 3);
        l[5] = new Lutador("Nerdaart", "EUA", 30, 1.81, 105.7, 12, 2, 4);
        
        /*l[0].apresentar();
        l[2].status();
        l[3].getCategoria();
        l[1].ganharLuta();
        l[0].empatarLuta();
        */
        
        /*Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[0], l[1]);
        UEC01.lutar();
        l[0].status();
        l[1].status();
        */
        
        /*Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[1], l[1]);
        UEC01.lutar();
        */
        
        /*Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[1], l[5]);
        UEC01.lutar();
        */
        
        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[4], l[5]);
        UEC01.lutar();
        l[4].status();
        l[5].status();
        
    }
    
}
