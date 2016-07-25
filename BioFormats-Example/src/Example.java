import java.io.IOException;

import ij.ImagePlus;
import loci.formats.FormatException;
import loci.formats.in.TiffReader;
import loci.plugins.BF;

public class Example {

	
	public static void main(String[] args) throws FormatException, IOException {
		
		
		ImagePlus[] i = BF.openImagePlus("BigTIFFSamples/BigTIFF.tif");

		
		System.out.println("Loaded");
		//i[0].
		new PojoExplorer(i[0]);
		PojoExplorer.pausethread();
		
		System.out.println(i[0].getHeight());
		
		
		
	}
	
}
