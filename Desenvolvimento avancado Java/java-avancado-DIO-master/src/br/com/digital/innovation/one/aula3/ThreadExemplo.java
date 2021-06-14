package br.com.digital.innovation.one.aula3;

public class ThreadExemplo {

    public static void main(String[] args) {
        GeradorPDF iniciarGeradorPdf = new GeradorPDF();
        BarraDeCarregamento iniciarBarraDeCarregamento = new BarraDeCarregamento(iniciarGeradorPdf);

        iniciarGeradorPdf.start();
        iniciarBarraDeCarregamento.start();

    }

}


class GeradorPDF extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("Gerando PDF");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\nPDF Gerado");
    }
}


class BarraDeCarregamento extends Thread {
    private Thread iniciarGeradorPdf;

    public BarraDeCarregamento(Thread iniciarGeradorPdf) {
        this.iniciarGeradorPdf = iniciarGeradorPdf;
    }

    @Override
    public void run() {
        System.out.print("Loading ");
        while (true){
            try {
                Thread.sleep(100);

                if (!iniciarGeradorPdf.isAlive()){
                    break;
                }
                System.out.print("#");

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }


    }
}

