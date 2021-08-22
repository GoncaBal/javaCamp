package gameStoreProject.core.adapters;

import gameStoreProject.business.abstracts.PersonCheckService;
import gameStoreProject.entities.concretes.Player;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements PersonCheckService {

	@Override
	public boolean checkIfRealPerson(Player player) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		try {
			return client.TCKimlikNoDogrula(Long.parseLong(player.getNationalityIdentity()),
					player.getFirstName().toUpperCase(), player.getLastName().toUpperCase(), player.getDateOfBirth());

		} catch (Exception e) {
			return false;
		}
	}
}