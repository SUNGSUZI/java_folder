package com.naver;

public class Process1 {

	public void start() {
		Test1 t1 = new Test1();
		t1.me2();
		
		/*
		 * java.util.GregorianCalendar[ time=1728883685086, areFieldsSet=true,
		 * areAllFieldsSet=true, lenient=true, zone=sun.util.calendar.ZoneInfo [
		 * id="Asia/Seoul", offset=32400000, dstSavings=0, useDaylight=false,
		 * transitions=30, lastRule=null ], firstDayOfWeek=1, minimalDaysInFirstWeek=1,
		 * ERA=1, YEAR=2024, MONTH=9, // 0월부터 있음 +1을 해줘야함. WEEK_OF_YEAR=42,
		 * WEEK_OF_MONTH=3, DAY_OF_MONTH=14, DAY_OF_YEAR=288, DAY_OF_WEEK=2,
		 * DAY_OF_WEEK_IN_MONTH=2, AM_PM=1, HOUR=2, HOUR_OF_DAY=14, MINUTE=28, SECOND=5,
		 * MILLISECOND=86, ZONE_OFFSET=32400000, DST_OFFSET=0 ]
		 */
		
//		t1.me3();
//		t1.me4();
//		t1.me5();
//		t1.me6();
//		t1.me7();
//		t1.me8("2024-08-24");
		t1.me9();
	}

}
