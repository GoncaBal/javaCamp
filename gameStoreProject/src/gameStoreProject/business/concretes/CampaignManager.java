package gameStoreProject.business.concretes;

import gameStoreProject.business.abstracts.CampaignService;
import gameStoreProject.entities.concretes.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println("Kampanya "+campaign.getCampaignDuration() +" ay süreliğine eklendi! "+campaign.getCampaignName());
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya bilgileri güncellendi: "+campaign.getCampaignName());
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya silindi! "+campaign.getCampaignName());
	}

}
