
public class Data {
	
	static final int FORMATO_12H = 1;
	static final int FORMATO_24H = 2;
	private int dia, mes, ano;
	private int hora = -1;
	private int minuto = -1;
	private int segundo = -1;
	
	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public Data(int dia, int mes, int ano, int hor, int min, int seg) {
		this(dia, mes, ano);
		this.hora = hor; 
		this.minuto = min;
		this.segundo = seg;
	}
		public void imprimir(int formato) {
		
			if(hora == -1) {
				System.out.println(dia + "/" + mes + "/" + ano + "  ");
			}else {
		if(formato == FORMATO_12H) {
			if(this.hora > 12) {
			
				hora -=12;
				System.out.println(dia + "/" + mes + "/" + ano + "  " + hora + ":" + minuto + ":" + segundo + "PM" );
			
			}
			else {
				
				System.out.println(dia + "/" + mes + "/" + ano + "  " + hora + ":" + minuto + ":" + segundo + "AM" );
			}
		if(formato == FORMATO_24H)	{
			System.out.println(dia + "/" + mes + "/" + ano + "  " + hora + ":" + minuto + ":" + segundo);
			}
		}
			}
		}

		public int getDia() {
			return dia;
		}

		public int getMes() {
			return mes;
		}

		public int getAno() {
			return ano;
		}

		public int getHora() {
			return hora;
		}

		public int getMinuto() {
			return minuto;
		}

		public int getSegundo() {
			return segundo;
		}
	
}
