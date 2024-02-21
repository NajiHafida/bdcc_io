package presentation;

import dao.DaoImpl;
import ext.DaoImpV2;
import metier.MetierImpl;

public class PresentationV1 {
    public static void main(String[] args) {
        /*
        Injection de dependace par instaciation statique
         */
        DaoImpl d= new DaoImpl();
        MetierImpl metier=new MetierImpl(d);//Injection des dependances via le constructeur
        metier.setDao(d);//Injection via le setter
        System.out.println(metier.calcul());

    }
}
