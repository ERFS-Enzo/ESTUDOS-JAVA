public class Computer implements VideoPlayer, MusicPlayer{
    @Override
    public void playMusic() {
        System.out.println("O computador esta tocando a música");
    }

    @Override
    public void pauseMusic() {
        System.out.println("O computador esta pausando a música");
    }

    @Override
    public void stopMusic() {
        System.out.println("O computador esta parando a música");
    }

    @Override
    public void playVideo() {
        System.out.println("O computador esta tocando o video");
    }

    @Override
    public void pauseVideo() {
        System.out.println("O computador esta pausando o video");
    }

    @Override
    public void stopVideo() {
        System.out.println("O computador esta parando o video");
    }
}
