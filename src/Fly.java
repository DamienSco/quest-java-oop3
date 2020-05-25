public interface Fly  {

  void takeOff();

  int ascend(int meters);

  default boolean glide() {
    return false;
  }

  int descend(int meters);

  boolean land();
}


