
/**
 * @author 
 * @version 
 */
public class Telefonbucheintrag implements ComparableContent<Telefonbucheintrag>
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

    
    public Telefonbucheintrag(String nachname)
    {
        this.nachname = nachname;
    }
    


    /** Implementiert Methode aus ComparableContent, ist der nachname im alphabet weiter hinten wird true zurückgegeben, sonst false**/

        public boolean isGreater (Telefonbucheintrag pContent)
    {
        if(pContent.getContent().compareTo(this.nachname) < 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean isLess (Telefonbucheintrag pContent)
    {
        if(pContent.getContent().compareTo(this.nachname) > 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean isEqual (Telefonbucheintrag pContent)
    {
        if(pContent.getContent().compareTo(this.nachname) == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public String getContent()
    {
        return this.nachname;
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
