package utils;

import java.util.Scanner;

import form.*;

public class FormFactory {
	
	@SuppressWarnings("unchecked")
	public static <F extends Form> F createForm(EForm form, double[] data) throws Exception {
		return switch (form) {
		case KREIS -> (F) new Kreis(data[0]);
		case DREIECK -> (F) new Dreieck(data[0], data[1], data[2]);
		case VIELECK -> (F) new Vieleck(new Kreis(data[0]), new Kreis(data[1]), (int)data[2]);
		case RECHTECK -> (F) new Rechteck(data[0], data[1]);
		};
	}

	@SuppressWarnings("unchecked")
	public static <F extends Form> F createForm(EForm form, Scanner scanner, Creatür creator) throws Exception {
			switch (form) {
			case KREIS :
				System.out.print("Radius des Kreises: ");
				double radius = scanner.nextDouble();
				return (F) new Kreis(radius);
			case DREIECK:
				System.out.print("Seitenlaengen des Dreiecks (durch kommata getrennt): ");
				var input = scanner.next();
				var inputArr = input.split(",");
				return (F) new Dreieck(Double.parseDouble(inputArr[0]), Double.parseDouble(inputArr[1]), Double.parseDouble(inputArr[2]));
			case VIELECK:
				System.out.print("Radius des Umkreis: ");
				var uRadius = scanner.nextDouble();
				System.out.print("Radius des Inkreis: ");
				var iRadius = scanner.nextDouble();
				System.out.print("Neckigkeit des Vielecks: ");
				var neckigkeit = scanner.nextDouble();
				double[] gPyraData = {uRadius,iRadius, neckigkeit};
				return (F) new Vieleck(new Kreis(uRadius), new Kreis(iRadius), (int)neckigkeit);
			case RECHTECK:
				System.out.print("Seitenlaengen des Rechtecks: ");
				var rInput = scanner.next();
				var rInputArr = rInput.split(",");
				return (F) new Rechteck(Double.parseDouble(rInputArr[0]), Double.parseDouble(rInputArr[1]));
			default:
				throw new Exception();
			}
	}
}
