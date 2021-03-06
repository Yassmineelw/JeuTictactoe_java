package JeuDeDame_client.controleurs;

import commun.debogage.J; 
import commun_client.mvc.controleurs.ControleurModeleVue;
import JeuDeDame.modeles.sauvegardes.Sauvegardes;
import JeuDeDame.modeles.sauvegardes.SauvegardesLectureSeule;
import JeuDeDame_client.afficheurs.AfficheurSauvegardes;
import JeuDeDame_client.vues.VueSauvegardes;

public abstract class ControleurSauvegardes<V extends VueSauvegardes, 
                                   A extends AfficheurSauvegardes<V>>

	   extends ControleurModeleVue<SauvegardesLectureSeule, 
	                               Sauvegardes,
	                               V,
	                               A> {

	@Override
	protected void demarrer() {
		J.appel(this);
		
	}

	@Override
	protected void obtenirMessagesPourEnvoi() {
		J.appel(this);

	}

	@Override
	protected void installerReceptionCommandes() {
		J.appel(this);
		
	}

	@Override
	protected void installerReceptionMessages() {
		J.appel(this);
		
	}
}
