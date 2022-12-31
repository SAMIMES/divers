package iocintro.couplageFaible;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Presentation2 {
    public static void main(String[] args) throws Exception {

        /**
         * Injection des dépendances d'une manière dynamique (pas besoin du code source maitenant).
         */

        File file = new File("config.txt");
        System.out.println(file.getAbsolutePath());
        Scanner scanner = new Scanner(file);

        //get implementation for IDao
        String daoClassName = scanner.nextLine();
        Class cDao = Class.forName(daoClassName);

        // Object ob = cDao.newInstance
        IDao dao = (IDao) cDao.newInstance();
        System.out.println(dao.getValue());


        //get implementation for IMetier
        String metierClassName = scanner.nextLine();
        Class cMetier = Class.forName(metierClassName);
        IMetier metier = (IMetier) cMetier.newInstance();

        Method method = cMetier.getMethod("setDao",IDao.class);
        //metier.setDao(dao);
        method.invoke(metier,dao);

        System.out.println(metier.calcul());


    }
}
