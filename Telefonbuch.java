
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
    public void eintragHinzufuegen(Telefonbucheintrag eintrag)
    {
        bst.insert(eintrag);
    }
    
    public void eintragLoeschen(Telefonbucheintrag eintrag)
    {
        bst.remove(eintrag);
    }
    
    public Telefonbucheintrag sucheEintrag(String nachname)
    {
        return bst.search();
    }
    
    public void aendereAuftrag(Telefonbucheintrag alt, Telefonbucheintrag neu)
    {
    
    }
    
    public void gibVorschlagsliste(Telefonbucheintrag eintrag)
    {
        
    }
    
}
