package org.eclipse.scout.apps.helloworld.shared.questions;

import java.security.BasicPermission;

public class CreateQuestionsPermission extends BasicPermission {

	private static final long serialVersionUID = 1L;

	public CreateQuestionsPermission() {
		super(CreateQuestionsPermission.class.getSimpleName());
	}
}
