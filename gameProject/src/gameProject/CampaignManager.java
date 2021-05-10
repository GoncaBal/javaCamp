package gameProject;

public class CampaignManager implements CampaignService {

	@Override
	public void addCampaign(Game game, Order order,Campaign campaign) {
		System.out.println("Seçili indirim uygulandı: "+campaign.getCampaignName()+". Oyunun ücreti: "+game.getPrice() + "TL. Oyunun indirimden sonraki ücreti: "+(game.getPrice()-(game.getPrice()*campaign.getDiscount()/100))+" TL");
		
	}

	@Override
	public void updateCampaign(Game game, Order order) {
		System.out.println("Kampanya bilgileri güncellendi.");
		
	}

	@Override
	public void deleteCampaign(Game game, Order order) {
		System.out.println("Kampanya kaldırıldı.");
		
	}

}
