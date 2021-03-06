/**
 * Copyright (c) 2017 committers of YAKINDU and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * 	committers of YAKINDU - initial API and implementation
 * 
 */
package org.yakindu.sct.ui.editor.validation;

import java.util.Collections;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.ui.editor.validation.IValidationIssueProcessor;
import org.eclipse.xtext.validation.Issue;
import org.yakindu.sct.model.sgraph.ui.validation.SCTIssue;

import com.google.inject.ImplementedBy;

/**
 * 
 *
 * @author Andreas Muelder - Initial contribution and API
 *
 */
@ImplementedBy(DefaultValidationIssueStore.class)
public interface IValidationIssueStore extends IValidationIssueProcessor {

	public interface IValidationIssueStoreListener {

		public void issuesChanged();
		
		public String getSemanticURI();
		
		public boolean notifyOnChildChange();

	}

	public void addIssueStoreListener(IValidationIssueStoreListener listener);

	public void removeIssueStoreListener(IValidationIssueStoreListener listener);

	public void connect(Resource resource);

	public void disconnect(Resource resource);

	public List<SCTIssue> getIssues(String uriFragment);
	
	public class NullImpl implements IValidationIssueStore {

		@Override
		public void processIssues(List<Issue> issues, IProgressMonitor monitor) {
		}

		@Override
		public void addIssueStoreListener(IValidationIssueStoreListener listener) {
		}

		@Override
		public void removeIssueStoreListener(IValidationIssueStoreListener listener) {
		}

		@Override
		public void connect(Resource resource) {
		}

		@Override
		public void disconnect(Resource resource) {
		}

		@Override
		public List<SCTIssue> getIssues(String uriFragment) {
			return Collections.emptyList();
		}
		
	}
}
