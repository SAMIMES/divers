package iocintro.couplageFort;

public class MetierImpl {
    DaoImpl dao;

    public MetierImpl(){
        dao = new DaoImpl();
    }
    public double calcul(){

        double nb = dao.getValue()+2;
        return nb;
    }
}
