package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("metier")
public class MetierImpl implements IMetier {

    //Couplage fort
    private IDao dao;

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double t=dao.getData();
        double res=t*23;
        return res;
    }
    /*
    pour injecter dans la variable dao un objet d'une classe
    qui implimente l'interface IDao
     */
    public void setDao(IDao dao){
       this.dao=dao;
    }
}
