package org.eclipse.scout.apps.helloworld.client.questions;

import java.util.List;

import org.eclipse.scout.apps.helloworld.client.questions.QuestionsTablePage;
import org.eclipse.scout.rt.client.ui.desktop.outline.AbstractOutline;
import org.eclipse.scout.rt.client.ui.desktop.outline.pages.IPage;
import org.eclipse.scout.rt.shared.TEXTS;

public class QuestionsOutline extends AbstractOutline {
	
	@Override
	protected void execCreateChildPages(List<IPage<?>> pageList) {
		super.execCreateChildPages(pageList);
		pageList.add(new QuestionsTablePage());
	}

	@Override
	protected String getConfiguredTitle() {
		return TEXTS.get("QuestionsOutline");
	}
}
