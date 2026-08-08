package Encapsulamento;

public abstract class controleclasse implements controlefora {

    private int volume;
    private boolean ligado;
    private boolean tocando;

    public controleclasse(int volume, boolean ligado, boolean tocando) {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean getTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        setLigado(true);

    }
    @Override
    public void desligar() {
        setLigado(false);

    }

    @Override
    public void abrirMenu() {
        System.out.println(getLigado());
        System.out.println(getVolume());
        for(int i = 0; i < getVolume(); i+=10){
            System.out.println("|");
        }
        System.out.println(getTocando());
    }
    @Override
    public void fecharMenu() {
        System.out.println( "Fechar menu");
    }

    @Override
    public void maisVolume() {
        if ( getLigado()){
            setVolume(getVolume() + 1);
        }
    }

    @Override
    public void menosVolume() {
        if ( getLigado()){
            setVolume(getVolume() - 1);
        }
    }

    @Override
    public void ligarMudo() {
        if ( getLigado() && getVolume()>0){
            setVolume(0);
        }
    }
    @Override
    public void desligarMudo() {
        if ( getLigado() && getVolume()==0){
            setVolume(50);
        }
    }
    @Override
    public void play() {
        if ( getLigado() && !getTocando()){
            setTocando(true);
        }
    }
    @Override
    public void pause() {
        if ( getLigado() && getTocando()){
            setTocando(false);
        }
    }
}



