package org.eclipse.scout.apps.helloworld.client.builder;

import java.util.List;

import org.eclipse.scout.rt.client.ui.desktop.outline.AbstractOutline;
import org.eclipse.scout.rt.client.ui.desktop.outline.pages.IPage;
import org.eclipse.scout.rt.shared.TEXTS;

public class BuilderOutline extends AbstractOutline {
	
	@Override
	protected void execCreateChildPages(List<IPage<?>> pageList) {
		super.execCreateChildPages(pageList);
		pageList.add(new BuilderTablePage("ChildPage10"));
		pageList.add(new BuilderTablePage("ChildPage20"));
	}

	@Override
	protected String getConfiguredTitle() {
		return TEXTS.get("SiteBuilder");
	}
}
