/**
 * Copyright (c) 2013 committers of YAKINDU and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of YAKINDU - initial API and implementation
 */
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
import static org.junit.Assert.assertTrue;
/**
 *  Unit TestCase for STextKeywordsInStatesAndRegions
 */
@SuppressWarnings("all")
@RunWith(XtextRunner.class)
@InjectWith(SExecInjectionProvider.class)
public class STextKeywordsInStatesAndRegionsTest
		extends
			AbstractExecutionFlowTest {
	@Inject
	private SCTUnitTestModels models;
	@Before
	public void setup() throws Exception {
		ExecutionFlow flow = models
				.loadExecutionFlowFromResource("STextKeywordsInStatesAndRegions.sct");
		initInterpreter(flow);
	}
	@Test
	public void activeCheckWithSTextNamedStates() throws Exception {
		interpreter.enter();
		assertTrue(isActive("namespace"));
		assertTrue(isActive("interface"));
		assertTrue(isActive("event"));
		assertTrue(isActive("in"));
		assertTrue(isActive("var"));
		assertTrue(isActive("external"));
		assertTrue(isActive("default"));
		assertTrue(isActive("entry"));
		assertTrue(isActive("always"));
		assertTrue(isActive("raise"));
		assertTrue(isActive("active"));
		assertTrue(isActive("interface"));
		assertTrue(isActive("event"));
		assertTrue(isActive("in"));
		assertTrue(isActive("var"));
		assertTrue(isActive("external"));
		assertTrue(isActive("default"));
		assertTrue(isActive("entry"));
		assertTrue(isActive("always"));
		assertTrue(isActive("raise"));
		raiseEvent("e1");
		interpreter.runCycle();
		assertTrue(isActive("namespace"));
		assertTrue(isActive("internal"));
		assertTrue(isActive("event"));
		assertTrue(isActive("in"));
		assertTrue(isActive("var"));
		assertTrue(isActive("external"));
		assertTrue(isActive("default"));
		assertTrue(isActive("entry"));
		assertTrue(isActive("always"));
		assertTrue(isActive("raise"));
		assertTrue(isActive("active"));
		assertTrue(isActive("interface"));
		assertTrue(isActive("event"));
		assertTrue(isActive("in"));
		assertTrue(isActive("var"));
		assertTrue(isActive("external"));
		assertTrue(isActive("default"));
		assertTrue(isActive("entry"));
		assertTrue(isActive("always"));
		assertTrue(isActive("raise"));
		raiseEvent("e2");
		interpreter.runCycle();
		assertTrue(isActive("namespace"));
		assertTrue(isActive("internal"));
		assertTrue(isActive("local"));
		assertTrue(isActive("in"));
		assertTrue(isActive("var"));
		assertTrue(isActive("external"));
		assertTrue(isActive("default"));
		assertTrue(isActive("entry"));
		assertTrue(isActive("always"));
		assertTrue(isActive("raise"));
		assertTrue(isActive("active"));
		assertTrue(isActive("interface"));
		assertTrue(isActive("event"));
		assertTrue(isActive("in"));
		assertTrue(isActive("var"));
		assertTrue(isActive("external"));
		assertTrue(isActive("default"));
		assertTrue(isActive("entry"));
		assertTrue(isActive("always"));
		assertTrue(isActive("raise"));
		raiseEvent("e1");
		interpreter.runCycle();
		assertTrue(isActive("namespace"));
		assertTrue(isActive("internal"));
		assertTrue(isActive("local"));
		assertTrue(isActive("out"));
		assertTrue(isActive("var"));
		assertTrue(isActive("external"));
		assertTrue(isActive("default"));
		assertTrue(isActive("entry"));
		assertTrue(isActive("always"));
		assertTrue(isActive("raise"));
		assertTrue(isActive("active"));
		assertTrue(isActive("interface"));
		assertTrue(isActive("event"));
		assertTrue(isActive("in"));
		assertTrue(isActive("var"));
		assertTrue(isActive("external"));
		assertTrue(isActive("default"));
		assertTrue(isActive("entry"));
		assertTrue(isActive("always"));
		assertTrue(isActive("raise"));
		raiseEvent("e2");
		interpreter.runCycle();
		assertTrue(isActive("namespace"));
		assertTrue(isActive("internal"));
		assertTrue(isActive("local"));
		assertTrue(isActive("out"));
		assertTrue(isActive("readonly"));
		assertTrue(isActive("external"));
		assertTrue(isActive("default"));
		assertTrue(isActive("entry"));
		assertTrue(isActive("always"));
		assertTrue(isActive("raise"));
		assertTrue(isActive("active"));
		assertTrue(isActive("interface"));
		assertTrue(isActive("event"));
		assertTrue(isActive("in"));
		assertTrue(isActive("var"));
		assertTrue(isActive("external"));
		assertTrue(isActive("default"));
		assertTrue(isActive("entry"));
		assertTrue(isActive("always"));
		assertTrue(isActive("raise"));
		raiseEvent("e1");
		interpreter.runCycle();
		assertTrue(isActive("namespace"));
		assertTrue(isActive("internal"));
		assertTrue(isActive("local"));
		assertTrue(isActive("out"));
		assertTrue(isActive("readonly"));
		assertTrue(isActive("operation"));
		assertTrue(isActive("default"));
		assertTrue(isActive("entry"));
		assertTrue(isActive("always"));
		assertTrue(isActive("raise"));
		assertTrue(isActive("active"));
		assertTrue(isActive("interface"));
		assertTrue(isActive("event"));
		assertTrue(isActive("in"));
		assertTrue(isActive("var"));
		assertTrue(isActive("external"));
		assertTrue(isActive("default"));
		assertTrue(isActive("entry"));
		assertTrue(isActive("always"));
		assertTrue(isActive("raise"));
		raiseEvent("e2");
		interpreter.runCycle();
		assertTrue(isActive("namespace"));
		assertTrue(isActive("internal"));
		assertTrue(isActive("local"));
		assertTrue(isActive("out"));
		assertTrue(isActive("readonly"));
		assertTrue(isActive("operation"));
		assertTrue(isActive("else"));
		assertTrue(isActive("entry"));
		assertTrue(isActive("always"));
		assertTrue(isActive("raise"));
		assertTrue(isActive("active"));
		assertTrue(isActive("interface"));
		assertTrue(isActive("event"));
		assertTrue(isActive("in"));
		assertTrue(isActive("var"));
		assertTrue(isActive("external"));
		assertTrue(isActive("default"));
		assertTrue(isActive("entry"));
		assertTrue(isActive("always"));
		assertTrue(isActive("raise"));
		raiseEvent("e1");
		interpreter.runCycle();
		assertTrue(isActive("namespace"));
		assertTrue(isActive("internal"));
		assertTrue(isActive("local"));
		assertTrue(isActive("out"));
		assertTrue(isActive("readonly"));
		assertTrue(isActive("operation"));
		assertTrue(isActive("else"));
		assertTrue(isActive("exit"));
		assertTrue(isActive("always"));
		assertTrue(isActive("raise"));
		assertTrue(isActive("active"));
		assertTrue(isActive("interface"));
		assertTrue(isActive("event"));
		assertTrue(isActive("in"));
		assertTrue(isActive("var"));
		assertTrue(isActive("external"));
		assertTrue(isActive("default"));
		assertTrue(isActive("entry"));
		assertTrue(isActive("always"));
		assertTrue(isActive("raise"));
		raiseEvent("e2");
		interpreter.runCycle();
		assertTrue(isActive("namespace"));
		assertTrue(isActive("internal"));
		assertTrue(isActive("local"));
		assertTrue(isActive("out"));
		assertTrue(isActive("readonly"));
		assertTrue(isActive("operation"));
		assertTrue(isActive("else"));
		assertTrue(isActive("exit"));
		assertTrue(isActive("oncycle"));
		assertTrue(isActive("raise"));
		assertTrue(isActive("active"));
		assertTrue(isActive("interface"));
		assertTrue(isActive("event"));
		assertTrue(isActive("in"));
		assertTrue(isActive("var"));
		assertTrue(isActive("external"));
		assertTrue(isActive("default"));
		assertTrue(isActive("entry"));
		assertTrue(isActive("always"));
		assertTrue(isActive("raise"));
		raiseEvent("e1");
		interpreter.runCycle();
		assertTrue(isActive("namespace"));
		assertTrue(isActive("internal"));
		assertTrue(isActive("local"));
		assertTrue(isActive("out"));
		assertTrue(isActive("readonly"));
		assertTrue(isActive("operation"));
		assertTrue(isActive("else"));
		assertTrue(isActive("exit"));
		assertTrue(isActive("oncycle"));
		assertTrue(isActive("valueof"));
		assertTrue(isActive("active"));
		assertTrue(isActive("interface"));
		assertTrue(isActive("event"));
		assertTrue(isActive("in"));
		assertTrue(isActive("var"));
		assertTrue(isActive("external"));
		assertTrue(isActive("default"));
		assertTrue(isActive("entry"));
		assertTrue(isActive("always"));
		assertTrue(isActive("raise"));
		raiseEvent("e2");
		interpreter.runCycle();
		assertTrue(isActive("namespace"));
		assertTrue(isActive("internal"));
		assertTrue(isActive("local"));
		assertTrue(isActive("out"));
		assertTrue(isActive("readonly"));
		assertTrue(isActive("operation"));
		assertTrue(isActive("else"));
		assertTrue(isActive("exit"));
		assertTrue(isActive("oncycle"));
		assertTrue(isActive("valueof"));
		assertTrue(isActive("namespace"));
		assertTrue(isActive("interface"));
		assertTrue(isActive("event"));
		assertTrue(isActive("in"));
		assertTrue(isActive("var"));
		assertTrue(isActive("external"));
		assertTrue(isActive("default"));
		assertTrue(isActive("entry"));
		assertTrue(isActive("always"));
		assertTrue(isActive("raise"));
		raiseEvent("e1");
		interpreter.runCycle();
		assertTrue(isActive("namespace"));
		assertTrue(isActive("internal"));
		assertTrue(isActive("local"));
		assertTrue(isActive("out"));
		assertTrue(isActive("readonly"));
		assertTrue(isActive("operation"));
		assertTrue(isActive("else"));
		assertTrue(isActive("exit"));
		assertTrue(isActive("oncycle"));
		assertTrue(isActive("valueof"));
		assertTrue(isActive("namespace"));
		assertTrue(isActive("internal"));
		assertTrue(isActive("event"));
		assertTrue(isActive("in"));
		assertTrue(isActive("var"));
		assertTrue(isActive("external"));
		assertTrue(isActive("default"));
		assertTrue(isActive("entry"));
		assertTrue(isActive("always"));
		assertTrue(isActive("raise"));
		raiseEvent("e2");
		interpreter.runCycle();
		assertTrue(isActive("namespace"));
		assertTrue(isActive("internal"));
		assertTrue(isActive("local"));
		assertTrue(isActive("out"));
		assertTrue(isActive("readonly"));
		assertTrue(isActive("operation"));
		assertTrue(isActive("else"));
		assertTrue(isActive("exit"));
		assertTrue(isActive("oncycle"));
		assertTrue(isActive("valueof"));
		assertTrue(isActive("namespace"));
		assertTrue(isActive("internal"));
		assertTrue(isActive("local"));
		assertTrue(isActive("in"));
		assertTrue(isActive("var"));
		assertTrue(isActive("external"));
		assertTrue(isActive("default"));
		assertTrue(isActive("entry"));
		assertTrue(isActive("always"));
		assertTrue(isActive("raise"));
		raiseEvent("e1");
		interpreter.runCycle();
		assertTrue(isActive("namespace"));
		assertTrue(isActive("internal"));
		assertTrue(isActive("local"));
		assertTrue(isActive("out"));
		assertTrue(isActive("readonly"));
		assertTrue(isActive("operation"));
		assertTrue(isActive("else"));
		assertTrue(isActive("exit"));
		assertTrue(isActive("oncycle"));
		assertTrue(isActive("valueof"));
		assertTrue(isActive("namespace"));
		assertTrue(isActive("internal"));
		assertTrue(isActive("local"));
		assertTrue(isActive("out"));
		assertTrue(isActive("var"));
		assertTrue(isActive("external"));
		assertTrue(isActive("default"));
		assertTrue(isActive("entry"));
		assertTrue(isActive("always"));
		assertTrue(isActive("raise"));
		raiseEvent("e2");
		interpreter.runCycle();
		assertTrue(isActive("namespace"));
		assertTrue(isActive("internal"));
		assertTrue(isActive("local"));
		assertTrue(isActive("out"));
		assertTrue(isActive("readonly"));
		assertTrue(isActive("operation"));
		assertTrue(isActive("else"));
		assertTrue(isActive("exit"));
		assertTrue(isActive("oncycle"));
		assertTrue(isActive("valueof"));
		assertTrue(isActive("namespace"));
		assertTrue(isActive("internal"));
		assertTrue(isActive("local"));
		assertTrue(isActive("out"));
		assertTrue(isActive("readonly"));
		assertTrue(isActive("external"));
		assertTrue(isActive("default"));
		assertTrue(isActive("entry"));
		assertTrue(isActive("always"));
		assertTrue(isActive("raise"));
		raiseEvent("e1");
		interpreter.runCycle();
		assertTrue(isActive("namespace"));
		assertTrue(isActive("internal"));
		assertTrue(isActive("local"));
		assertTrue(isActive("out"));
		assertTrue(isActive("readonly"));
		assertTrue(isActive("operation"));
		assertTrue(isActive("else"));
		assertTrue(isActive("exit"));
		assertTrue(isActive("oncycle"));
		assertTrue(isActive("valueof"));
		assertTrue(isActive("namespace"));
		assertTrue(isActive("internal"));
		assertTrue(isActive("local"));
		assertTrue(isActive("out"));
		assertTrue(isActive("readonly"));
		assertTrue(isActive("operation"));
		assertTrue(isActive("default"));
		assertTrue(isActive("entry"));
		assertTrue(isActive("always"));
		assertTrue(isActive("raise"));
		raiseEvent("e2");
		interpreter.runCycle();
		assertTrue(isActive("namespace"));
		assertTrue(isActive("internal"));
		assertTrue(isActive("local"));
		assertTrue(isActive("out"));
		assertTrue(isActive("readonly"));
		assertTrue(isActive("operation"));
		assertTrue(isActive("else"));
		assertTrue(isActive("exit"));
		assertTrue(isActive("oncycle"));
		assertTrue(isActive("valueof"));
		assertTrue(isActive("namespace"));
		assertTrue(isActive("internal"));
		assertTrue(isActive("local"));
		assertTrue(isActive("out"));
		assertTrue(isActive("readonly"));
		assertTrue(isActive("operation"));
		assertTrue(isActive("else"));
		assertTrue(isActive("entry"));
		assertTrue(isActive("always"));
		assertTrue(isActive("raise"));
		raiseEvent("e1");
		interpreter.runCycle();
		assertTrue(isActive("namespace"));
		assertTrue(isActive("internal"));
		assertTrue(isActive("local"));
		assertTrue(isActive("out"));
		assertTrue(isActive("readonly"));
		assertTrue(isActive("operation"));
		assertTrue(isActive("else"));
		assertTrue(isActive("exit"));
		assertTrue(isActive("oncycle"));
		assertTrue(isActive("valueof"));
		assertTrue(isActive("namespace"));
		assertTrue(isActive("internal"));
		assertTrue(isActive("local"));
		assertTrue(isActive("out"));
		assertTrue(isActive("readonly"));
		assertTrue(isActive("operation"));
		assertTrue(isActive("else"));
		assertTrue(isActive("exit"));
		assertTrue(isActive("always"));
		assertTrue(isActive("raise"));
		raiseEvent("e2");
		interpreter.runCycle();
		assertTrue(isActive("namespace"));
		assertTrue(isActive("internal"));
		assertTrue(isActive("local"));
		assertTrue(isActive("out"));
		assertTrue(isActive("readonly"));
		assertTrue(isActive("operation"));
		assertTrue(isActive("else"));
		assertTrue(isActive("exit"));
		assertTrue(isActive("oncycle"));
		assertTrue(isActive("valueof"));
		assertTrue(isActive("namespace"));
		assertTrue(isActive("internal"));
		assertTrue(isActive("local"));
		assertTrue(isActive("out"));
		assertTrue(isActive("readonly"));
		assertTrue(isActive("operation"));
		assertTrue(isActive("else"));
		assertTrue(isActive("exit"));
		assertTrue(isActive("oncycle"));
		assertTrue(isActive("raise"));
		raiseEvent("e1");
		interpreter.runCycle();
		assertTrue(isActive("namespace"));
		assertTrue(isActive("internal"));
		assertTrue(isActive("local"));
		assertTrue(isActive("out"));
		assertTrue(isActive("readonly"));
		assertTrue(isActive("operation"));
		assertTrue(isActive("else"));
		assertTrue(isActive("exit"));
		assertTrue(isActive("oncycle"));
		assertTrue(isActive("valueof"));
		assertTrue(isActive("namespace"));
		assertTrue(isActive("internal"));
		assertTrue(isActive("local"));
		assertTrue(isActive("out"));
		assertTrue(isActive("readonly"));
		assertTrue(isActive("operation"));
		assertTrue(isActive("else"));
		assertTrue(isActive("exit"));
		assertTrue(isActive("oncycle"));
		assertTrue(isActive("valueof"));
		raiseEvent("e2");
		interpreter.runCycle();
		assertTrue(isActive("namespace"));
		assertTrue(isActive("internal"));
		assertTrue(isActive("local"));
		assertTrue(isActive("out"));
		assertTrue(isActive("readonly"));
		assertTrue(isActive("operation"));
		assertTrue(isActive("else"));
		assertTrue(isActive("exit"));
		assertTrue(isActive("oncycle"));
		assertTrue(isActive("valueof"));
		assertTrue(isActive("namespace"));
		assertTrue(isActive("internal"));
		assertTrue(isActive("local"));
		assertTrue(isActive("out"));
		assertTrue(isActive("readonly"));
		assertTrue(isActive("operation"));
		assertTrue(isActive("else"));
		assertTrue(isActive("exit"));
		assertTrue(isActive("oncycle"));
		assertTrue(isActive("valueof"));
	}
}
