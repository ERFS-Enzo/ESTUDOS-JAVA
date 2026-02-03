public class Smartphone implements VideoPlayer, MusicPlayer{
    @Override
    public void playMusic() {
        System.out.println("O smartphone esta tocando a música");
    }

    @Override
    public void pauseMusic() {
        System.out.println("O smartphone esta pausando a música");
    }

    @Override
    public void stopMusic() {
        System.out.println("O smartphone esta parando a música");
    }

    @Override
    public void playVideo() {
        System.out.println("O smartphone esta tocando o video");
    }

    @Override
    public void pauseVideo() {
        System.out.println("O smartphone esta pausando o video");
    }

    @Override
    public void stopVideo() {
        System.out.println("O smartphone esta parando o video");
    }
}
