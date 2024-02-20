
public class Substring {
	
	
	static int VersionUptodate=0;
	
	
	
    public static void main(String[] args) {
    	
    	
    	
    	
    	String a="Balkrushan";
    	String b=a.substring(0,4 ).replace("l","");
    	System.out.println(b);
    	
    	double multiplier=Math.pow(10,2);
    	
    String firmware = "6.2.0.1054";
    	String Value = firmware.substring(0, firmware.indexOf(".") + 1);
    	String subValue = firmware.substring(firmware.indexOf(".") + 1).replace(".", "");
    	double val = Double.parseDouble(Value+subValue);
    	System.out.println(val);

}
}
