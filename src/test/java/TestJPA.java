import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import fr.diginamic.Client;
import fr.diginamic.Emprunt;
import fr.diginamic.Livre;

public class TestJPA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu_essai");
		EntityManager em = entityManagerFactory.createEntityManager();

		Livre book = em.find(Livre.class, 3);
		if (book != null) {

			System.out.println(book);
		}

		TypedQuery<Livre> query = em
				.createQuery("select book from Livre book where titre='Vingt mille lieues sous les mers'", Livre.class);

		Livre book2 = query.getResultList().get(0);
		System.out.println(book2.toString());

		TypedQuery<Emprunt> query2 = em.createQuery("select emprunt from Emprunt emprunt where id= 1", Emprunt.class);

		List<Emprunt> emprunts = query2.getResultList();

		if (emprunts.size() >= 1) {
			Emprunt myemprunt = emprunts.get(0);

			for (Livre l : myemprunt.getLivre()) {
				System.out.println(l);

			}
		}

		TypedQuery<Client> querycustom = em.createQuery("select client from Client client where id= 1", Client.class);

		List<Client> untel = querycustom.getResultList();

		if (untel.size() >= 1) {
			Client cus = untel.get(0);

			for (Emprunt c : cus.getEmprunt()) {
				System.out.println(c.toString());

			}
		}

		em.close();
		entityManagerFactory.close();
	}

}
