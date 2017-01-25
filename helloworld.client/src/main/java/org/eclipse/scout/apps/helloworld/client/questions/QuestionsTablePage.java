package org.eclipse.scout.apps.helloworld.client.questions;

import java.util.Set;

import org.eclipse.scout.apps.helloworld.client.questions.QuestionsTablePage.Table;
import org.eclipse.scout.apps.helloworld.shared.questions.IQuestionsService;
import org.eclipse.scout.apps.helloworld.shared.questions.QuestionsTablePageData;
import org.eclipse.scout.rt.client.dto.Data;
import org.eclipse.scout.rt.client.ui.action.menu.AbstractMenu;
import org.eclipse.scout.rt.client.ui.action.menu.IMenuType;
import org.eclipse.scout.rt.client.ui.action.menu.TableMenuType;
import org.eclipse.scout.rt.client.ui.basic.table.AbstractTable;
import org.eclipse.scout.rt.client.ui.basic.table.columns.AbstractBooleanColumn;
import org.eclipse.scout.rt.client.ui.basic.table.columns.AbstractStringColumn;
import org.eclipse.scout.rt.client.ui.desktop.outline.pages.AbstractPageWithTable;
import org.eclipse.scout.rt.platform.BEANS;
import org.eclipse.scout.rt.platform.Order;
import org.eclipse.scout.rt.platform.util.CollectionUtility;
import org.eclipse.scout.rt.shared.TEXTS;
import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

@Data(QuestionsTablePageData.class)
public class QuestionsTablePage extends AbstractPageWithTable<Table> {

	@Override
	protected String getConfiguredTitle() {
		return TEXTS.get("QuestionsTablePage");
	}

	@Override
	protected void execLoadData(SearchFilter filter) {
		importPageData(BEANS.get(IQuestionsService.class).getQuestionsTableData(filter));
	}

	public class Table extends AbstractTable {

		public Q1Column getQ1Column() {
			return getColumnSet().getColumnByClass(Q1Column.class);
		}

		public PromptColumn getPromptColumn() {
			return getColumnSet().getColumnByClass(PromptColumn.class);
		}

		@Order(1000)
		public class PromptColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("Prompt");
			}

			@Override
			protected int getConfiguredWidth() {
				return 100;
			}
		}

		@Order(2000)
		public class Q1Column extends AbstractBooleanColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("Q1");
			}

			@Override
			protected int getConfiguredWidth() {
				return 100;
			}
			
			@Override
			protected boolean getConfiguredEditable() {
				return true;
			}
		}

		@Order(1000)
		public class NewMenu extends AbstractMenu {
			@Override
			protected String getConfiguredText() {
				return TEXTS.get("New");
			}

			@Override
			protected Set<? extends IMenuType> getConfiguredMenuTypes() {
				return CollectionUtility.hashSet(TableMenuType.SingleSelection, TableMenuType.EmptySpace);
			}

			@Override
			protected void execAction() {
			}
		}
		
		
	}
}
