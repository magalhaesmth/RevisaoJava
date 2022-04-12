
public class FolhaPagamento {
	private double quantidadeHoras;
	private double valorHoras;
	
	public double getSalarioBruto() {
		return quantidadeHoras*valorHoras;
	}
	public double getValorSindicato() {
		return (getSalarioBruto()*1.03)-getSalarioBruto();
	}
	public double getValorImpostoRenda() {
		if (getSalarioBruto()<=900) {
			return 0.;
		}else if (getSalarioBruto()<=1500) {
			double descontoImpostoRenda = (getSalarioBruto()*1.05)
					-getSalarioBruto();
			return descontoImpostoRenda;
		}else if (getSalarioBruto()<=2500) {
			return (getSalarioBruto()*1.1)
					-getSalarioBruto();
		}else {
			return (getSalarioBruto()*1.2)
					- getSalarioBruto();
			}
		}
		public double getFgts() {
			return (getSalarioBruto()*1.11)-getSalarioBruto();
		}
		public double getTotalDesconto() {
			return getValorImpostoRenda()+getValorSindicato();
		}
		public double getSalarioLiquido() {
			return getSalarioBruto() -getTotalDesconto() + getFgts();
		
	}
	@Override
		public String toString() {
			return "Salário Bruto: "+getSalarioBruto()+"\n"
					+"Salário Líquido: "+getSalarioLiquido();
	}
	
	public double getQuantidadeHoras() {
		return quantidadeHoras;
	}
	public void setQuantidadeHoras(double quantidadeHoras) {
		this.quantidadeHoras = quantidadeHoras;
	}
	public double getValorHoras() {
		return valorHoras;
	}
	public void setValorHoras(double valorHoras) {
		this.valorHoras = valorHoras;

	}

}
