import java.time.LocalDate;

import Business.Adapters.MernisServiceAdapter;
import Business.Concrete.CampaignManager;
import Business.Concrete.GameManager;
import Business.Concrete.OrderManager;
import Business.Concrete.UserManager;
import DataAccess.Concrete.CampaignDataAccessLayer;
import DataAccess.Concrete.GameDataAccessLayer;
import DataAccess.Concrete.OrderDataAccessLayer;
import DataAccess.Concrete.UserDataAccessLayer;
import Entities.Concrete.Campaign;
import Entities.Concrete.Game;
import Entities.Concrete.Order;
import Entities.Concrete.User;

public class Main {

	public static void main(String[] args) {
		UserManager userManager = new UserManager(new UserDataAccessLayer(), new MernisServiceAdapter());
		userManager.add(new User(1, "Begüm", "Muþdal", LocalDate.of(2001, 10, 27), "25730432242"));
		
		CampaignManager campaignManager = new CampaignManager(new CampaignDataAccessLayer());
		campaignManager.add(new Campaign(1, "Öðrenci indirimi", 10, true));
		
		GameManager gameManager = new GameManager(new GameDataAccessLayer());
		gameManager.add(new Game(1, 10, "Sims", 100, 15, null));
		
		OrderManager orderManager = new OrderManager(new OrderDataAccessLayer());
		orderManager.add(new Order(1, 1, 1, LocalDate.of(2021, 5, 5)));

	}

}
