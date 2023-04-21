package folha3_exercicio11;
import java.util.ArrayList;
import java.util.Scanner;
public class MenuVehicle {
    public static void main(String[] args) {
        ArrayList<Vehicle> listaVeiculos = new ArrayList<Vehicle>();
        Scanner scanner = new Scanner(System.in);

        int opcao = 0;
        for (int i = 1; i < 4; i++) {
            System.out.println("\nMenu de Opções:");
            System.out.println("1 - Adicionar veiculo");
            System.out.println("2 - Listar Veiculos");
            System.out.println("3 - Apagar um veiculo");
            System.out.println("4 - Termina");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\nAdicionar Veículo:");
                    System.out.print("Digite a placa do veículo: ");
                    String regNo = scanner.next();
                    System.out.print("Digite a marca do veículo: ");
                    String make = scanner.next();
                    System.out.print("Digite o ano de fabricação do veículo: ");
                    int yearOfManufacture = scanner.nextInt();
                    System.out.print("Digite o valor do veículo: ");
                    double value = scanner.nextDouble();
                    Vehicle novoVeiculo = new Vehicle(regNo, make, yearOfManufacture, value);
                    listaVeiculos.add(novoVeiculo);
                    System.out.println("\nVeículo adicionado com sucesso!");
                    break;

                case 2:
                    System.out.println("\nLista de Veículos:");
                    for (Vehicle vehicle : listaVeiculos) {
                        System.out.println("Placa: " + vehicle.getRegNo());
                        System.out.println("Marca: " + vehicle.getMake());
                        System.out.println("Ano de Fabricação: " + vehicle.getYearOfManufacture());
                        System.out.println("Valor: " + vehicle.getValue() + "\n");
                    }
                    break;

                case 3:
                    System.out.println("\nApagar um Veículo:");
                    System.out.print("Digite a placa do veículo a ser apagado: ");
                    String placa = scanner.next();
                    boolean apagado = false;
                    for (Vehicle veiculo : listaVeiculos) {
                        if (veiculo.getRegNo().equals(placa)) {
                            listaVeiculos.remove(veiculo);
                            apagado = true;
                            System.out.println("\nVeículo apagado com sucesso!");
                            break;
                        }
                    }
                    if (!apagado) {
                        System.out.println("\nVeículo não encontrado!");
                    }
                    break;

                case 4:
                    System.out.println("\nPrograma encerrado.");
                    break;

                default:
                    System.out.println("\nOpção inválida! Digite uma opção válida.");
                    break;
            }
        }

    }
}

