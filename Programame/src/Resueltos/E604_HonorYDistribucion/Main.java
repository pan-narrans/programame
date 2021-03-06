package Resueltos.E604_HonorYDistribucion;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

  static java.util.Scanner in;

  public static void casoDePrueba() {
    ArrayList<Character> chars = new ArrayList<Character>();
    int suma = 0, distribution = 0;

    for (int i = 0; i < 26; i++)
      chars.add(in.next().charAt(0));

    // Special cards values
    suma += Collections.frequency(chars, 'A') * 4;
    suma += Collections.frequency(chars, 'K') * 3;
    suma += Collections.frequency(chars, 'Q') * 2;
    suma += Collections.frequency(chars, 'J');

    // Suit card values
    distribution = Collections.frequency(chars, 'C');
    if (distribution < 3)
      suma += 3 - distribution;

    distribution = Collections.frequency(chars, 'D');
    if (distribution < 3)
      suma += 3 - distribution;

    distribution = Collections.frequency(chars, 'P');
    if (distribution < 3)
      suma += 3 - distribution;

    distribution = Collections.frequency(chars, 'T');
    if (distribution < 3)
      suma += 3 - distribution;

    // Finish
    System.out.println(suma);
  }

  public static void main(String args[]) {
    // Scanner
    in = new java.util.Scanner(System.in);

    // Nº de casos
    int numCasos = in.nextInt();
    for (int i = 0; i < numCasos; i++)
      casoDePrueba();
  }

}