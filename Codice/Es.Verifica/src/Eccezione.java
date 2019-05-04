
	public class Eccezione extends Exception{
	String messaggio;
	public Eccezione(String s)
	{
		messaggio=s;
	}
	public String getMessaggio() {
		return messaggio;
	}
}

