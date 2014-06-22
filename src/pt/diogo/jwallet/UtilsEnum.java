package pt.diogo.jwallet;

public class UtilsEnum {

	public String[] Parser(String inputLine) {

		String[] parsedLine = inputLine.split(" ");
		return parsedLine;
	}

	public int deconstruct(String value) {
		int valueInt = 0;

		if (value.charAt(value.length() - 1) == 'e') {
			value = value.substring(0, value.length() - 1);
			valueInt = Integer.parseInt(value);
			valueInt = valueInt * 100;
			// System.out.print(toInt*100);
		} else if (value.charAt(value.length() - 1) == 'c') {
			value = value.substring(0, value.length() - 1);
			valueInt = Integer.parseInt(value);
			
		}
		return valueInt;
	}
}
