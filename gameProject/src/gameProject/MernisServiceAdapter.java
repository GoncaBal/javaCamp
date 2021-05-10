package gameProject;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements PersonCheckService {

	@Override
	public boolean checkIfRealPerson(Player player) {

		KPSPublicSoapProxy client = new KPSPublicSoapProxy();

		try {
			return client.TCKimlikNoDogrula(Long.parseLong(player.getNationalIdentity()),
					player.getFirstName().toUpperCase(), player.getLastName().toUpperCase(), player.getDateOfYear());
		} catch (Exception e) {
			return false;
		}
	}

}
