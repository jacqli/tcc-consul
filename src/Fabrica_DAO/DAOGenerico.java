
package Fabrica_DAO;


import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import javax.swing.JOptionPane;

public class DAOGenerico<T> {
    
 
        private EntityManager em;
    public T salvar (T entidade){
     em = Fabrica.get().createEntityManager();
     EntityTransaction t = em.getTransaction();
     try{
     t.begin();
     em.persist(entidade);    
     t.commit();
     }catch(Exception e){
     t.rollback();
     e.printStackTrace();
     }finally{
     em.close();
    // JOptionPane.showMessageDialog(null, "asasdadas");
    }
     return entidade;
    }
 
    public List<T> consultar(Class c){
     em = Fabrica.get().createEntityManager();
        try{
         return em.createQuery("from " + c.getSimpleName()).getResultList();
     } catch(Exception e){
      e.printStackTrace();
      return null;
     }finally{
        em.close();
     }  
    }
    
   public T consultar(Class c, int id){
   em = Fabrica.get().createEntityManager();
       try{
    return (T) em.find(c, id);
   }catch(Exception e){
   e.printStackTrace();
   return null;    
   }finally{
    em.close();
   }
  }
   public void excluir(Class c, int id){
    em = Fabrica.get().createEntityManager();
    try{
    T t = (T) em.find(c, id);
    em.getTransaction().begin();
    em.remove(t);
    em.getTransaction().commit();
    }catch(Exception e){
     e.printStackTrace();
    }finally{
     em.close();
    }
}

    public boolean atualizar (T entidade){
     em = Fabrica.get().createEntityManager();
     EntityTransaction t = em.getTransaction();
     try{
     t.begin();
     em.merge(entidade);    
     t.commit();
     return true;
     }catch(Exception e){
     t.rollback();
     e.printStackTrace();
     return false;
     }finally{
     em.close();
    }
    }
     
    public List<T> consultar(Class c, String p){
        EntityManager manager = Fabrica.get().createEntityManager();                    
        try{                                       
            Query query = manager.createQuery("from "+c.getSimpleName()+" e where e.nome like :nomeParam");
            return query.setParameter("nomeParam","%"+ p + "%").getResultList();  
        }catch(Exception e){                                                            
            e.printStackTrace();                                                       
            return null;                                                                
        }finally{                                                                       
            manager.close();                                                            
        }
         
    }
}

