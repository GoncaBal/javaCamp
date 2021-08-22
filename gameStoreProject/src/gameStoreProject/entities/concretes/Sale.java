package gameStoreProject.entities.concretes;

public class Sale extends Game {
		private int id;
		private int quantity;
		
		public Sale() {}

		public Sale(int id, int quantity) {
			super();
			this.id = id;
			this.quantity = quantity;
		}
		public Sale(int id, String gameName, double unitPrice) {
			super(id, gameName, unitPrice);
		};

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public int getQuantity() {
			return quantity;
		}

		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}

		
		
}
