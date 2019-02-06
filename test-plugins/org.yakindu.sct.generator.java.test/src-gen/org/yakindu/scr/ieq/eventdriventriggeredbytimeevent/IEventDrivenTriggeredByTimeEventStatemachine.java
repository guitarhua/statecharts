package org.yakindu.scr.ieq.eventdriventriggeredbytimeevent;

import java.util.LinkedList;
import java.util.Queue;
import org.yakindu.scr.ieq.IStatemachine;
import org.yakindu.scr.ieq.ITimerCallback;

public interface IEventDrivenTriggeredByTimeEventStatemachine extends ITimerCallback,IStatemachine {
	public interface SCInterface {
	
		public long getX();
		
		public void setX(long value);
		
		public long getTransition_count();
		
		public void setTransition_count(long value);
		
	}
	
	public SCInterface getSCInterface();
	
}
