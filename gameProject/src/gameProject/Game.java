package gameProject;

public class Game implements Entity {
	private int gameId;
	private int playerId;
	private String gameName;
	private String gameInfo;
	private double price;
	
	public Game() {
		super();
	}
	public Game(int gameId, int playerId, String gameName, String gameInfo, double price) {
		super();
		this.gameId = gameId;
		this.playerId = playerId;
		this.gameName = gameName;
		this.gameInfo = gameInfo;
		this.price = price;
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
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public String getGameInfo() {
		return gameInfo;
	}
	public void setGameInfo(String gameInfo) {
		this.gameInfo = gameInfo;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
