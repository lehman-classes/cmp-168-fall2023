class FirebaseImpl implements Database {

  public void connect() {
    System.out.println("Connecting to Firebase...");
  }

  public void disconnect() {
    System.out.println("Disconnecting from Firebase...");
  }

  public void insert(Object o) {
    System.out.println("Inserting " + o + " into Firebase...");
  }

  public void update(int id, Object o) {
    System.out.println("Updating " + o + " in Firebase...");
  }

  public void delete(int id) {
    System.out.println("Deleting " + id + " from Firebase...");
  }

  public Object select(int id) {
    System.out.println("Selecting " + id + " from Firebase...");
    return null;
  }

  public Object[] selectAll() {
    System.out.println("Selecting all from Firebase...");
    return null;
  }
}
