package org.java.spring;

import java.time.LocalDate;
import java.util.List;
import org.java.spring.auth.Role;
import org.java.spring.auth.User;
import org.java.spring.auth.config.AuthConfiguration;
import org.java.spring.services.IngredientService;
import org.java.spring.services.PizzaService;
import org.java.spring.services.PromoService;
import org.java.spring.services.RoleService;
import org.java.spring.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringLaMiaPizzeriaCrudApplication implements CommandLineRunner {

	@Autowired
	private IngredientService ingredientService;
	
	@Autowired
	private PizzaService pizzaService;
	
	@Autowired
	private PromoService promoService;
	
	@Autowired
	private RoleService roleService;
	
	@Autowired
	private UserService userService;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringLaMiaPizzeriaCrudApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		Ingredient pomodoro = new Ingredient("pomodoro");
		Ingredient mozzarella = new Ingredient("mozzarella");
		Ingredient acciughe = new Ingredient("acciughe");
		Ingredient origano = new Ingredient("origano");
		Ingredient aglio = new Ingredient("aglio");
		Ingredient salamePiccante = new Ingredient("salame piccante");
		Ingredient basilico = new Ingredient("basilico");
		Ingredient rosmarino = new Ingredient("rosmarino");
		Ingredient salsiccia = new Ingredient("salsiccia");
		Ingredient sale = new Ingredient("sale");
		Ingredient funghi = new Ingredient("funghi");
		Ingredient gorgonzola = new Ingredient("gorgonzola");
		Ingredient provola = new Ingredient("provola");
		Ingredient carciofi = new Ingredient("carciofi");
		Ingredient cotto = new Ingredient("prosciutto cotto");
		Ingredient olive = new Ingredient("olive");
		Ingredient olioOliva = new Ingredient("olio d'oliva");
		Ingredient parmigiano = new Ingredient("parmigiano");
		
		ingredientService.save(pomodoro);
		ingredientService.save(mozzarella);
		ingredientService.save(acciughe);
		ingredientService.save(origano);
		ingredientService.save(aglio);
		ingredientService.save(salamePiccante);
		ingredientService.save(basilico);
		ingredientService.save(rosmarino);
		ingredientService.save(salsiccia);
		ingredientService.save(sale);
		ingredientService.save(funghi);
		ingredientService.save(provola);
		ingredientService.save(gorgonzola);
		ingredientService.save(carciofi);
		ingredientService.save(cotto);
		ingredientService.save(olive);
		ingredientService.save(olioOliva);
		ingredientService.save(parmigiano);
		
		pizzaService.save(new Pizza("Bianca", "Una pizza leggera e deliziosa, preparata con una base di mozzarella fresca, aglio, olio d'oliva e spezie, senza pomodoro. La sua semplicità permette agli ingredienti di brillare.", "https://wips.plug.it/cips/buonissimo.org/cms/2019/04/pizza-bianca-1.jpg", 3.00, olioOliva, rosmarino, sale));
		pizzaService.save(new Pizza("Margherita", "Un classico italiano, caratterizzato da pomodoro fresco, mozzarella di bufala, basilico e un filo d'olio extravergine d'oliva. I colori della bandiera italiana si fondono in questa gustosa creazione.", "https://wips.plug.it/cips/buonissimo.org/cms/2020/02/pizza-margherita.jpg", 5.00, pomodoro, mozzarella, basilico));
		pizzaService.save(new Pizza("Marinara", "Un'autentica pizza napoletana con una salsa di pomodoro, aglio, origano e olio d'oliva. Un'esplosione di sapori mediterranei in ogni morso", "https://upload.wikimedia.org/wikipedia/commons/1/11/Pizza_marinara.jpg", 3.00, pomodoro, aglio, origano));
		pizzaService.save(new Pizza("Diavola", "Una pizza piccante che porta un tocco di fuoco alla tavola, con salame piccante, peperoncini, mozzarella e pomodoro. Perfetta per gli amanti delle spezie.", "https://www.lucianopignataro.it/wp-content/uploads/2023/02/Elementi-Pizzeria-Diavola-480x480.png", 5.00, pomodoro, mozzarella, salamePiccante));
		pizzaService.save(new Pizza("Boscaiola", "Una pizza rustica e saporita, arricchita da funghi, salsiccia, pomodoro e mozzarella. Un'esperienza culinaria che evoca il gusto dei boschi.", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSqI2bAJj45Kfb35nZLWBvBZDBTuk_HnH8t0x3WRm-wQT8nvVTZe76UfBWZxDKf9qLICrg&usqp=CAU", 6.00, pomodoro, mozzarella, salsiccia, funghi));
		pizzaService.save(new Pizza("Quattro formaggi", "Un tripudio di formaggi prelibati che si fondono armoniosamente su una base di pomodoro, offrendo una miscela di sapori intensi e cremosi.", "https://www.petitchef.it/imgupl/recipe/pizza-ai-quattro-formaggi--459380p719602.jpg", 4.00, mozzarella, parmigiano, gorgonzola, provola ));
		pizzaService.save(new Pizza("Quattro stagioni", "Una pizza divisa in quattro sezioni, ognuna rappresentante una stagione dell'anno con ingredienti tipici: funghi per l'autunno, carciofi per l'inverno, pomodoro per l'estate e prosciutto per la primavera.", "https://www.petitchef.it/imgupl/recipe/pizza-4-stagioni--449891p695427.jpg", 4.00, pomodoro, mozzarella, carciofi, cotto, funghi, olive));
		pizzaService.save(new Pizza("Capricciosa", "Una pizza generosamente condita con prosciutto cotto, funghi, olive, carciofi, mozzarella e pomodoro, offrendo una varietà di sapori in ogni porzione.", "https://www.pizzanapoletanadoc.it/wp-content/uploads/2019/04/capricciosa-pizza-napoletana-doc.jpg", 8.00, pomodoro, mozzarella, carciofi, cotto, funghi, olive));
		pizzaService.save(new Pizza("Romana", "Una pizza croccante e sottile con accenti di origano, pomodoro, mozzarella e acciughe, cotta alla perfezione per un gusto autentico.", "https://www.50toppizza.it/wp-content/uploads/2019/02/pizza-romana-pignataro.jpg", 3.00, pomodoro, mozzarella, acciughe, origano));
	
		List<Pizza> pizzas = pizzaService.findAll();
		
		promoService.save(new Promo(LocalDate.parse("2023-12-25"), LocalDate.parse("2024-01-06"), "Promo Natalizia", pizzas.get(0)));
		promoService.save(new Promo(LocalDate.parse("2022-12-30"), LocalDate.parse("2022-12-31"), "Promo Fine Anno", pizzas.get(1)));
		promoService.save(new Promo(LocalDate.parse("2024-01-07"), LocalDate.parse("2024-01-31"), "Promo Nuovo Anno", pizzas.get(2)));
		promoService.save(new Promo(LocalDate.parse("2024-02-01"), LocalDate.parse("2024-02-20"), "Promo Carnevale", pizzas.get(3)));
		
		Role user = new Role("USER");
		Role admin = new Role("ADMIN");
	
		roleService.save(user);
		roleService.save(admin);

		String pass = AuthConfiguration.passwordEncoder().encode("password");

		User testUser = new User("TestUser", pass, user);
		User testAdmin = new User("TestAdmin", pass, admin);

		userService.save(testUser);
		userService.save(testAdmin);
	}
}
