package OOP.interfaces;

public class BestCar {
    private Engine engine;
    private Media player;
    BestCar(){
        engine =  new ElectricEngine();
        player = new CdPlayer();
    }

    public void start() {
        engine.start();
    }
    public void stop(){
        engine.stop();
    }

    public void startMusic() {
        player.start();
    }

    public void stopMusic(){
        player.stop();
    }

  void upgradeEngine(){
        this.engine = new powerEngine();
  }
}
