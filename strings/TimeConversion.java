/* 
  @author yashw
  
  Given a time in -hour AM/PM format, convert it to military (24-hour) time.
  Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
  - 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.

*/
public class TimeConversion {
	public static void main(String[] args) {
        String time12Hour = "07:05:45PM";
        String time24Hour = convert12HourTo24Hour(time12Hour);
        System.out.println("12 Hour Format to 24 Hour Format");
        System.out.println("12-hour time: " + time12Hour);
        System.out.println("24-hour time: " + time24Hour);
        
        String time24 = "15:30:45";
        String time12 = convert24HourTo12Hour(time24);
        System.out.println();
        System.out.println("24 Hour Format to 12 Hour Format");
        System.out.println("24-hour time: " + time24);
        System.out.println("12-hour time: " + time12);
        
	}


	private static String convert12HourTo24Hour(String time12Hour) {
		String[] parts = time12Hour.split(":");
		
        if (parts.length != 3) {
            // Handle invalid input format
            return "Invalid input format";
        }
        
        int hour = Integer.parseInt(parts[0]);
        int minute = Integer.parseInt(parts[1]);
        
        String lastPart = parts[2];
        
        int second = Integer.parseInt(lastPart.substring(0, 2)); // Extract seconds
        
        String amPm = lastPart.substring(2); // Extract AM/PM
        
        
        if (amPm.equalsIgnoreCase("PM") && hour < 12) {
            hour += 12;
        } else if (amPm.equalsIgnoreCase("AM") && hour == 12) {
            hour = 0;
        }
        

        return String.format("%02d:%02d:%02d", hour, minute, second);
        
        
//        Using builtin functions
//        try {
//            SimpleDateFormat inputFormat = new SimpleDateFormat("hh:mm:ssa");
//            SimpleDateFormat outputFormat = new SimpleDateFormat("HH:mm:ss");
//            Date date = inputFormat.parse(time12Hour);
//            return outputFormat.format(date);
//        } catch (ParseException e) {
//            e.printStackTrace();
//            return "Invalid input format";
//        }
    }

	private static String convert24HourTo12Hour(String time24) {
		
		String parts[] = time24.split(":");
		
		if(parts.length !=3) return "Invalid input format";
		
		int hour = Integer.parseInt(parts[0]);
		int minute = Integer.parseInt(parts[1]);
		int second = Integer.parseInt(parts[2]);
		
		String ampm = (hour < 12) ? "AM" : "PM";
		
		if(hour == 0) hour = 12;
		
		else if(hour > 12) hour-= 12;
		
		return String.format("%02d:%02d:%02d%s", hour, minute, second, ampm);
		
//		Using builltin function
//		try {
//            SimpleDateFormat inputFormat = new SimpleDateFormat("HH:mm:ss");
//            SimpleDateFormat outputFormat = new SimpleDateFormat("hh:mm:ss a");
//            Date date = inputFormat.parse(time24Hour);
//            return outputFormat.format(date);
//        } catch (Exception e) {
//            e.printStackTrace();
//            return "Invalid input format";
//        }
	}
	
}
