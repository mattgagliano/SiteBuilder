package org.eclipse.scout.apps.helloworld.client.forms;

import java.util.List;

import org.eclipse.scout.rt.client.ui.desktop.outline.AbstractOutline;
import org.eclipse.scout.rt.client.ui.desktop.outline.pages.IPage;
import org.eclipse.scout.rt.shared.TEXTS;

public class FormsOutline extends AbstractOutline {
	
	@Override
	protected void execCreateChildPages(List<IPage<?>> pageList) {
		super.execCreateChildPages(pageList);
		pageList.add(new FormsTablePage());
	}

	@Override
	protected String getConfiguredTitle() {
		return TEXTS.get("FormsOutline");
	}
}
