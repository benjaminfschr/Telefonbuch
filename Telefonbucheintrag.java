
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
    String name;
    // Konstruktor
    public Telefonbucheintrag()
    {
        
    }

        public boolean isGreater (Telefonbucheintrag pContent)
    {
        if(pContent.getContent().compareTo(this.name) < 0)
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
        if(pContent.getContent().compareTo(this.name) > 0)
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
        if(pContent.getContent().compareTo(this.name) == 0)
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
        return this.name;
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
