package org.eclipse.scout.apps.helloworld.shared.questions;

import org.eclipse.scout.rt.platform.service.IService;
import org.eclipse.scout.rt.shared.TunnelToServer;
import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

@TunnelToServer
public interface IQuestionsService extends IService {

	QuestionsTablePageData getQuestionsTableData(SearchFilter filter);

	QuestionsFormData prepareCreate(QuestionsFormData formData);

	QuestionsFormData create(QuestionsFormData formData);

	QuestionsFormData load(QuestionsFormData formData);

	QuestionsFormData store(QuestionsFormData formData);
}
