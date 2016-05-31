package mysource.core.util;

/**
 * 日期、时间工具类
 */
public class DateUtil {

	/** 定义每月的天数 */
	static int[] DAYS = { 0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };  
    
    /** 
     * 校验格式为 “yyyy-MM-dd HH:mm:ss” 的时间字符串是否合法
     * 
     * @param date 
     * 			待检验的时间字符串 
     * @return 
     * 			true, 合法; false, 非法
     */  
	public static boolean isValidDate(String date) {
		try {
			// 年份校验
			int year = Integer.parseInt(date.substring(0, 4));
			if (year <= 0) {
				return false;
			}				
			// 月份校验
			int month = Integer.parseInt(date.substring(5, 7));
			if (month <= 0 || month > 12) {
				return false;
			}
			// 天数校验	
			int day = Integer.parseInt(date.substring(8, 10));
			if (day <= 0 || day > DAYS[month]) {
				return false;
			}
			// 闰年2月天数校验	
			if (month == 2 && day == 29 && !isGregorianLeapYear(year)) {
				return false;
			}
			// 小时校验
			int hour = Integer.parseInt(date.substring(11, 13));
			if (hour < 0 || hour > 23) {
				return false;
			}
			// 分钟校验	
			int minute = Integer.parseInt(date.substring(14, 16));
			if (minute < 0 || minute > 59) {
				return false;
			}
			// 秒数校验	
			int second = Integer.parseInt(date.substring(17, 19));
			if (second < 0 || second > 59) {
				return false;
			}				
		} catch (Exception e) {
			return false;
		}
		return true;
	} 
    
	/**
	 * 判断指定年份是否为闰年
	 * 
	 * @param year
	 * 			待校验的年份
	 * @return 
	 * 			true, 是; false, 否
	 */
    public static final boolean isGregorianLeapYear(int year) {  
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);  
    }
    
    public static void main(String[] args) {  
        System.out.println(isValidDate("2016-04-21 00:00:00"));  
    }  

}
