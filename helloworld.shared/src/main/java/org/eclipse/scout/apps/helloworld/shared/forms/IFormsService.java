package org.eclipse.scout.apps.helloworld.shared.forms;

import org.eclipse.scout.rt.platform.service.IService;
import org.eclipse.scout.rt.shared.TunnelToServer;
import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

@TunnelToServer
public interface IFormsService extends IService {

	FormsTablePageData getFormsTableData(SearchFilter filter);
}
