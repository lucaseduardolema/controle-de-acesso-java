package com.trybe.acc.java.controledeacesso;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * classe principal.
 */
public class Principal {

  /**
   * Método principal.
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean isFinished = false;
    Integer answer = 1;
    ArrayList<Integer> juniors = new ArrayList<Integer>();
    ArrayList<Integer> adults = new ArrayList<Integer>();
    ArrayList<Integer> seniors = new ArrayList<Integer>();

    while (!isFinished) {
      System.out.println("Entre com o número correspondente à opção desejada:\n"
          + "1 - Acessar o estabelecimento\n" + "2 - Finalizar sistema e mostrar relatório");
      answer = scanner.nextInt();

      if (answer == 1) {
        System.out.println("Entre com a sua idade:");
        int age = scanner.nextInt();

        if (age < 18) {
          juniors.add(age);
          System.out.println("Pessoa cliente menor de idade, catraca liberada!");
        } else if (age >= 18 && age < 50) {
          adults.add(age);
          System.out.println("Pessoa adulta, catraca liberada!");
        } else {
          seniors.add(age);
          System.out.println("Pessoa adulta a partir de 50, catraca liberada!");
        }
      } else if (answer == 2) {
        double total = juniors.size() + seniors.size() + adults.size();
        double perctJunior = (juniors.size() * 100) / total;
        double perctAdults = (adults.size() * 100) / total;
        double perctSenior = (seniors.size() * 100) / total;

        System.out.println("----- Quantidade -----\n" + "menores: " + juniors.size() + "\n"
            + "adultas: " + adults.size() + "\n" + "a partir de 50: " + seniors.size() + "\n");

        System.out.println("----- Percentual -----\n" + "menores: " + perctJunior + "%\n"
            + "adultas: " + perctAdults + "%\n" + "a partir de 50: " + perctSenior + "%\n");

        System.out.println("TOTAL: " + total);
        isFinished = true;
      } else {
        System.out.println("Entre com uma opção válida!");
      }
    }
    scanner.close();
  }
}
