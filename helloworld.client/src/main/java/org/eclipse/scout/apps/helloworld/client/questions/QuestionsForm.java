package org.eclipse.scout.apps.helloworld.client.questions;

import org.eclipse.scout.apps.helloworld.client.questions.QuestionsForm.MainBox.CancelButton;
import org.eclipse.scout.apps.helloworld.client.questions.QuestionsForm.MainBox.OkButton;
import org.eclipse.scout.apps.helloworld.shared.questions.CreateQuestionsPermission;
import org.eclipse.scout.apps.helloworld.shared.questions.IQuestionsService;
import org.eclipse.scout.apps.helloworld.shared.questions.QuestionsFormData;
import org.eclipse.scout.apps.helloworld.shared.questions.UpdateQuestionsPermission;
import org.eclipse.scout.rt.client.dto.FormData;
import org.eclipse.scout.rt.client.ui.form.AbstractForm;
import org.eclipse.scout.rt.client.ui.form.AbstractFormHandler;
import org.eclipse.scout.rt.client.ui.form.fields.button.AbstractCancelButton;
import org.eclipse.scout.rt.client.ui.form.fields.button.AbstractOkButton;
import org.eclipse.scout.rt.client.ui.form.fields.groupbox.AbstractGroupBox;
import org.eclipse.scout.rt.platform.BEANS;
import org.eclipse.scout.rt.platform.Order;
import org.eclipse.scout.rt.shared.TEXTS;

@FormData(value = QuestionsFormData.class, sdkCommand = FormData.SdkCommand.CREATE)
public class QuestionsForm extends AbstractForm {

	@Override
	protected String getConfiguredTitle() {
		// TODO [Matt.Gagliano] verify translation
		return TEXTS.get("Questions");
	}

	public void startModify() {
		startInternalExclusive(new ModifyHandler());
	}

	public void startNew() {
		startInternal(new NewHandler());
	}

	public CancelButton getCancelButton() {
		return getFieldByClass(CancelButton.class);
	}

	public MainBox getMainBox() {
		return getFieldByClass(MainBox.class);
	}

	public OkButton getOkButton() {
		return getFieldByClass(OkButton.class);
	}

	@Order(1000)
	public class MainBox extends AbstractGroupBox {

		@Order(100000)
		public class OkButton extends AbstractOkButton {
		}

		@Order(101000)
		public class CancelButton extends AbstractCancelButton {
		}
	}

	public class ModifyHandler extends AbstractFormHandler {

		@Override
		protected void execLoad() {
			IQuestionsService service = BEANS.get(IQuestionsService.class);
			QuestionsFormData formData = new QuestionsFormData();
			exportFormData(formData);
			formData = service.load(formData);
			importFormData(formData);

			setEnabledPermission(new UpdateQuestionsPermission());
		}

		@Override
		protected void execStore() {
			IQuestionsService service = BEANS.get(IQuestionsService.class);
			QuestionsFormData formData = new QuestionsFormData();
			exportFormData(formData);
			service.store(formData);
		}
	}

	public class NewHandler extends AbstractFormHandler {

		@Override
		protected void execLoad() {
			IQuestionsService service = BEANS.get(IQuestionsService.class);
			QuestionsFormData formData = new QuestionsFormData();
			exportFormData(formData);
			formData = service.prepareCreate(formData);
			importFormData(formData);

			setEnabledPermission(new CreateQuestionsPermission());
		}

		@Override
		protected void execStore() {
			IQuestionsService service = BEANS.get(IQuestionsService.class);
			QuestionsFormData formData = new QuestionsFormData();
			exportFormData(formData);
			service.create(formData);
		}
	}
}
