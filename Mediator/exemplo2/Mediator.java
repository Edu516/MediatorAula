package exemplo2;

import java.util.ArrayList;
import java.util.List;

public class Mediator implements IMediatorATC {
    private List<Aeronave> aeronaves = new ArrayList<>();

    @Override
    public void enviarMensagem(String msg, Aeronave aeronave) {
        for (Aeronave a : aeronaves) {
            if (a != aeronave) {
                a.receberMensagem(msg);
            }
        }
    }

    @Override
    public void adicionarAeronave(Aeronave aeronave) {
        aeronaves.add(aeronave);
    }
}