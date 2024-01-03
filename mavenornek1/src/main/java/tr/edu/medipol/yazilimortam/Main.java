package tr.edu.medipol.yazilimortam;

import org.apache.commons.lang3.StringUtils;
import org.w3c.dom.ls.LSOutput;

public class Main {
	
public static void main(String arg[]) {
	String hataliMetin = "M  e  d     i p   o   l";
	System.out.println("Hatalı Metin:"+hataliMetin);
	String duzgunMetin =StringUtils.deleteWhitespace(hataliMetin);
	System.out.println("Düzgün Metin:"+duzgunMetin);
}

}
