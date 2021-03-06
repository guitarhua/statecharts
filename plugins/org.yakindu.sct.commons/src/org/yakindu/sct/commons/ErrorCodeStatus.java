/**
 * Copyright (c) 2019 committers of YAKINDU and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * 	committers of YAKINDU - initial API and implementation
 * 
 */
package org.yakindu.sct.commons;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

public class ErrorCodeStatus extends Status implements IStatus {

	private final String errorCode;

	public ErrorCodeStatus(int severity, String pluginId, String message, String errorCode) {
		super(severity, pluginId, message);
		this.errorCode = errorCode;
	}
	
	public String getErrorCode() {
		return errorCode;
	}
}
