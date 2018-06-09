package commom.solid;


public class Copier {
        static IReader reader = new ScannerReader();
        static IWriter writer = new DiskWriter();

	public static void copy() throws Exception {
	  String inputValue = "";

            while (!(inputValue = reader.read()).equals("-1")) {
                    writer.write(inputValue);
            }
	}

}