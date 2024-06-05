package gs_Dp;



	class FilaMensagens {
	    private static final int CAPACIDADE = 10;
	    private Mensagem[] fila;
	    private int inicio;
	    private int fim;
	    private int tamanho;

	    
	    public FilaMensagens() {
	        fila = new Mensagem[CAPACIDADE];
	        inicio = 0;
	        fim = -1;
	        tamanho = 0;
	    }

	    
	    public boolean isEmpty() {
	        return tamanho == 0;
	    }

	   
	    public boolean isFull() {
	        return tamanho == CAPACIDADE;
	    }

	    
	    public void enqueue(Mensagem mensagem) {
	        if (isFull()) {
	            System.out.println("A fila de mensagens está cheia.");
	            return;
	        }
	        fim = (fim + 1) % CAPACIDADE;
	        fila[fim] = mensagem;
	        tamanho++;
	    }

	    
	    public Mensagem dequeue() {
	        if (isEmpty()) {
	            System.out.println("A fila de mensagens está vazia.");
	            return null;
	        }
	        Mensagem mensagem = fila[inicio];
	        inicio = (inicio + 1) % CAPACIDADE;
	        tamanho--;
	        return mensagem;
	    }
	}

