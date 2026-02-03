public interface MusicPlayer {

    //todas as propriedades que vai declarar na interface ja são public, final e static
    String music = "Parabéns pra você";
    //nao pode ter construtores em interfaces

    void playMusic();
    void pauseMusic();
    void stopMusic();
}
