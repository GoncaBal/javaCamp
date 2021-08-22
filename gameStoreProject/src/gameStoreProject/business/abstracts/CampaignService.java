package gameStoreProject.business.abstracts;

import gameStoreProject.entities.concretes.Campaign;

public interface CampaignService {
		void add(Campaign campaign);
		void update(Campaign campaign);
		void delete(Campaign campaign);
}
