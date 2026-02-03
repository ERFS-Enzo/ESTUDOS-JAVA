public class MusicBox implements MusicPlayer{
    @Override
    public void playMusic() {
        System.out.println("A caixa de música esta tocando a música");
    }

    @Override
    public void pauseMusic() {
        System.out.println("A caixa de música esta pausando a música");
    }

    @Override
    public void stopMusic() {
        System.out.println("A caixa de música esta parando a música");
    }
}
