package pt.diogo.jwallet;

public class Utils {

	public String[] Parser(String inputLine) {

		String[] parsedLine = inputLine.split(" ");
		return parsedLine;
	}

	public int deconstruct(String value) {
		int valueInt = 0;

		if (value.charAt(value.length() - 1) == 'e') {
			value = value.substring(0, value.length() - 1);
			if (value.contains(".")) {
				int decimals = (value.length() - value.indexOf('.')) - 1;
				int i = value.indexOf('.') + 2;
				value = value.replace(".", "");

				if (value.length() == 2) {
					valueInt = Integer.parseInt(value);
					valueInt = valueInt * 10;
				} else if (decimals >= 3) {
					value = value.substring(0, i);
					valueInt = Integer.parseInt(value);
				}
			} else {
				valueInt = Integer.parseInt(value);
				valueInt = valueInt * 100;
			}

		} else if (value.charAt(value.length() - 1) == 'c') {
			value = value.substring(0, value.length() - 1);
			valueInt = Integer.parseInt(value);

		} else {
			System.out.print("Invalid value!");
			valueInt = 0;

		}
		// System.out.print(valueInt);
		return valueInt;
	}
}
