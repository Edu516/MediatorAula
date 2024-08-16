package exemplo2;

public class Main {
    public static void main(String[] args) {
        Mediator mediadorATC = new Mediator();

        Aeronave aeronave1 = new Aeronave("Voo101", mediadorATC);
        Aeronave aeronave2 = new Aeronave("Voo202", mediadorATC);
        Aeronave aeronave3 = new Aeronave("Voo303", mediadorATC);

        mediadorATC.adicionarAeronave(aeronave1);
        mediadorATC.adicionarAeronave(aeronave2);
        mediadorATC.adicionarAeronave(aeronave3);

        aeronave1.enviarMensagem("Solicitando permissão para pousar.");
        aeronave2.enviarMensagem("Voo202 reconhecendo a solicitação.");
        aeronave3.enviarMensagem("Voo303 pronto para decolar.");
    }
}
