package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		List<TaxPayer> list = new ArrayList<>(); 
		
		System.out.print("Quantos contribuintes você vai digitar? ");
		n = sc.nextInt();
		
		System.out.println();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Digite os dados do " + (i+1) + "o contribuinte:");
			System.out.print("Renda anual com salário: ");
			Double salaryIncome = sc.nextDouble();
			System.out.print("Renda anual com prestação de serviço: ");
			Double serviceIncome = sc.nextDouble();
			System.out.print("Renda anual com ganho de capital: ");
			Double capitalIncome = sc.nextDouble();
			System.out.print("Gastos médicos: ");
			Double healthSpending = sc.nextDouble();
			System.out.print("Gastos educacionais: ");
			Double educationSpending = sc.nextDouble();
			
			TaxPayer taxPayer = new TaxPayer(salaryIncome, serviceIncome, capitalIncome, healthSpending, educationSpending);
			
			list.add(taxPayer);
			
			System.out.println();
		}
		
		System.out.println();
		
		int i = 1;		
		
		for (TaxPayer tax : list) {			
			System.out.println("Resumo do " + i + "o contribuinte:");
			System.out.println(tax);
			i+=1;
		}
				
		
		sc.close();

	}

}
