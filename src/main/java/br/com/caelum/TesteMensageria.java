package br.com.caelum;

public class TesteMensageria {

	public static void main(String[] args) {

		if(args.length == 0 ) {
			System.out.println("use \"envia\" ou \"consome\" como parametro");
			return;
		}
		
		
		ConectorJms conectorJms = new ConectorJms();

		switch (args[0]) {
			case "envia": {
				int max = parseMax(args);
				conectorJms.enviaMensagens(max);
				break;
			}
			case "consome": {
				conectorJms.consomeMensagens();
			}
		}
		
		conectorJms.close();
	}

	private static int parseMax(String[] args) {
		
		if (args.length < 2 || args[1] == null) {
			return 1;
		}
		return Integer.parseInt(args[1]);
	}

}
