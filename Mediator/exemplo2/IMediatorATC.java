package exemplo2;

public interface IMediatorATC {
    void enviarMensagem(String msg, Aeronave aeronave);
    void adicionarAeronave(Aeronave aeronave);
}
