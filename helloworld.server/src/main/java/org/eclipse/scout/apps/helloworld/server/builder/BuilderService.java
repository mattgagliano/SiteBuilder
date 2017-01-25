package org.eclipse.scout.apps.helloworld.server.builder;

import org.eclipse.scout.apps.helloworld.shared.builder.BuilderTablePageData;
import org.eclipse.scout.apps.helloworld.shared.builder.IBuilderService;
import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

public class BuilderService implements IBuilderService {

	@Override
	public BuilderTablePageData getBuilderTableData(SearchFilter filter) {
		BuilderTablePageData pageData = new BuilderTablePageData();
		// TODO [Matt.Gagliano] fill pageData.
		return pageData;
	}
}
