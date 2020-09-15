
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
    


    /** Implementiert Methode aus ComparableContent, ist der nachname im alphabet weiter hinten wird true zurückgegeben, sonst false
       **/

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
    
    /** Implementiert Methode aus ComparableContent, ist der nachname im alphabet weiter vorne wird true zurückgegeben, sonst false
       **/
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

    /** Implementiert methode aus ComparableContent, sind die nachnamen gleich wird true zurückgegeben, sonst false
       **/
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
    
    /** Nachname wird zurückgegeben, nur für ComparableContent Methoden 
       **/
    public String getContent()
    {
        return this.nachname;
    }    
    
    /** Vorname wird zurückgegeben 
       **/
    public String gibVorname()
    {
        return vorname;
    }
    
    /** Nachname wird zurückgegeben 
       **/
    public String gibNachname()
    {
        return nachname;
    }
    
    /** Liste mit allen nummern die in diesem Eintrag gespeichert werden wird zurückgegeben
       **/
    public List<Integer> gibNummern()
    {
        return nummern;
    }
    
    /** Setter für Vorname 
       **/
    public void setzeVorname(String vorname)
    {
        this.vorname = vorname;
    }
    
    /** Setter für Nachname 
       **/
    public void setzeNachname(String nachname)
    {
        this.nachname = nachname;
    }
    
    /** Neue Nummer wird an die Liste angehängt, es findet keine Sortierung statt 
       **/
    public void fuegeNummernHinzu(int pNummer)
    {
        nummern.insert(pNummer);
    }

}
