
/**
 * @author 
 * @version 
 */
public class Telefonbuch
{
    // Bezugsobjekte
    private List<Telefonbucheintrag> Telefonbucheintrag;
    private BinarySearchTree <Telefonbucheintrag> bst;
    // Attribute

    // Konstruktor
    public Telefonbuch()
    {
        bst= new BinarySearchTree ();
    }

    // Dienste
    /** Übergebener Eintrag wird mit der im BST integrierten Methode im BST gespeichert
      **/
    public void eintragHinzufuegen(Telefonbucheintrag eintrag)
    {
        bst.insert(eintrag);
    }
    
    /** Zuerst wird im BST nach dem zu löschenden Eintrag gesucht (sucheEintrag())
      * Ist der Eintrag gefunden wird er entfernt
      **/
    public void eintragLoeschen(Telefonbucheintrag eintrag)
    {
        bst.remove(eintrag);
    }
    
    /** Im BST wird nach einem Eintrag gesucht
     *  Auf jedem Level wird der Nachname überprüft und die Methoden isGreater() und isLess() angewandt
     **/
    public Telefonbucheintrag sucheEintrag(String nachname)
    {
        return bst.search(new Telefonbucheintrag (nachname));
    }
    
    /** Zuerst wird der alte Eintrag gelöscht (eintragLoeschen), anschließend der neue eingefügt (eintragHinzufuegen) 
    **/
    public void aendereAuftrag(Telefonbucheintrag alt, Telefonbucheintrag neu)
    {
    
    }
    
    /** Übergebener Telefonbucheintrag t wird gesucht (sucheEintrag()), ist er gefunden wird der Vorname durch pVorname ersetzt
     *  
     *  Wichtig: Für die methode sucheEintrag wird der nachname benötigt
     **/
    public void aendereVorname(Telefonbucheintrag t, String pVorname)
    {
        
    }
    
    /** Übergebener Telefonbucheintrag t wird gesucht (sucheEintrag()), ist er gefunden wird der Vorname durch pNachname ersetzt
     *  
     *  Wichtig: Für die methode sucheEintrag wird der nachname benötigt
     **/
    public void aendereNachname(Telefonbucheintrag t, String pNachname)
    {
    
    }
    
    /** Übergebener Telefonbucheintrag t wird gesucht (sucheEintrag()), ist er gefunden wird in der klasse Telefonbucheintrag die Methode
      * fuegeNummerHinzu aufgerufen und der parameter pNummer weitergegeben
     *  
     *  Wichtig: Für die methode sucheEintrag wird der nachname benötigt
     **/
    public void fuegeNummerHinzu(Telefonbucheintrag t, int pNummer)
    {
    
    }
    
    /** Eingabe wird überprüft, und alle Einträge die mit der aktuellen Eingabe anfangen werden ausgegeben
     * z.B. Man gibt As ein und ausgegeben werden "Aslan", "Assman" u.s.w., bei f "Fischer", "Flötenheinrich" u.s.w.
       **/
    public void gibVorschlagsliste(Telefonbucheintrag eintrag)
    {
        
    }
    
}
