package gs_Dp;

import java.util.Scanner;

public class AtendeVendas {
    
	public static void main(String[] args) {
        try (Scanner le = new Scanner(System.in)) {
			FilaMensagens fila = new FilaMensagens();
			Cliente clientes[] = new Cliente[10];
			int n = 0;
			int opcao;

			do {
			    System.out.println("\n 0- para sair do sistema ");
			    System.out.println(" 1- para enviar mensagem de compra");
			    System.out.println(" 2- Processar e responder mensagem de compra ");
			    System.out.print("Digite opção: ");
			    opcao = le.nextInt();

			    switch (opcao) {
			        case 0:
			            System.out.println("Finalizado o atendimento");
			            break;
			        case 1:
			            System.out.print("Digite seu CPF: ");
			            String cpf = le.next();
			            int i;
			            boolean achou = false;
			            i = 0;

			            while (i < n && !achou) {
			                if (clientes[i].getCpf().equals(cpf))
			                    achou = true;
			                else
			                    i++;
			            }

			            if (!achou) {
			                System.out.println("Fazendo o cadastro deste CPF...");
			                System.out.print("Digite seu nome: ");
			                String nome = le.next();
			                System.out.print("Informe contato whatsapp: ");
			                String cel = le.next();
			                Cliente cli = new Cliente(cpf, nome, cel);
			                clientes[n] = cli;
			                n++;
			            }

			            System.out.println("Digite mensagem a ser enviada: ");
			            le.nextLine();
			            String msg = le.nextLine();
			            Mensagem m = new Mensagem(clientes[i], msg);
			            fila.enqueue(m);
			            break;
			        case 2:
			            if (!fila.isEmpty()) {
			                m = fila.dequeue();
			                System.out.println("Enviado pelo cliente: " + m.getCliente());
			                System.out.println("Mensagem: " + m.getTexto());
			            } else
			            
			                System.out.println("Não há mensagens na fila");
			            break;
			        default:
			            System.out.println("Opção inválida!");
			    }
			} while (opcao != 0);
		}
    }
}