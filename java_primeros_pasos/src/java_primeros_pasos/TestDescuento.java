package java_primeros_pasos;

public class TestDescuento {

	public static void main(String[] args) {
		double valorCompra = 40;
		double descuento = 0;
		if (valorCompra < 200 && valorCompra>=100) {
		
			descuento = 0.1;
		}
		else if (valorCompra >= 200.0 && valorCompra < 300.0) {
			descuento = 0.15;
		}
		else if (valorCompra >= 300) {
			descuento = 0.2;
		} 
		double total = valorCompra - valorCompra*descuento;
		System.out.println(total);
	}
//	public static void main(String[] args) {
//
//        double valorCompra = 250.0;
//        double descuento = 0.0;
//
//        if (valorCompra >= 100.0 && valorCompra < 200.0) {
//            descuento = 10.0;
//        } else if (valorCompra >= 200.0 && valorCompra < 300.0) {
//            descuento = 15.0;
//        } else if (valorCompra >= 300.0) {
//            descuento = 20.0;
//        }
//
//        double valorFinal = valorCompra - (valorCompra * (descuento / 100));
//
//        System.out.println("Valor de la compra: $" + valorCompra);
//        System.out.println("Descuento: " + descuento + "%");
//        System.out.println("Valor final: $" + valorFinal);
//    }
	//resultado = 212.5

}
