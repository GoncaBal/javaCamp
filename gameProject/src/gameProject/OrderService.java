package gameProject;

public interface OrderService {
	void buy(Player player,Salesman salesman,Game game);
	void addToCart(Game game);
}
