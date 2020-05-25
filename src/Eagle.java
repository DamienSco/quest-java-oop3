public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

  /**
   * To takeOff : Flies, must be off the ground
   */
  @Override
  public void takeOff() {
    if (!this.flying && this.altitude == 0) {
      this.flying = true;
      System.out.printf("%s flies into the sky.%n", this.getName());
    }
  }

  /**
   * To ascend : fly upward
   * @param meters altitude increase
   * @return altitude
   */
  @Override
  public int ascend(int meters) {
    if (this.flying) {
      this.altitude = Math.min(this.altitude + meters, 75);
      System.out.printf("%s flies upward, altitude : %d%n", this.getName(), this.altitude);
    }
    return this.altitude;
  }

  /**
   * To glide in the sky
   * @return glide
   */
  @Override
  public boolean glide() {
    if (this.flying) {
      this.altitude = this.altitude;
      System.out.printf("%s glides up to the valley %n", this.getName());
    }
    return this.flying;
  }

  /**
   * To descend : fly upward
   * @param meters altitude increase
   * @return altitude
   */
  @Override
  public int descend(int meters) {
    if (this.flying) {
      this.altitude = Math.max(this.altitude + meters, 0);
      System.out.printf("%s flies downward, altitude : %d%n", this.getName(), this.altitude);
    }
    return this.altitude;
  }

  /**
   * To land
   */
  @Override
  public boolean land() {
    if (!this.flying && this.altitude == 0) {
      System.out.printf("%s stop flying and land on the ground.%n", this.getName());
    } else {
      System.out.printf("%s keep flying.%n", this.getName());
    }
    return this.flying;
  }

}
