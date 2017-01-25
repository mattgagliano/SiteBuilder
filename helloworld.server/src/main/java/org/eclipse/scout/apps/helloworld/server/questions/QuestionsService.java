package org.eclipse.scout.apps.helloworld.server.questions;

import org.eclipse.scout.apps.helloworld.shared.questions.CreateQuestionsPermission;
import org.eclipse.scout.apps.helloworld.shared.questions.IQuestionsService;
import org.eclipse.scout.apps.helloworld.shared.questions.QuestionsFormData;
import org.eclipse.scout.apps.helloworld.shared.questions.QuestionsTablePageData;
import org.eclipse.scout.apps.helloworld.shared.questions.ReadQuestionsPermission;
import org.eclipse.scout.apps.helloworld.shared.questions.UpdateQuestionsPermission;
import org.eclipse.scout.rt.platform.exception.VetoException;
import org.eclipse.scout.rt.shared.TEXTS;
import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;
import org.eclipse.scout.rt.shared.services.common.security.ACCESS;

public class QuestionsService implements IQuestionsService {

	@Override
	public QuestionsTablePageData getQuestionsTableData(SearchFilter filter) {
		QuestionsTablePageData pageData = new QuestionsTablePageData();
		// TODO [Matt.Gagliano] fill pageData.
		return pageData;
	}

	@Override
	public QuestionsFormData prepareCreate(QuestionsFormData formData) {
		if (!ACCESS.check(new CreateQuestionsPermission())) {
			throw new VetoException(TEXTS.get("AuthorizationFailed"));
		}
		// TODO [Matt.Gagliano] add business logic here.
		return formData;
	}

	@Override
	public QuestionsFormData create(QuestionsFormData formData) {
		if (!ACCESS.check(new CreateQuestionsPermission())) {
			throw new VetoException(TEXTS.get("AuthorizationFailed"));
		}
		// TODO [Matt.Gagliano] add business logic here.
		return formData;
	}

	@Override
	public QuestionsFormData load(QuestionsFormData formData) {
		if (!ACCESS.check(new ReadQuestionsPermission())) {
			throw new VetoException(TEXTS.get("AuthorizationFailed"));
		}
		// TODO [Matt.Gagliano] add business logic here.
		return formData;
	}

	@Override
	public QuestionsFormData store(QuestionsFormData formData) {
		if (!ACCESS.check(new UpdateQuestionsPermission())) {
			throw new VetoException(TEXTS.get("AuthorizationFailed"));
		}
		// TODO [Matt.Gagliano] add business logic here.
		return formData;
	}
}
