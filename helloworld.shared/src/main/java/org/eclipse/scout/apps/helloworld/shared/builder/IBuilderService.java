package org.eclipse.scout.apps.helloworld.shared.builder;

import org.eclipse.scout.rt.platform.service.IService;
import org.eclipse.scout.rt.shared.TunnelToServer;
import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

@TunnelToServer
public interface IBuilderService extends IService {

	BuilderTablePageData getBuilderTableData(SearchFilter filter);
}
