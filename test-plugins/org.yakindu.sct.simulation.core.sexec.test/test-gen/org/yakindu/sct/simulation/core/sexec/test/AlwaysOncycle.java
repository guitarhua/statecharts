/* Generated by YAKINDU Statechart Tools code generator. */
package org.yakindu.sct.simulation.core.sexec.test;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.yakindu.sct.model.sexec.ExecutionFlow;
import org.yakindu.sct.model.sexec.interpreter.test.util.AbstractExecutionFlowTest;
import org.yakindu.sct.model.sexec.interpreter.test.util.SExecInjectionProvider;
import org.yakindu.sct.test.models.SCTUnitTestModels;
import com.google.inject.Inject;
import static org.junit.Assert.*;

/**
 * Unit TestCase for AlwaysOncycle
 */
@SuppressWarnings("all")
@RunWith(XtextRunner.class)
@InjectWith(SExecInjectionProvider.class)
public class AlwaysOncycle extends AbstractExecutionFlowTest {
	
	@Before
	public void setup() throws Exception{
		ExecutionFlow flow = models.loadExecutionFlowFromResource("AlwaysOncycle.sct");
		initInterpreter(flow);
	}
	@Test
	public void alwaysOnCycleTest() throws Exception {
		interpreter.enter();
		assertTrue(isStateActive("StateA"));
		long count = 0l;
		while(count < 5l) {
			timer.timeLeap(getCyclePeriod());
			assertTrue(isStateActive("StateA"));
			count++;
		}
		assertTrue((getInteger("value") == 5l));
		timer.timeLeap(getCyclePeriod());
		assertTrue(isStateActive("StateB"));
		assertTrue(getInteger("value") == 0l);
		count = 0l;
		while(count < 5l) {
			timer.timeLeap(getCyclePeriod());
			assertTrue(isStateActive("StateB"));
			count++;
		}
		assertTrue((getInteger("value") == 5l));
		assertTrue((getInteger("x") == 5l));
		assertTrue((getInteger("y") == 5l));
		timer.timeLeap(getCyclePeriod());
		assertTrue(isStateActive("StateA"));
		assertTrue(getInteger("value") == 0l);
	}
}
