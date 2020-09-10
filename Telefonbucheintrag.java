
/**
 * @author 
 * @version 
 */
public class Telefonbucheintrag
{
    // Bezugsobjekte
    private List<Integer> nummern;
    // Attribute
    private String vorname;
    private String nachname;
    // Konstruktor
    public Telefonbucheintrag()
    {

    }

    public String gibVorname()
    {
        return vorname;
    }
    
    public String gibNachname()
    {
        return nachname;
    }
    
    public List<Integer> gibNummern()
    {
        return nummern;
    }
    
    public void setzeVorname(String vorname)
    {
        this.vorname = vorname;
    }
    
    public void setzeNachname(String nachname)
    {
        this.nachname = nachname;
    }
    
    public void fuegeNummernHinzu(int pNummer)
    {
        nummern.insert(pNummer);
    }

}
