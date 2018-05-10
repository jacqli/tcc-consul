
package Fabrica_DAO;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Fabrica {
private static EntityManagerFactory fab;  
static{
    fab = Persistence.createEntityManagerFactory("JacqliPU");
}
public static EntityManagerFactory get(){
    return fab;
}
}
