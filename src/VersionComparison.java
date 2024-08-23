
public class VersionComparison {
	
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
    	
    	
    	
    	
//               String [] a = {"4","2","2","1256"};
//                int b=6;
//                int zero=0;
//                
//                for(int i=0; i<a.length; i++) {	
//                	    int version=Integer.parseInt(a[i]);
//                	    if ((version > b) ) {
//                	    	System.out.println("BPI ++");
//                	    }else if(version==b) {
//                	    	int version2=Integer.parseInt(a[i+1]);
//                	    	if(version2>zero) {
//                	    		System.out.println("Version is greater than threshold");
//                	    	}
//                	    }else {
//                	    	System.out.println("Version is less than threshold");
//                	    }
//                	    break;
//                }
     
 
    	
//    	
//    	String[] a = {"6","2","2","6"}; 
//    	String [] b= {"6"};
//    	String threshold = "0";
//    	boolean temp = false;
//
//    	for(int i=0;i<a.length;i++)
//    	{
//    	if(i<b.length) {  // i<threshold.count()
//    	threshold=b[i];
//    	} 
//    	else { 
//    	tempthreshold =0;
//    	
//    	}
//
//
//    	if(string[i]>tempthreshold){    
//    	version++;
//    	break;
//    	}
//    	else if(string[i]==tempthreshold){   
//
//    	}
//    	else{
//    	outdated;
//    	}
//    	}
//
//    	
    	
    	
    	
//        String version = "6.2.2.6";
//        String threshold = "6";
//        int VersionUptodate=0;
//        int a=0;
//
//        int result = compareVersions(version, threshold);
//
//        System.out.println(result > 0 ? "Version is greater than Threshold" :
//                           result < 0 ? "Threshold is greater than Version" :
//                                       "Version and Threshold are equal");
//    }
//
//    private static int compareVersions(String version, String threshold) {
//        String[] versionParts = version.split("\\.");
//        String[] thresholdParts = threshold.split("\\.");
//
//        int minLength = versionParts.length;
//
//        for (int i = 0; i < minLength; i++) {
//            int versionPart = Integer.parseInt(versionParts[i]);
//            int thresholdPart = Integer.parseInt(thresholdParts[i]);
//
//            if (versionPart > thresholdPart) {
//                VersionUptodate++;
//            }else {
//            	versionPart == thresholdPart;
//            }
//        }
//
//        // If all common parts are equal, check the length
//        return Integer.compare(versionParts.length, thresholdParts.length);
//    }
}
}
