// Jose Eduardo Afonso Capellotto França - 2151324
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PlataformaStreaming plataforma = new PlataformaStreaming();
        ListaDeAssistidos listaDeAssistidos = new ListaDeAssistidos();
        Recomendacao recomendacao = new Recomendacao(plataforma);
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar Filme");
            System.out.println("2. Adicionar Série");
            System.out.println("3. Listar Filmes");
            System.out.println("4. Listar Séries");
            System.out.println("5. Assistir Filme");
            System.out.println("6. Assistir Série");
            System.out.println("7. Recomendar Filmes e Séries");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Digite o título do filme: ");
                    String tituloFilme = scanner.nextLine();
                    System.out.print("Digite o gênero do filme: ");
                    String generoFilme = scanner.nextLine();
                    System.out.print("Digite a duração do filme (em minutos): ");
                    int duracaoFilme = scanner.nextInt();
                    plataforma.adicionarFilme(new Filme(tituloFilme, generoFilme, duracaoFilme));
                    System.out.println("Filme adicionado com sucesso!");
                    break;
                case 2:
                    System.out.print("Digite o título da série: ");
                    String tituloSerie = scanner.nextLine();
                    System.out.print("Digite o gênero da série: ");
                    String generoSerie = scanner.nextLine();
                    System.out.print("Digite o número de temporadas da série: ");
                    int temporadasSerie = scanner.nextInt();
                    plataforma.adicionarSerie(new Serie(tituloSerie, generoSerie, temporadasSerie));
                    System.out.println("Série adicionada com sucesso!");
                    break;
                case 3:
                    System.out.println("Filmes disponíveis:");
                    for (Filme filme : plataforma.getFilmes()) {
                        System.out.println(filme);
                    }
                    break;
                case 4:
                    System.out.println("Séries disponíveis:");
                    for (Serie serie : plataforma.getSeries()) {
                        System.out.println(serie);
                    }
                    break;
                case 5:
                    System.out.print("Digite o título do filme que deseja assistir: ");
                    String tituloAssistirFilme = scanner.nextLine();
                    for (Filme filme : plataforma.getFilmes()) {
                        if (filme.getTitulo().equalsIgnoreCase(tituloAssistirFilme)) {
                            listaDeAssistidos.adicionarAssistido(filme);
                            System.out.println("Você assistiu: " + filme.getTitulo());
                        }
                    }
                    break;
                case 6:
                    System.out.print("Digite o título da série que deseja assistir: ");
                    String tituloAssistirSerie = scanner.nextLine();
                    for (Serie serie : plataforma.getSeries()) {
                        if (serie.getTitulo().equalsIgnoreCase(tituloAssistirSerie)) {
                            listaDeAssistidos.adicionarAssistido(serie);
                            System.out.println("Você assistiu: " + serie.getTitulo());
                        }
                    }
                    break;
                case 7:
                    System.out.println("Recomendações:");
                    for (Object recomendacaoItem : recomendacao.recomendar()) {
                        System.out.println(recomendacaoItem);
                    }
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}