package ouvrir_sauvegarde;

import commun_client.commandes.CommandePourEnvoi; 

public interface OuvrirSauvegardePourEnvoi extends CommandePourEnvoi {
	
	void setCheminDansHome(String cheminDansHome);

}
