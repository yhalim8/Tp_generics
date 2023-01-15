package tp;

import java.io.FileNotFoundException;
import java.util.List;

public interface IMetier<T> {
    public  void add (T o);
    public List<T> getAll() throws Exception;
    public T findById(long id);
    public void delete(long id);
    public void saveAll() throws Exception;

}
