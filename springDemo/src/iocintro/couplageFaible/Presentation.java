package iocintro.couplageFaible;

import iocintro.couplageFaible.MetierImpl;

public class Presentation {



    public static void main(String[] args) {
        /**
         * the following code will generate NPE, cauz we've to
         * instanciate IDao avec un objet d'une classe qui implémente l'interface IDao.
         *
         *
        System.out.println("couplage faible:");
        MetierImpl metier = new MetierImpl();
        System.out.println(metier.calcul()); */


        /**
         * Injection des dépendances par instanciation statique => new (couplage fort)
         */

        DaoImpl dao = new DaoImpl();
        //on peut switcher entre dao et dao2 sans souci
        DaoImpl2 dao2 = new DaoImpl2();
        MetierImpl metier = new MetierImpl();
        metier.setDao(dao2);
        System.out.println("res = "+metier.calcul());

    }

}
