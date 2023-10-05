public abstract class Pet {

  private String favoriteFood;
  private String favoriteToy;
  private int maintenanceLevel;
  private boolean goesOutside;

  public Pet() {
    this.favoriteFood = "Unknown food";
    this.favoriteToy = "Unknown toy";
    this.maintenanceLevel = 0;
    this.goesOutside = false;
  }

  public Pet(String favoriteFood, String favoriteToy, int maintenanceLevel, boolean goesOutside) {
    this.favoriteFood = favoriteFood;
    this.favoriteToy = favoriteToy;
    this.maintenanceLevel = maintenanceLevel;
    this.goesOutside = goesOutside;
  }

  public abstract void play();

  public String getFavoriteFood() {
    return favoriteFood;
  }

  public String getFavoriteToy() {
    return favoriteToy;
  }

  public int getMaintenanceLevel() {
    return maintenanceLevel;
  }

  public boolean goesOutside() {
    return goesOutside;
  }

  public void setFavoriteFood(String favoriteFood) {
    this.favoriteFood = favoriteFood;
  }

  public void setFavoriteToy(String favoriteToy) {
    this.favoriteToy = favoriteToy;
  }

  public void setMaintenanceLevel(int maintenanceLevel) {
    this.maintenanceLevel = maintenanceLevel;
  }

  public void setGoesOutside(boolean goesOutside) {
    this.goesOutside = goesOutside;
  }

  @Override
  public String toString() {
    return "Pet{" +
        "favoriteFood='" + favoriteFood + '\'' +
        ", favoriteToy='" + favoriteToy + '\'' +
        ", maintenanceLevel=" + maintenanceLevel +
        ", goesOutside=" + goesOutside +
        '}';
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (obj instanceof Pet) {
      Pet otherPet = (Pet) obj;
      return this.favoriteFood.equals(otherPet.favoriteFood) &&
          this.favoriteToy.equals(otherPet.favoriteToy) &&
          this.maintenanceLevel == otherPet.maintenanceLevel &&
          this.goesOutside == otherPet.goesOutside;
    }
    return false;
  }

}
