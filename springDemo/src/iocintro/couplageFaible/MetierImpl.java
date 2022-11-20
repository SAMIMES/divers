package iocintro.couplageFaible;

public class MetierImpl implements IMetier{
    IDao dao;

    @Override
    public double calcul() {
        double nb = dao.getValue()+3;
        return nb;
    }

    /**
     * Injecter dans la variable dao un objet
     * d'une classe qui implémente l'interface IDao
     * @param dao l'objet que l'on va implémenter
     */
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
