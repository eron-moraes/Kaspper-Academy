import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Pai {
    private String nome;
    private String carteiraHabilitacao;
    private String atestadoCriminal;
    private String endereco;
    private String dadosVeiculo;
    private String dadosFilhos;
    private String nomeEscolaFaculdade;
    private String disponibilidade;

    public Pai(String nome, String carteiraHabilitacao, String atestadoCriminal, String endereco, String dadosVeiculo,
               String dadosFilhos, String nomeEscolaFaculdade, String disponibilidade) {
        this.nome = nome;
        this.carteiraHabilitacao = carteiraHabilitacao;
        this.atestadoCriminal = atestadoCriminal;
        this.endereco = endereco;
        this.dadosVeiculo = dadosVeiculo;
        this.dadosFilhos = dadosFilhos;
        this.nomeEscolaFaculdade = nomeEscolaFaculdade;
        this.disponibilidade = disponibilidade;
    }

    public String getNome() {
        return nome;
    }
    public String getDadosFilhos() {
        return dadosFilhos;
    }
    public String getDadosVeiculo() {
        return dadosVeiculo;
    }

    public String getNomeEscolaFaculdade() {
        return nomeEscolaFaculdade;
    }

    public String getDisponibilidade() {
        return disponibilidade;
    }
}

public class Main {
    private static List<Pai> pais = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao = 0;
        while (opcao != 3) {
            System.out.println("\n*** Bem vindo ao Sistema Marta Kaspper ***");
            System.out.println("Menu:");
            System.out.println("1. Cadastrar");
            System.out.println("2. Consultar");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do Scanner

            switch (opcao) {
                case 1:
                    cadastrarPai(scanner);
                    break;

                case 2:
                    exibirPais();
                    break;

                case 3:
                    System.out.println("Obrigado por usar o Programa Marta Kaspper!");
                    break;

                default:
                    System.out.println("Opção inválida. Escolha novamente.");
                    break;
            }
        }

        scanner.close();
    }

    public static void cadastrarPai(Scanner scanner) {
        System.out.print("Nome completo do pai/mãe: ");
        String nome = scanner.nextLine();
        System.out.print("Carteira de Habilitação: ");
        String carteiraHabilitacao = scanner.nextLine();
        System.out.print("Atestado de Antecedentes Criminais: ");
        String atestadoCriminal = scanner.nextLine();
        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();
        System.out.print("Dados do Veículo: ");
        String dadosVeiculo = scanner.nextLine();
        System.out.print("Nome da Escola ou Faculdade: ");
        String nomeEscolaFaculdade = scanner.nextLine();
        System.out.print("Nome do Filho: ");
        String dadosFilhos = scanner.nextLine();


        System.out.println("Escolha a disponibilidade de horário:");
        System.out.println("1. Escola (7:00)");
        System.out.println("2. Futebol (14:00)");
        System.out.println("3. Faculdade (18:00)");
        System.out.print("Escolha uma opção (1, 2 ou 3): ");
        int opcaoDisponibilidade = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do Scanner

        String disponibilidade;
        switch (opcaoDisponibilidade) {
            case 1:
                disponibilidade = "Escola (7:00)";
                break;
            case 2:
                disponibilidade = "Futebol (14:00)";
                break;
            case 3:
                disponibilidade = "Faculdade (18:00)";
                break;
            default:
                disponibilidade = "Opção inválida";
                break;
        }
        Pai pai = new Pai(nome, carteiraHabilitacao, atestadoCriminal, endereco, dadosVeiculo, dadosFilhos,
                nomeEscolaFaculdade, disponibilidade);
        pais.add(pai);

        System.out.println("Cadastro concluído com sucesso!");
    }

    public static void exibirPais() {
        if (pais.isEmpty()) {
            System.out.println("Nenhum pai/mãe cadastrado.");
        } else {
            System.out.println("Dados cadastrados:");
            for (Pai pai : pais) {
                System.out.println("Nome: " + pai.getNome());
                System.out.println("Filhos: " + pai.getDadosFilhos());
                System.out.println("Veiculo: " + pai.getDadosVeiculo());
                System.out.println("Escola: " + pai.getNomeEscolaFaculdade());
                System.out.println("Disponibilidade de horário: " + pai.getDisponibilidade());
                System.out.println();
            }
        }
    }
}

