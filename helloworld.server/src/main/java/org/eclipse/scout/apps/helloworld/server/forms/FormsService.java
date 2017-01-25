package org.eclipse.scout.apps.helloworld.server.forms;

import org.eclipse.scout.apps.helloworld.shared.forms.FormsTablePageData;
import org.eclipse.scout.apps.helloworld.shared.forms.IFormsService;
import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

public class FormsService implements IFormsService {

	@Override
	public FormsTablePageData getFormsTableData(SearchFilter filter) {
		FormsTablePageData pageData = new FormsTablePageData();
		// TODO [Matt.Gagliano] fill pageData.
		return pageData;
	}
}
