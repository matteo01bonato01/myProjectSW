package it.isa.progetto;

/**
 * Hello world!
 *
 */
public class App 
{	
    public static void main( String[] args )
    {
		/*
		 * CREO TABELLE E INSERISCO DELLE TUPLE CON UNA CLASSE
		 * L'ORDINE E' IMPORTANTE !!
		 */
    	
    	Drop d = new Drop ();
    	d.esegui();
    	
    	
    	System.out.println("palle");
    	/***************************************************/
		CreaTabellaUtente ctutente = new CreaTabellaUtente();
		ctutente.esegui();
		
		CreaTabellaArtista ctartista = new CreaTabellaArtista();
		ctartista.esegui();
		
		CreaTabellaLocation ctlocation = new CreaTabellaLocation();
		ctlocation.esegui();
		
		//tabelle con foreign key
		CreaTabellaEvento ctevento = new CreaTabellaEvento();
		ctevento.esegui();
		
		CreaTabellaPrenotazione ctprenotazione = new CreaTabellaPrenotazione();
		ctprenotazione.esegui();
		
		PannelloLogin pl = new PannelloLogin();
		pl.show();
		
		
    }
}
