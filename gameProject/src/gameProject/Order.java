package gameProject;

public class Order implements Entity {
	private int orderId;
	private int gameId;
	private int playerId;
	private int salesmanId;
	
	
	public Order() {}

	public Order(int orderId, int gameId, int playerId, int salesmanId, double totalPrice) {
		super();
		this.orderId = orderId;
		this.gameId = gameId;
		this.playerId = playerId;
		this.salesmanId = salesmanId;

	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public int getSalesmanId() {
		return salesmanId;
	}

	public void setSalesmanId(int salesmanId) {
		this.salesmanId = salesmanId;
	}

	

	
	
	
	
}
