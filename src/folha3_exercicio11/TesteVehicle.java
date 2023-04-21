package folha3_exercicio11;

public class TesteVehicle {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("ABC1234", "Toyota", 2020, 50000.0);

        System.out.println("informacao do veiculo:");
        System.out.println("Placa: " + vehicle.getRegNo());
        System.out.println("Marca: " + vehicle.getMake());
        System.out.println("ano de fabricação: " + vehicle.getYearOfManufacture());
        System.out.println("Valor: " + vehicle.getValue());

        vehicle.setValue(45000.0);
        System.out.println("valor atualizado: " + vehicle.getValue());

        SecondHandVehicle secondHandVehicle = new SecondHandVehicle("DEF5678", "Honda", 2015, 25000.0, 2);

        System.out.println("\ninformacoes do veiculo segunda mão:");
        System.out.println("placa: " + secondHandVehicle.getRegNo());
        System.out.println("marca: " + secondHandVehicle.getMake());
        System.out.println("ano de fabrico: " + secondHandVehicle.getYearOfManufacture());
        System.out.println("Valor: " + secondHandVehicle.getValue());
        System.out.println("Numero de proprietário: " + secondHandVehicle.getNumberOfOwners());
        System.out.println("tem múltiplos proprietário? " + secondHandVehicle.hasMultipleOwners());


        int anoAtual = 2023;
        int idade = secondHandVehicle.calculateAge(anoAtual);
        System.out.println("o veiculo de segunda mão tem: " + idade + " years");
    }
}