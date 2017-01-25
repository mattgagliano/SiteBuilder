package org.eclipse.scout.apps.helloworld.shared.questions;

import java.security.BasicPermission;

public class UpdateQuestionsPermission extends BasicPermission {

	private static final long serialVersionUID = 1L;

	public UpdateQuestionsPermission() {
		super(UpdateQuestionsPermission.class.getSimpleName());
	}
}
