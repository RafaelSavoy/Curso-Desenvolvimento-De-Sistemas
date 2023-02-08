package CalcularViagem;

class CalcularViagem{
    public static void main(String[] args) {
        int distancia=1800;
        int kilometrosPorLitro=7;
        double precoDaGasolina=4.99;
        double totalLitros = distancia / kilometrosPorLitro;

        double valordaViagem = precoDaGasolina * totalLitros;
        System.out.println("o preco da viagem é: R$" + valordaViagem);
    }

}