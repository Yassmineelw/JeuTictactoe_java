package sauvegarder_partie;

import commun_client.commandes.CommandePourEnvoi;

public interface SauvegarderPartiePourEnvoi extends CommandePourEnvoi {
	
	void setCheminDansHome(String cheminDansHome);

}
