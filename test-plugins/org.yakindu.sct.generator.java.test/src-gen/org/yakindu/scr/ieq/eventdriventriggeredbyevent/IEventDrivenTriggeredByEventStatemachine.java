package org.yakindu.scr.ieq.eventdriventriggeredbyevent;

import java.util.LinkedList;
import java.util.Queue;
import org.yakindu.scr.ieq.IStatemachine;
import org.yakindu.scr.ieq.ITimerCallback;

public interface IEventDrivenTriggeredByEventStatemachine extends ITimerCallback,IStatemachine {
	public interface SCInterface {
	
		public void raiseE();
		
		public long getX();
		
		public void setX(long value);
		
	}
	
	public SCInterface getSCInterface();
	
}
