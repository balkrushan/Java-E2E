


package Calender;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GetInstance {

	
	public static void main(String[] args) throws ParseException {
		
		String a="2024-01-01";
		
//		long dte=Date.parse(a);
//		System.out.println(dte);
		
		Calendar cal=Calendar.getInstance();
		//System.out.println(cal.getTime());
//		Date d=cal.getTime();
//		SimpleDateFormat forma =new SimpleDateFormat("YYYY-MM-DD");
//		String date=forma.format(a);
//		System.out.println(forma.parse(date));
//		cal.setTime(forma.parse(date));
		int day=cal.DAY_OF_MONTH;
		System.out.println(day);
		
		  // create a calendar  
	     
	      // get the maximum value that year field can have  
//	     
//	  //    System.out.println("Maximum Month:" + month);  
//	      int day = cal.getActualMaximum(Calendar.DAY_OF_MONTH);  
//	      System.out.println("Maximum DAY:" + day);
//	      cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
//	      
//	   }  
		
		JFrame f=new JFrame();//creating instance of JFrame  
        
		JButton b=new JButton("click");//creating instance of JButton  
		b.setBounds(130,100,100, 40);//x axis, y axis, width, height  
		          
		f.add(b);//adding button in JFrame  
		          
		f.setSize(400,500);//400 width and 500 height  
		f.setLayout(null);//using no layout managers  
		f.setVisible(true);//making the frame visible
		
		
	}
}
