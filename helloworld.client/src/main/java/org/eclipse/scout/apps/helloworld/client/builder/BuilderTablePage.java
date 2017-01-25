package org.eclipse.scout.apps.helloworld.client.builder;

import org.eclipse.scout.apps.helloworld.client.builder.BuilderTablePage.Table;
import org.eclipse.scout.apps.helloworld.shared.builder.BuilderTablePageData;
import org.eclipse.scout.apps.helloworld.shared.builder.IBuilderService;
import org.eclipse.scout.rt.client.dto.Data;
import org.eclipse.scout.rt.client.ui.basic.table.AbstractTable;
import org.eclipse.scout.rt.client.ui.basic.table.columns.AbstractStringColumn;
import org.eclipse.scout.rt.client.ui.basic.table.columns.IColumn;
import org.eclipse.scout.rt.client.ui.basic.table.customizer.AbstractTableCustomizer;
import org.eclipse.scout.rt.client.ui.basic.table.customizer.ITableCustomizer;
import org.eclipse.scout.rt.client.ui.desktop.outline.pages.AbstractPageWithTable;
import org.eclipse.scout.rt.platform.BEANS;
import org.eclipse.scout.rt.platform.Order;
import org.eclipse.scout.rt.platform.util.collection.OrderedCollection;
import org.eclipse.scout.rt.shared.TEXTS;
import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

@Data(BuilderTablePageData.class)
public class BuilderTablePage extends AbstractPageWithTable<Table> {

	protected String pageName;
		
	public BuilderTablePage() {
		
		this("default_pageName");
	}
	
	public BuilderTablePage(String pageName) {
	
		super();		
		this.pageName = pageName;
	}
	
	@Override
	protected String getConfiguredTitle() {
		return pageName;
	}

	@Override
	protected void execLoadData(SearchFilter filter) {
		importPageData(BEANS.get(IBuilderService.class).getBuilderTableData(filter));
	}
	
/*	private IColumn<?> createDynamicColumn(final String label) {
		return new AbstractStringColumn() {
			@Override
			protected String getConfiguredHeaderText() {
				return label;
			}
			
			@Override
			protected int getConfiguredWidth() {
				return 120;
			}
		};
	}
	
	private void updateDynamicColumns() {
		//Table table = getTable();
		
		//table.resetColumnOrder();
	}*/
	
	public class Table extends AbstractTable {
		
		//OrderedCollection<IColumn<?>> columnList;
		
		@Override
		protected ITableCustomizer createTableCustomizer() {
			return new BtcCustomizer();
		}		
		
		/*@Override
		protected void injectColumnsInternal(OrderedCollection<IColumn<?>> columnList) {
			columnList.addLast(createDynamicColumn("from tablepage"));
			columnList.addLast(createDynamicColumn("from tablepage2"));
			
			updateDynamicColumns();
		}*/

		public CityColumn getCityColumn() {	
			return getColumnSet().getColumnByClass(CityColumn.class);
		}

		public NameColumn getNameColumn() {
			return getColumnSet().getColumnByClass(NameColumn.class);
		}

		@Order(1000)
		public class NameColumn extends AbstractStringColumn {
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("Name");
			}

			@Override
			protected int getConfiguredWidth() {
				return 100;
			}
		}

		@Order(2000)
		public class CityColumn extends AbstractStringColumn {
					
			@Override
			protected String getConfiguredHeaderText() {
				return TEXTS.get("City");
			}

			@Override
			protected int getConfiguredWidth() {
				return 100;
			}
		}	
	}
	
	public class BtcCustomizer extends AbstractTableCustomizer {
		
		public BtcCustomizer() {

	//		List<IColumn<?>> columnList = Table.this.getColumns();
		}
		@Override
		public String getPreferencesKey() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public void injectCustomColumns(OrderedCollection<IColumn<?>> columnList) {
					
			columnList.addLast(createDynamicColumn("btc column"));
		}
		
		private IColumn<?> createDynamicColumn(final String label) {
			return new AbstractStringColumn() {
				@Override
				protected String getConfiguredHeaderText() {
					return label;
				}
				
				@Override
				protected int getConfiguredWidth() {
					return 120;
				}
				
				@Override
				public String getColumnId() {
					return (label);
				}
			};
		}
		
		@Override
		public void addColumn(IColumn<?> insertAfterColumn) {
			
			super.addColumn(insertAfterColumn);
			
		}
	}
}
