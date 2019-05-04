import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElencoNews b1=new ElencoNews();
		Scanner sInt=new Scanner(System.in);
		Scanner sString=new Scanner(System.in);
		int soluzione=0;
		do
		{
			System.out.println("Scegliere l'opzione:\n-1 Aggiunta;\n-2 Ricerca dal titolo.");
			System.out.println("(PER TERMINARE IL PROGRAMMA PREMERE 0)");
			soluzione=sInt.nextInt();
			switch(soluzione)
			{
			case 1:
				try
				{
					Scanner s3=new Scanner(System.in);
					System.out.println("Inserire i dati della News(CodiceID, Titolo, Articolo): ");
					News l1=new News();
					l1.setCodiceID(s3.nextLine());
					l1.setTitolo(s3.nextLine());
					l1.setArticolo(s3.nextLine());;
					b1.aggiunta(l1);
					break;
				}catch(Eccezione e)
				{
					System.out.println(e.getMessaggio());
				}
			case 2:
				Scanner s2=new Scanner(System.in);
				System.out.print(b1.visualizzaLista());
				System.out.println(".\nInserire il titolo del libro che si vuole cercare:");
				try
				{
					System.out.println(b1.ricercaInfo(sString.nextLine()));
				}catch(Eccezione e)
				{
					System.out.println(e.getMessaggio());
				}
				break;
			}
		}while(soluzione<3 && soluzione>0);
	}

}
