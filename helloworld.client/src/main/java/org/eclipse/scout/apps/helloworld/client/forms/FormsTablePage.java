package org.eclipse.scout.apps.helloworld.client.forms;

import org.eclipse.scout.apps.helloworld.client.forms.FormsTablePage.Table;
import org.eclipse.scout.apps.helloworld.shared.forms.FormsTablePageData;
import org.eclipse.scout.apps.helloworld.shared.forms.IFormsService;
import org.eclipse.scout.rt.client.dto.Data;
import org.eclipse.scout.rt.client.ui.basic.table.AbstractTable;
import org.eclipse.scout.rt.client.ui.basic.table.columns.AbstractStringColumn;
import org.eclipse.scout.rt.client.ui.desktop.outline.pages.AbstractPageWithTable;
import org.eclipse.scout.rt.platform.BEANS;
import org.eclipse.scout.rt.platform.Order;
import org.eclipse.scout.rt.shared.TEXTS;
import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

@Data(FormsTablePageData.class)
public class FormsTablePage extends AbstractPageWithTable<Table> {

	@Override
	protected String getConfiguredTitle() {
		return TEXTS.get("FormsTablePage");
	}

	@Override
	protected void execLoadData(SearchFilter filter) {
		importPageData(BEANS.get(IFormsService.class).getFormsTableData(filter));
	}

	public class Table extends AbstractTable {

		public FormNameColumn getFormNameColumn() {
			return getColumnSet().getColumnByClass(FormNameColumn.class);
		}

		@Order(1000)
		public class FormNameColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("FormName");
			}

			@Override
			protected int getConfiguredWidth() {
				return 100;
			}
		}
		
		
	}
}
