
public class ElencoNews {
	News Lista[];
	final static int nNews=1000;
	public ElencoNews()
	{
		Lista=new News[nNews];
	}
	public void aggiunta(News l)throws Eccezione
	{
		for(int i=0;i<nNews;i++)
		{
			if(Lista[i]==null)
			{
				Lista[i]=l;
				return;
			}
		}throw new Eccezione("Inesistente");
	}
	public News ricercaInfo(String titolo)throws Eccezione
	{
		for(int i=0;i<nNews;i++)
		{
			if(Lista[i]!=null && Lista[i].getTitolo().equals(titolo))
			{
				
				return Lista[i];
				//return new Libro(biblioteca[i]);
				//return biblioteca[i];
			}
		}
		throw new Eccezione("");
	}
	public News visualizzaLista()
	{
		for(int i=0;i<nNews;i++)
		{
			return Lista[i];
		}
		return null;
	}
}
