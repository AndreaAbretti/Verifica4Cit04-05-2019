
public class News {
	private String codiceID;
	private String titolo;
	private String articolo;
	public News()
	{
		
	}
	public News(String codiceID, String titolo, String articolo)
	{
		this.codiceID=codiceID;
		this.titolo=titolo;
		this.articolo=articolo;
	}
	public News(News n)
	{
		this.codiceID=n.codiceID;
		this.titolo=n.titolo;
		this.articolo=n.articolo;
	}
	public String getCodiceID() {
		return codiceID;
	}
	public void setCodiceID(String codiceID) {
		this.codiceID = codiceID;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getArticolo() {
		return articolo;
	}
	public void setArticolo(String articolo) {
		this.articolo = articolo;
	}
	public String toString()
	{
		return "Codice ID: "+codiceID+".\nTitolo: "+titolo+".\nArticolo: "+articolo;
	}
}
