package exemplo2;

public class Aeronave {
    private String id;
    private IMediatorATC mediadorATC;

    public Aeronave(String id, IMediatorATC mediadorATC) {
        this.id = id;
        this.mediadorATC = mediadorATC;
    }

    public void enviarMensagem(String msg) {
        System.out.println(this.id + " enviando mensagem: " + msg);
        mediadorATC.enviarMensagem(msg, this);
    }

    public void receberMensagem(String msg) {
        System.out.println(this.id + " recebeu mensagem: " + msg);
    }
}
