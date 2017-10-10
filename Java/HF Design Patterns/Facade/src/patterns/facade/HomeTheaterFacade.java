package patterns.facade;

public class HomeTheaterFacade {
    private final Amplifier amplifier;
    private final CdPlayer cdPlayer;
    private final Tuner tuner;


    public HomeTheaterFacade(Amplifier amplifier, CdPlayer cdPlayer, Tuner tuner) {
        this.amplifier = amplifier;
        this.cdPlayer = cdPlayer;
        this.tuner = tuner;
    }

    public void watchMovie(){
        amplifier.on();
        cdPlayer.play();
        tuner.turnOn();
    }

    public  void stopMovie(){
        amplifier.off();
        cdPlayer.stop();
        tuner.turnOff();
    }
}
