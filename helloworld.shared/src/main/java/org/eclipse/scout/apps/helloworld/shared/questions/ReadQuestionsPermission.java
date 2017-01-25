package org.eclipse.scout.apps.helloworld.shared.questions;

import java.security.BasicPermission;

public class ReadQuestionsPermission extends BasicPermission {

	private static final long serialVersionUID = 1L;

	public ReadQuestionsPermission() {
		super(ReadQuestionsPermission.class.getSimpleName());
	}
}
