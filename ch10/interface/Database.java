public interface Database {

  public void connect();

  public void disconnect();

  public void insert(Object o);

  public void update(int id, Object o);

  public void delete(int id);

  public Object select(int id);

  public Object[] selectAll();

}
