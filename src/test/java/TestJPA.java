import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

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

		TypedQuery<Livre> query = em.createQuery(
				"select book from Livre book where book.titre='Vingt mille lieues sous les mers'", Livre.class);

		Livre book2 = query.getResultList().get(0);
		System.out.println(book2.toString());
		
		
		em.close();
		entityManagerFactory.close();
	}

}
