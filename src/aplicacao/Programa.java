package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Circulo;
import entidades.Forma;
import entidades.Retangulo;
import entidades.enums.Cor;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Forma> list = new ArrayList<>();
		
		System.out.print("Informe o numero de formas: ");
		int num = sc.nextInt();
		
		for (int i=1; i<=num; i++) {
			System.out.println("Dados da " + i + "º forma:");
			System.out.print("Retangulo ou Circulo (r/c)? ");
			char res = sc.next().charAt(0);
			System.out.print("Cor (PRETO,AZUL,VERMELHO): ");
			String cor = sc.next();
			if (res == 'r') {
				System.out.print("Altura: ");
				double altura = sc.nextDouble();
				System.out.print("Largura: ");
				double largura = sc.nextDouble();
				list.add(new Retangulo(Cor.valueOf(cor), altura, largura));
			} else {
				System.out.print("Raio: ");
				double raio = sc.nextDouble();
				list.add(new Circulo(Cor.valueOf(cor), raio));
			}
		}
		
		System.out.println();
		System.out.println("Area das formas: ");
		for (Forma f : list) {
			System.out.println(String.format("%.2f", f.area()));
		}
		
		
		sc.close();
	}

}
